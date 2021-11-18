package com.example.jpa.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="mgr_store2")
public class Manager1 extends Employee1 {

	private static final long serialVersionUID = 1L;
	
	private String departmentName;

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	

}
