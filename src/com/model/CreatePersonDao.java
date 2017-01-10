package com.model;

import java.sql.Connection;  
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Set;

import sun.security.provider.MD5; 


public class CreatePersonDao implements PersonDao{

	@Override
	public int addPerson(Person person) {
		Connection connection=null;
		PreparedStatement pStatement=null;
		connection= JDBCUtils.getConnection();
		String  sql ="insert into Person(userName,password,type) values(?,?,?)";
		try {
			pStatement=connection.prepareStatement(sql);
			pStatement.setString(1, person.getUserID());
			pStatement.setString(2, person.getPassword());
			pStatement.setString(3, person.getType());
			pStatement.executeUpdate();
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
	public Person findStudent(String name) {
		return null;
	}

	@Override
	public Set<Person> findAll() {
		return null;
	}

}
