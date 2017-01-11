package com.model;

import java.sql.Connection;  
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Set;

import sun.security.provider.MD5; 


public class PersonDaoImplement implements PersonDao{

	@Override
	public int addPerson(Person person) {
		Connection connection=null;
		connection= JDBCUtils.getConnection();
		String sql1 ="insert into Person(userName,password,type) values('"+person.getUserID()+"',md5('"+person.getPassword()+"'),'"+"user"+"');";
		Statement statement= null;
		try {
			statement= connection.createStatement();
			statement.executeUpdate(sql1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 1;
	}

	@Override
	public int deletePerson(String name) {
		return 0;
	}

	@Override
	public int updatePerson(String name) {
		return 0;
	}

	@Override
	public Person findPerson(String name) {
		return null;
	}

	@Override
	public Set<Person> findAll() {
		return null;
	}

	@Override
	public boolean isExistedPerson(Person person) {
		Connection connection=null;
		connection= JDBCUtils.getConnection();
		PreparedStatement pstmt;
		String sql = "select * from Person where userName = '"+person.getUserID()+"';";
		try {
			pstmt = (PreparedStatement)connection.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			int col= rs.getMetaData().getColumnCount();
			if (col==0){
				return false;
			}
			else {
				return true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
       return false;
	}

}
