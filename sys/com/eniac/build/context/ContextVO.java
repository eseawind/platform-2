package com.eniac.build.context;


/**
 * 上下文VO
 * 
 * @author yinfx 2014年8月19日 下午11:58:24
 */
public class ContextVO {
	private String class_name;
	private String class_desc;
	private String destDir;
	private String fxmlfilename;
	
	public String getFxmlfilename() {
		return fxmlfilename;
	}
	public void setFxmlfilename(String fxmlfilename) {
		this.fxmlfilename = fxmlfilename;
	}
	public String getClass_name() {
		return class_name;
	}
	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
	public String getClass_desc() {
		return class_desc;
	}
	public void setClass_desc(String class_desc) {
		this.class_desc = class_desc;
	}
	public String getDestDir() {
		return destDir;
	}
	public void setDestDir(String destDir) {
		this.destDir = destDir;
	}

}
