package com.eniac.build.metadata;

import java.util.ArrayList;
import java.util.List;

/**
 * 元数据VO
 * 
 * @author yinfx 2014年8月19日 下午11:58:24
 */
public class MetadataVO {
	private List<MetadataItemVO> fields;

	private String class_name;
	private String metadata_desc;
	private String table_name;
	private String module_name;
	private String reg_fun;
	private String uitype;
	private String mdid;
	private String pmdid;
	public List<MetadataItemVO> getFields() {
		return fields;
	}
	public void setFields(List<MetadataItemVO> fields) {
		this.fields = fields;
	}
	public void addField(MetadataItemVO field) {
		if(this.fields == null){
			this.fields = new ArrayList<MetadataItemVO>();
		}
		this.fields.add(field);
	}
	public String getClass_name() {
		return class_name;
	}
	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
	public String getMetadata_desc() {
		return metadata_desc;
	}
	public void setMetadata_desc(String metadata_desc) {
		this.metadata_desc = metadata_desc;
	}
	public String getTable_name() {
		return table_name;
	}
	public void setTable_name(String table_name) {
		this.table_name = table_name;
	}
	public String getModule_name() {
		return module_name;
	}
	public void setModule_name(String module_name) {
		this.module_name = module_name;
	}
	public String getReg_fun() {
		return reg_fun;
	}
	public void setReg_fun(String reg_fun) {
		this.reg_fun = reg_fun;
	}
	public String getUitype() {
		return uitype;
	}
	public void setUitype(String uitype) {
		this.uitype = uitype;
	}
	public String getMdid() {
		return mdid;
	}
	public void setMdid(String mdid) {
		this.mdid = mdid;
	}
	public String getPmdid() {
		return pmdid;
	}
	public void setPmdid(String pmdid) {
		this.pmdid = pmdid;
	}
	
	
}
