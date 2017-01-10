package com.model;

public abstract class Person {
	// ID :=Phone
	private String userID;
	private String password;
	private String type;
	// For login 
	public Person(String id, String pwd, String t) {
		this.userID=id;
		this.password=pwd;
		this.type=t;
	}
	public abstract String  getPersonType();
	
}
