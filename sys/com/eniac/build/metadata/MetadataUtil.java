package com.eniac.build.metadata;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

import com.eniac.utils.StringUtils;
import com.eniac.vo.base.BaseVO;
import com.sun.codemodel.JAnnotationUse;
import com.sun.codemodel.JBlock;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JExpr;
import com.sun.codemodel.JFieldRef;
import com.sun.codemodel.JFieldVar;
import com.sun.codemodel.JInvocation;
import com.sun.codemodel.JMethod;
import com.sun.codemodel.JMod;
import com.sun.codemodel.JType;
import com.sun.codemodel.JVar;

/**
 * 编译工具类
 * @author yinfx
 * 2014年8月19日  下午11:48:27
 */
public class MetadataUtil {
	/**
	 * 标题开始显示行
	 */
	private static int title_startrow = 4;
	/**
	 * 内容开始显示行
	 */
	private static int content_startrow = 5;
	/**
	 * 常量TRUE
	 */
	public static final String TRUE = "true";
	/**
	 * 常量FALSE
	 */
	public static final String FALSE = "false";
	private static MetadataUtil instance;
	/**
	 * 单例模式
	 * @return
	 */
	public static MetadataUtil getInstance() {
		if(instance == null){
			instance = new MetadataUtil();
		}
		return instance;
	}
	private MetadataUtil(){}
	/**
	 * 获取VO集合
	 * 读取源文件下/META-INF/中的template.xls配置数据
	 */
	public List<MetadataVO> getBuildClassVOs(String filename) throws Exception{
		List<MetadataVO> classVOs = new ArrayList<MetadataVO>();
		String path = this.getClass().getResource("/metadata/"+filename).getPath();  
		Workbook book = Workbook.getWorkbook(new File(path));
		for (Sheet sheet : book.getSheets()) {
			Map<Integer,String> maps = getMaps(sheet);
			classVOs.add(getBuildClassVO(sheet, maps));			
		}
		return classVOs;
	}
	/**
	 * 获取VO
	 * @param sheet
	 * @param maps
	 * @return
	 */
	public MetadataVO getBuildClassVO(Sheet sheet, Map<Integer, String> maps) {
		MetadataVO metadataVO = setCommonData(sheet);
		for (int i = getContentStartrow(sheet); i < sheet.getRows(); i++) {
			MetadataItemVO itemVO = new MetadataItemVO();
			for (int j = 0; j < sheet.getColumns(); j++) {
				Cell cell = sheet.getCell(j, i);//(列,行)
				if(i == 0){//设置第一行表体数据
					String contents = cell.getContents();
					if(contents != null){
						maps.put(j, contents.toUpperCase());
					}
				}else{//获取其他数据
					itemVO.set(maps.get(j), cell.getContents());
				}				
			}
			metadataVO.addField(itemVO);
		}
		return metadataVO;
	}
	private int getContentStartrow(Sheet sheet) {
		
		return 0;
	}
	/**
	 * 设置公共信息
	 * @param sheet
	 * @return
	 */
	private MetadataVO setCommonData(Sheet sheet) {
		MetadataVO classVO = new MetadataVO();
		String class_name = sheet.getCell(1, 0).getContents();//(列,行)
		String metadata_desc = sheet.getCell(1, 1).getContents();//(列,行)
		String table_name = sheet.getCell(1, 2).getContents();//(列,行)
		String module_name = sheet.getCell(1, 3).getContents();//(列,行)
		classVO.setClass_name(class_name);
		classVO.setTable_name(table_name);
		classVO.setMetadata_desc(metadata_desc);
		classVO.setModule_name(module_name);
		return classVO;
	}
	/**
	 * 生成SuperVO代码
	 * @param classVOs 模板VO集合
	 * @throws Exception
	 */
	public void genSuperVOCode(List<MetadataVO> classVOs) throws Exception{
		for (MetadataVO classVO : classVOs) {
			genSuperVOCode(classVO);
		}
	}
	/**
	 * 生成SuperVO代码
	 * @param classVO 模板VO
	 * @throws Exception
	 */
	public void genSuperVOCode(MetadataVO classVO) throws Exception{
		File destDir = new File(classVO.getModule_name());
		JCodeModel model = new JCodeModel();
		JDefinedClass _class = model._class(classVO.getClass_name());
		_class._extends(BaseVO.class);
		_class.annotate(Entity.class);
		JAnnotationUse tableAnnotate = _class.annotate(Table.class);
		tableAnnotate.param(String.valueOf("name"), classVO.getTable_name());
		_class.javadoc().add(classVO.getMetadata_desc());
		// 设置属性
		List<MetadataItemVO> fields = classVO.getFields();
		for (MetadataItemVO fieldVO : fields) {
			//生成常量
			JFieldVar constant = _class.field(JMod.PUBLIC+JMod.STATIC+JMod.FINAL, String.class, fieldVO.getField().toUpperCase(), JExpr.lit(fieldVO.getField()));
			constant.javadoc().add(fieldVO.getDisplay_column());
			//生成方法
			JMethod getMethod = _class.method(JMod.PUBLIC, model.parseType(fieldVO.getData_type()), String.valueOf("get")+StringUtils.getInstance().toUpperCaseFirstOne(fieldVO.getField()));
			getMethod.javadoc().add(String.valueOf("获取"+fieldVO.getDisplay_field()));
			JBlock getMethodBody = getMethod.body();
			JFieldRef ref = JExpr.ref("super");
			JFieldRef datatype = JExpr.ref(fieldVO.getData_type());
			
			JInvocation invoke = datatype.invoke("valueOf").arg(ref.invoke("get").arg(JExpr.ref("this").ref(constant)).invoke("toString"));
			if(MetadataUtil.TRUE.equals(fieldVO.getPrimary())){
				getMethod.annotate(Id.class);
			}else if(MetadataUtil.FALSE.equals(fieldVO.getPrimary())){
				JAnnotationUse annotate = getMethod.annotate(Column.class);
				annotate.param(String.valueOf("length"), Integer.valueOf(fieldVO.getLength()));
				annotate.param(String.valueOf("nullable"), Boolean.valueOf(fieldVO.getNullable().toLowerCase()));
				annotate.param(String.valueOf("name"), String.valueOf(fieldVO.getColumn()));
			}
			getMethodBody._return(invoke);
			
			JMethod setMethod = _class.method(JMod.PUBLIC, model.VOID, String.valueOf("set")+StringUtils.getInstance().toUpperCaseFirstOne(fieldVO.getField()));
			setMethod.javadoc().add(String.valueOf("设置"+fieldVO.getDisplay_field()));
			JVar param = setMethod.param(model.parseType(fieldVO.getData_type()), fieldVO.getField());
			JBlock setMethodBody = setMethod.body();
			JInvocation arg = ref.invoke("set").arg(JExpr.ref("this").ref(constant)).arg(param);
			setMethodBody.add(arg);
		}
		model.build(destDir);
	}
	/**
	 * 生成POJO代码
	 * @param classVO 模板VO集合
	 * @throws Exception
	 */
	public void genPOJOCode(List<MetadataVO> classVOs) throws Exception{
		for (MetadataVO classVO : classVOs) {
			genPOJOCode(classVO);
		}
	}
	/**
	 * 生成POJO代码
	 * @param classVO 模板VO
	 * @throws Exception
	 */
	public void genPOJOCode(MetadataVO classVO) throws Exception{
		File destDir = new File(classVO.getModule_name());
		JCodeModel model = new JCodeModel();
		JDefinedClass _class = model._class(classVO.getClass_name());

		_class.annotate(Entity.class);
		JAnnotationUse tableAnnotate = _class.annotate(Table.class);
		tableAnnotate.param(String.valueOf("name"), classVO.getTable_name());
		_class.javadoc().add(classVO.getMetadata_desc());
		// 设置属性
		List<MetadataItemVO> fields = classVO.getFields();
		for (MetadataItemVO fieldVO : fields) {
			//生成常量
			JFieldVar constant = _class.field(JMod.PUBLIC+JMod.STATIC+JMod.FINAL, String.class, fieldVO.getField().toUpperCase(), JExpr.lit(fieldVO.getField()));
			constant.javadoc().add(fieldVO.getDisplay_column());
			//生成变量
			JType fieldType = model.parseType(fieldVO.getData_type());
			JFieldVar field = _class.field(JMod.PRIVATE, fieldType, fieldVO.getField());
			field.javadoc().add("变量:"+fieldVO.getDisplay_field());
			if(MetadataUtil.TRUE.equals(fieldVO.getPrimary())){
				field.annotate(Id.class);
			}else if(MetadataUtil.FALSE.equals(fieldVO.getPrimary())){
				JAnnotationUse annotate = field.annotate(Column.class);
				annotate.param(String.valueOf("length"), Integer.valueOf(fieldVO.getLength()));
				annotate.param(String.valueOf("nullable"), Boolean.valueOf(fieldVO.getNullable().toLowerCase()));
				annotate.param(String.valueOf("name"), String.valueOf(fieldVO.getColumn()));
				if(MetadataUtil.TRUE.equals(fieldVO.getTransi())){
					field.annotate(Transient.class);
				}
			}
			//生成方法
			JMethod getMethod = _class.method(JMod.PUBLIC, fieldType, String.valueOf("get")+StringUtils.getInstance().toUpperCaseFirstOne(fieldVO.getField()));
			getMethod.javadoc().add(String.valueOf("获取"+fieldVO.getDisplay_field()));
			JBlock getMethodBody = getMethod.body();
			getMethodBody._return(JExpr.ref("this").ref(field));
			
			JMethod setMethod = _class.method(JMod.PUBLIC, model.VOID, String.valueOf("set")+StringUtils.getInstance().toUpperCaseFirstOne(fieldVO.getField()));
			setMethod.javadoc().add(String.valueOf("设置"+fieldVO.getDisplay_field()));
			JVar param = setMethod.param(fieldType, fieldVO.getField());
			JBlock setMethodBody = setMethod.body();
			setMethodBody.assign(JExpr.ref("this").ref(field), param);
		}
		model.build(destDir);
	}
	/**
	 * 获取提示信息
	 * @param sheet
	 * @return
	 */
	private Map<Integer,String> getMaps(Sheet sheet) {
		Map<Integer,String> maps = new HashMap<Integer,String>();
		for (int j = 0; j < sheet.getColumns(); j++) {
			Cell cell = sheet.getCell(j, title_startrow);//(列,行)
			String contents = cell.getContents();
			if(contents != null){
				maps.put(j, contents.toUpperCase());
			}		
		}
		return maps;
		
	}
}
