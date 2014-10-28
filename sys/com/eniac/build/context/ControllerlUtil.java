package com.eniac.build.context;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javafx.event.Event;
import javafx.fxml.FXML;

import org.jdom2.Attribute;
import org.jdom2.Content;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

import com.eniac.utils.StringUtils;
import com.eniac.utils.UIFactory;
import com.sun.codemodel.JBlock;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JExpr;
import com.sun.codemodel.JFieldVar;
import com.sun.codemodel.JMethod;
import com.sun.codemodel.JMod;
import com.sun.codemodel.JType;
import com.sun.codemodel.JVar;

/**
 * Ctrl类生成工具类
 * 
 * @author yinfx 2014年9月5日 下午1:49:12 version 1.0
 */
public class ControllerlUtil {
	private boolean fullflag = false;
	public static final String CONTROLLER = "controller";
	public static final String ID = "id";
	public static final String PROCESSING_INSTRUCTION = "ProcessingInstruction";
	public static final String DEST_DIR = "sys";

	private ControllerlUtil() {
	}
	private Map<String,Map<String,String>> bundleAttrs = new HashMap<String, Map<String,String>>();
	private Map<String,String> ctrls = new HashMap<String, String>();
	private List<String> genFiles = Arrays.asList("AutoFormPaneCtx.fxml");
	private List<String> filterFiles = Arrays.asList("BasePaneMainCtx.fxml,BasePaneLoginCtx.fxml");
	private List<String> imports = new ArrayList<String>();
	private Map<String, String> nodesmap = new HashMap<String, String>();
	private String controllerClassName;
	private Map<String,String> ctrlMethods = new HashMap<String,String>();

	public boolean isFullflag() {
		return fullflag;
	}

	public void setFullflag(boolean fullflag) {
		this.fullflag = fullflag;
	}

	public List<String> getGenFiles() {
		return genFiles;
	}

	public void setGenFiles(List<String> genFiles) {
		this.genFiles = genFiles;
	}
	private static ControllerlUtil instance;

	public Map<String, String> getCtrls() {
		return ctrls;
	}

	public void setCtrls(Map<String, String> ctrls) {
		this.ctrls = ctrls;
	}
	public static ControllerlUtil getInstance() {
		return instance == null ? instance = new ControllerlUtil() : instance;
	}
	
	public Map<String, Map<String, String>> getBundleAttrs() {
		return bundleAttrs;
	}


	public void setBundleAttrs(Map<String, Map<String, String>> bundleAttrs) {
		this.bundleAttrs = bundleAttrs;
	}


	public void processFXML(String file) throws Exception {
		Document doc = new SAXBuilder().build(ControllerlUtil.class.getResource(UIFactory.FXML_DIR + file));

		for (Content content : doc.getContent()) {
			if (PROCESSING_INSTRUCTION.equals(content.getCType().toString())) {
				imports.add(content.getValue());
			}
		}
		getNodes(doc.getRootElement(),file);
		genCtrlCode();
		reset();
	}

	private void reset() {
		imports.clear();
		nodesmap.clear();
		ctrlMethods.clear();
		controllerClassName = null;
	}

	public void processFXMLs(String dir) throws Exception {
		System.out.println("\n开始生成FXML控制类源代码......");
		File directory = new File(dir);
		if(directory.isDirectory()){
			for (File file : directory.listFiles()) {
				if(ContextUtil.FXML.equals(file.getName())){
					for (File fxmlfile :  file.listFiles()) {
						if(fullflag){
							if(filterFXMLFile(fxmlfile)){
								processFXML(fxmlfile.getName());
							}
						}else{
							for (String fileName : genFiles) {
								if(fileName != null && fileName.equalsIgnoreCase(fxmlfile.getName())){
//									processFXML(fxmlfile.getName());
									if(filterFXMLFile(fxmlfile)){
										processFXML(fxmlfile.getName());
									}
								}
							}
						}
					}
					break;
				}	
			}
		}
		System.out.println("生成控制类源代码成功！\n");
	}
	/**
	 * 过滤fxml文件
	 * @param fxmlfile
	 * @throws Exception
	 */
	public boolean filterFXMLFile(File fxmlfile) throws Exception {
		boolean passflag = true; 
		for (String fileName : filterFiles) {
			if(fileName != null && fxmlfile != null){
				if(fileName.equalsIgnoreCase(fxmlfile.getName())){
					passflag = false;
					break;
				}else if(fxmlfile.getName().endsWith("_bak.fxml")){
					passflag = false;
					break;
				}	
			}
		}
		return passflag;
	}

	private void getNodes(Element rootElement,String file) {
		lookforAttrs(rootElement,file);
		for (Element element : rootElement.getChildren()) {
			lookforAttrs(element,file);
			if (element.getChildren() != null && !element.getChildren().isEmpty()) {
				getNodes(element,file);
			}
		}
	}

	private void lookforAttrs(Element element,String file) {
		List<Attribute> attributes = element.getAttributes();
		for (Attribute attr : attributes) {
			if (attr != null) {
				String value = attr.getValue();
				if(value != null && value.startsWith("%")){
					Map<String, String> map = bundleAttrs.get(file);
					if(map == null){
						map = new HashMap<String,String>();
						bundleAttrs.put(file, map);
					}
					String key = value.replaceFirst("%", "");
					map.put(key,key);
				}
				if (ID.equalsIgnoreCase(attr.getName())) {
					nodesmap.put(attr.getValue(), element.getName());
				}
				if (CONTROLLER.equalsIgnoreCase(attr.getName())) {
					controllerClassName = attr.getValue();
					ctrls.put(file, controllerClassName);
				}
				if (attr.getName() != null  && attr.getName().startsWith("on")) {
					if(attr.getValue() != null && attr.getValue().startsWith("#")){
						String methodName = attr.getValue().replaceFirst("#", "");
						ctrlMethods.put(methodName,methodName);
					}
				}
			}
		}
	}
	private void genCtrlCode() throws Exception {
		File destDir = new File(DEST_DIR);
		JCodeModel model = new JCodeModel();
		JDefinedClass _class = model._class(controllerClassName);
		_class.getPackage().setImportstmts(imports);
		for (Entry<String, String> entry : nodesmap.entrySet()) {
			String id = entry.getKey();// 控件唯一标识
			String type = entry.getValue();// 类型

			// 生成变量
			JType fieldType = model.parseType(type);
			JFieldVar field = _class.field(JMod.PRIVATE, fieldType, id);
			field.javadoc().add("字段:" + id);
			field.annotate(FXML.class);
			// 生成方法
			JMethod getMethod = _class.method(JMod.PUBLIC, fieldType, String.valueOf("get") + StringUtils.getInstance().toUpperCaseFirstOne(id));
			getMethod.javadoc().add(String.valueOf("获取" + id));
			JBlock getMethodBody = getMethod.body();
			getMethodBody._return(JExpr.ref("this").ref(field));

			JMethod setMethod = _class.method(JMod.PUBLIC, model.VOID, String.valueOf("set") + StringUtils.getInstance().toUpperCaseFirstOne(id));
			setMethod.javadoc().add(String.valueOf("设置" + id));
			JVar param = setMethod.param(fieldType, id);
			JBlock setMethodBody = setMethod.body();
			setMethodBody.assign(JExpr.ref("this").ref(field), param);
		}
		genCtrlMethods(model,_class);
		model.build(destDir);
		
	}
	/**
	 * 生成ctrl类方法
	 * @param _class 
	 */
	private void genCtrlMethods(JCodeModel model,JDefinedClass _class) {
		//@FXMLpublic void login(ActionEvent event){}
		for (String methodName : ctrlMethods.values()) {
			JMethod method = _class.method(JMod.PUBLIC, model.VOID, methodName);
			method.javadoc().add("FXML控制类方法");
			method.annotate(FXML.class);
			method.param(Event.class, "event");
		}
		
	}
}
