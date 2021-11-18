package com.example.jpa.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="mgr_store3")
public class Manager2 extends Employee2 {

	private static final long serialVersionUID = 1L;
	
	private String departmentName;

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	

}
