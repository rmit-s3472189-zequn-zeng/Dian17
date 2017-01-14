package com.model;


public class User extends Person {
	
	public User(String id, String pwd,String type) {
		super(id, pwd,type);
	}

	@Override
	public String getPersonType() {
		return null;
	}
	
	public boolean registNewUser(Person person){
		return true;
	}

	public boolean isUser(){
		return false;
	}

	public boolean verifyPassword(){
		return false;
	}
	
	public boolean updateUserDetail(String phone,String oldPassword, String newPassword, String birthday ){
		return false;
	}
	
	//Update user information to database
	public boolean databaseUpdate(){
		return false;
	}

	public boolean insertUser(){
		return false;
	}
	
	public boolean deleteUser(){
		return false;
	}
	
	public void createGroupByName(String groupname){
		
	}
	
}
