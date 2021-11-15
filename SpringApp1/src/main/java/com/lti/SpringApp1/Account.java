package com.lti.SpringApp1;

public class Account {

	int id;
	double balance;
	Account() {}
	
	public Account(int id, double balance) {
		super();
		this.id = id;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + "]";
	}
	public void start() {
		System.out.println("account bean started");
	}
	public void stop() {
		System.out.println("account stopped..");
	}
	  
}
