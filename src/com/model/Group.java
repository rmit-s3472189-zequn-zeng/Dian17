package com.model;

import java.util.List;

public class Group {
	private String groupname;
	private Person person;
	public Group(String name, Person user){
		this.groupname=name;
		this.person=user;
	}
	
	public boolean addGroupMember(Person person){
		return false;
	}
	
	public boolean deleteGroupMember(Person person){
		return false;
	}
	
	public boolean setAdminMember(Person person){
		return false;
	}
	
	public List<Person> listAllMember(){
		return null;
	}
	
	public boolean isLeaderOfGroup(Person person){
		return false;
	}
}
