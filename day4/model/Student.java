package com.example.jpa.model;


import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	@Id  //1
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer studentId;
	
	@Column  //2
	private String name;
	
	
	@OneToMany(cascade=CascadeType.ALL) 
	@JoinColumn(name="address_id")
	private List<Address> addressList;  //3
	
	
	
	public List<Address> getAddressList() {
		return addressList;
	}
	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
