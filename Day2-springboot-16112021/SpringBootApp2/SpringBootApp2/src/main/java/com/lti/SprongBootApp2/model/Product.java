package com.lti.SprongBootApp2.model;

public class Product {
	Integer id;
	String pname;
	public Product() {}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Product(Integer id, String pname) {
		super();
		this.id = id;
		this.pname = pname;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	

}
