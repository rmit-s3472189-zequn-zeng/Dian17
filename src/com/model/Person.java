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
	
	public Person(String username,String type){
		this.userID=username;
		this.type=type;
	}
	
	/**
	 * @return the userID
	 */
	public String getUserID() {
		return userID;
	}
	/**
	 * @param userID the userID to set
	 */
	public void setUserID(String userID) {
		this.userID = userID;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

}
