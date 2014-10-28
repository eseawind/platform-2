package com.eniac.test;


import javafx.beans.property.SimpleStringProperty;

public class ProductVO {
	private SimpleStringProperty code;
	private SimpleStringProperty name;
	private SimpleStringProperty amount;
	
	public ProductVO(String code,String name,String amount){
		this.code = new SimpleStringProperty(code);
		this.name = new SimpleStringProperty(name);
		this.amount = new SimpleStringProperty(amount);
	}

	public String getCode() {
		return code.get();
	}

	public void setCode(String code) {
		this.code.set(code);
	}

	public String getName() {
		return name.get();
	}

	public void setName(String name) {
		this.name.set(name);
	}

	public String getAmount() {
		return amount.get();
	}

	public void setAmount(String amount) {
		this.amount.set(amount);
	}
	
	
}
