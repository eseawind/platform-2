package com.eniac.build.metadata;

import java.lang.reflect.Method;

/**
 * 编译对应单个字段VO
 * @author yinfx
 * 2014年8月19日  下午11:58:24
 */
public class MetadataItemVO {
	private String field;
	private String display_field;
	private String column;
	private String display_column;
	private String data_type;
	private String nullable;
	private String length;
	private String primary;
	private String desc;
	private String transi;
	
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public String getDisplay_field() {
		return display_field;
	}
	public void setDisplay_field(String display_field) {
		this.display_field = display_field;
	}
	public String getColumn() {
		return column;
	}
	public void setColumn(String column) {
		this.column = column;
	}
	public String getDisplay_column() {
		return display_column;
	}
	public void setDisplay_column(String display_column) {
		this.display_column = display_column;
	}
	public String getData_type() {
		return data_type;
	}
	public void setData_type(String data_type) {
		this.data_type = data_type;
	}
	public String getNullable() {
		return nullable;
	}
	public void setNullable(String nullable) {
		this.nullable = nullable;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	public String getPrimary() {
		return primary;
	}
	public void setPrimary(String primary) {
		this.primary = primary;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getTransi() {
		return transi;
	}
	public void setTransi(String transi) {
		this.transi = transi;
	}
	public void set(String name,Object value){
		Class<? extends MetadataItemVO> clazz = this.getClass();
		Method[] methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
			if((("set"+name).toUpperCase()).equals(method.getName().toUpperCase())){
				try {
					method.invoke(this, value);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
