package com.cg.bean;

public class Loan {
	
	public int id;
	public String bname;
	
	Loan() {}
	public String toString() {
		return "Loan [id=" + id + ", bname=" + bname + "]";
	}
	public Loan(int id, String bname) {
		super();
		this.id = id;
		this.bname = bname;
	}
	

}
