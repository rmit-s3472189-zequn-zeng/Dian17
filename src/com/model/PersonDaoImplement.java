package com.model;

import java.sql.Connection;  
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Set;


public class PersonDaoImplement implements PersonDao{

	@Override
	public boolean addPerson(Person person) {
		Connection connection=null;
		connection= JDBCUtils.getConnection();
		String sql1 ="insert into Person(userName,password,type) values('"+person.getUserID()+"',md5('"+person.getPassword()+"'),'"+"user"+"');";
		Statement statement= null;
		try {
			statement= connection.createStatement();
			statement.executeUpdate(sql1);
			System.out.println("Success insert");
			return true;
		} catch (SQLException e) {
			return false;
		}finally {
			JDBCUtils.free(null, statement, connection);
		}
	}

	@Override
	public boolean deletePerson(Person person) {
		return false;
	}

	@Override
	public boolean updatePerson(Person person) {
		
		return false;
	}

	@Override
	public boolean findPerson(Person person) {
		Connection connection=null;
		connection= JDBCUtils.getConnection();
		PreparedStatement pstmt;
		String sql = "select * from Person where userName = '"+person.getUserID()+"';";
		try {
			pstmt = (PreparedStatement)connection.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				System.out.println("test:"+rs.getString(2));
				
				if (rs.getString(2).equals(person.getUserID())){
					JDBCUtils.free(rs, pstmt, connection);
					return true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
       return false;
	}

	@Override
	public Set<Person> findAll() {
		return null;
	}

	@Override
	public boolean isValidPerson(Person person) {
		Connection connection = null;
		connection=JDBCUtils.getConnection();
		PreparedStatement pstmt;
		String sql = "select * from Person where userName = '"+person.getUserID()+"' and md5('"+person.getPassword()+"')=password;";
		try {
			pstmt = (PreparedStatement)connection.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				System.out.println("Distinguish Success!");
				if(rs.getString(2).equals(person.getUserID())){
					JDBCUtils.free(rs, pstmt, connection);
					return true;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Distinguish Failed!");
		return false;
	}

}
