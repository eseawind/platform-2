package com.eniac.build.context;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.eniac.ui.mgr.BaseCtx;
import com.eniac.utils.UIFactory;
import com.sun.codemodel.JBlock;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JConditional;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JExpr;
import com.sun.codemodel.JExpression;
import com.sun.codemodel.JFieldRef;
import com.sun.codemodel.JFieldVar;
import com.sun.codemodel.JInvocation;
import com.sun.codemodel.JMethod;
import com.sun.codemodel.JMod;
import com.sun.codemodel.JType;
import com.sun.codemodel.JVar;

/**
 * 编译工具类
 * 
 * @author yinfx 2014年8月19日 下午11:48:27
 */
public class ContextUtil {
	private static final String CONF_BUNDLE = "conf/bundle";
	private static final String BUNDLE = "bundle";
	private static ContextUtil instance;
	public static final String DEST_PACKAGE = "com.eniac.ui.ctx";
	public static final String FXML = "fxml";

	/**
	 * 单例模式
	 * 
	 * @return
	 */
	public static ContextUtil getInstance() {
		if (instance == null) {
			instance = new ContextUtil();
		}
		return instance;
	}

	private ContextUtil() {
	}

	/**
	 * 生成上下文VO代码
	 * 
	 * @param vo 上下文VO对象
	 * @throws Exception
	 */
	public void genContextVOCode(ContextVO vo) throws Exception {
		File destDir = new File(vo.getDestDir());
		JCodeModel model = new JCodeModel();

		JType type = model.parseType(vo.getClass_name());
		JDefinedClass dc = model._class(vo.getClass_name());
		dc._extends(BaseCtx.class);
		dc.javadoc().add(vo.getClass_desc());// 添加类注释
		// 定义静态成员变量
		JMethod constructor = dc.constructor(JMod.PRIVATE);
		constructor.javadoc().add("私有构造函数");
		// 定义静态成员变量currInstance
		JFieldVar field = dc.field(JMod.PUBLIC+JMod.STATIC, type, "currInstance");
		//newInstance方法
		JMethod newInstanceMethod = dc.method(JMod.PUBLIC+JMod.STATIC,type,"newInstance");
		newInstanceMethod.javadoc().add("获取新对象");
		JBlock body = newInstanceMethod.body();
		body.assign(field, JExpr._new(type));
		body._return(field);

		//initialize方法
		JMethod initializeMethod = dc.method(JMod.PUBLIC,model.VOID,"initialize");
		initializeMethod.annotate(Override.class);
		initializeMethod.javadoc().add("界面初始化");

		constructor.body().invoke(JExpr.ref("this"), initializeMethod);
		//重写父类方法
		String ctrlClassName = ControllerlUtil.getInstance().getCtrls().get(vo.getFxmlfilename());
		if(ctrlClassName != null){
			JType ctrlClassType = model.parseType(ctrlClassName);
			JFieldRef thisField = JExpr.ref("this");
			//重写setCtrl方法
			JMethod setCtrlMethod = dc.method(JMod.PUBLIC,model.VOID,"setCtrl");
			JVar param = setCtrlMethod.param(ctrlClassType, "ctrl");
			setCtrlMethod.javadoc().add("设置控制器方法");
			JBlock setCtrlMethodBody = setCtrlMethod.body();
			JInvocation invoke = JExpr.ref("super").invoke("setCtrl");
			invoke.arg(param);
			setCtrlMethodBody.add(invoke);
			//重写getCtrl方法
			JMethod getCtrlMethod = dc.method(JMod.PUBLIC,ctrlClassType,"getCtrl");
			getCtrlMethod.javadoc().add("设置控制器方法");
			JBlock getCtrlMethodBody = getCtrlMethod.body();
			getCtrlMethodBody._return(JExpr.cast(ctrlClassType, JExpr.ref("super").invoke("getCtrl")));
		}
		model.build(destDir);
	}
	/**
	 * 生成单例方法
	 * @param type
	 * @param dc
	 */
	private void genSingleton(JType type, JDefinedClass dc) {
		JFieldVar instance = dc.field(JMod.PRIVATE + JMod.STATIC, type, "instance");
		instance.javadoc().add("单例对象"); // 定义单例类 Singleton 的构造函数
		dc.constructor(JMod.PRIVATE); // 生成 Singleton 类的成员方法getInstanceMethod
		JMethod getInstanceMethod = dc.method(JMod.PUBLIC + JMod.STATIC, type, "getInstance");
		getInstanceMethod.javadoc().add("单例方法");
		getInstanceMethod.javadoc().addReturn().add("单例对象");
		JBlock getInstanceBody = getInstanceMethod.body();
		JFieldRef fieldRef = JExpr.ref("instance");
		JConditional conditionIf = getInstanceBody._if(fieldRef.eq(JExpr._null()));
		JBlock thenPart = conditionIf._then();
		thenPart.assign(fieldRef, JExpr._new(type));
		getInstanceBody._return(fieldRef);
	}
	/**
	 * 批量生成上下文VO代码
	 * @param vos 上下文VO集合
	 * @throws Exception
	 */
	public void genContextVOCodes(List<ContextVO> vos) throws Exception {
		System.out.println("\n开始生成所有FXML上下文类源代码......");
		for (ContextVO vo : vos) {
			genContextVOCode(vo);
		}
		System.out.println("生成所有FXML上下文类源代码成功！\n");
	}

	public void processCtxes(String dir) throws Exception {
		List<ContextVO> ctxVOs = new ArrayList<ContextVO>();
		Map<String, String> bundleNames = new HashMap<String, String>();
		boolean breakflag = false;
		File directory = new File(dir);
		if (directory.isDirectory()) {
			for (File file : directory.listFiles()) {
				if (FXML.equals(file.getName())) {// fxml文件
					for (File fxmlfile : file.listFiles()) {
						if(ControllerlUtil.getInstance().isFullflag()){
							beforeGenContextVO(ctxVOs, bundleNames, fxmlfile);
						}else{
							for (String fileName : ControllerlUtil.getInstance().getGenFiles()) {
								if(fileName != null && fileName.equalsIgnoreCase(fxmlfile.getName())){
									beforeGenContextVO(ctxVOs, bundleNames, fxmlfile);
								}
							}
						}
					}
					
					System.out.println("\n开始生成所有bundle文件......");
					for (String bundle : bundleNames.values()) {//生成bundle文件
						File destFile = new File(new File(new File(CONF_BUNDLE).getAbsolutePath()), bundle + ".properties");
						Properties pro = getBundleProperties(bundle+UIFactory.FXML_EXTENSION);
						pro.store(new FileOutputStream(destFile), "This is a bundle file");
						System.out.println(destFile.getPath());
						
					}
					System.out.println("生成所有bundle文件成功！\n");
					breakflag = true;
				} else {
					if (breakflag) {
						break;
					}
				}
			}
		}
		genContextVOCodes(ctxVOs);
	}
	/**
	 * 生成代码前过滤
	 * @param ctxVOs
	 * @param bundleNames
	 * @param fxmlfile
	 * @throws Exception
	 */
	private void beforeGenContextVO(List<ContextVO> ctxVOs, Map<String, String> bundleNames, File fxmlfile) throws Exception {
		if(ControllerlUtil.getInstance().filterFXMLFile(fxmlfile)){
			genContextVO(ctxVOs, bundleNames, fxmlfile);
		}
	}
	/**
	 * 生成ContextVO
	 * @param ctxVOs 上下文集合
	 * @param bundleNames bundles文件集合
	 * @param fxmlfile fxml文件对象
	 */
	private void genContextVO(List<ContextVO> ctxVOs, Map<String, String> bundleNames, File fxmlfile) {
		ContextVO vo = new ContextVO();
		String className = fxmlfile.getName().substring(0, fxmlfile.getName().lastIndexOf("."));
		vo.setClass_desc("类" + className);
		vo.setClass_name(DEST_PACKAGE + "." + className);
		vo.setDestDir("sys");
		vo.setFxmlfilename(fxmlfile.getName());
		ctxVOs.add(vo);
		bundleNames.put(className, className);
	}
	/**
	 * 获取bundle文件
	 * @param key 键值
	 * @return bundle文件对象
	 */
	private Properties getBundleProperties(String key) {
		Properties pro = new Properties();
		if(key != null){
			Map<String, String> map = ControllerlUtil.getInstance().getBundleAttrs().get(key);
			if(map != null && !map.isEmpty()){
				for (String k : map.values()) {
					pro.put(k, "");
				}
			}
		}
		return pro;
	}
}
