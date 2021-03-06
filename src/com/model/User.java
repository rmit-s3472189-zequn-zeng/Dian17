package com.model;


public class User extends Person {
	private PersonDaoImplement personDaoImplement = new PersonDaoImplement();
	public User(String id, String pwd,String type) {
		super(id, pwd,type);
	}

	public User(String id,String type){
		super(id, type);
	}
	
	public boolean registNewUser(){
		if(personDaoImplement.addPerson(this)){
			return true;
		}
		return false;
	}

	public boolean verifyPassword(){
		if (personDaoImplement.isValidPerson(this)){
			return true;
		}
		return false;
	}
	
	public boolean isUser(){
		if(personDaoImplement.findPerson(this)){
			return true;
		}
		return false;
	}
	
	public boolean updateUserDetail(String phone, String birthday,String gender,String school,String degree,String level ){
		return false;
	}
	
	public boolean changePassword(String oldPassword,String newPassword){
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
	
	public boolean createGroupByName(String groupname){
		//1.check group name whether existed in database
		//2. add group into a person
		return false;
	}
	
	public boolean addIntoGroup(Group group){
		return false;
	}
	
	public boolean leaveGroup(Group group){
		return false;
	}

}
