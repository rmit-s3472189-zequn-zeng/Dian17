package com.model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class PersonDaoImplement implements PersonDao {

	@Override
	public boolean addPerson(Person person) {
		Connection connection = null;
		connection = JDBCUtils.getConnection();
		try {
			CallableStatement callableStatement = connection.prepareCall("{call insertNewUser(?,?)}");
			callableStatement.setString(1, person.getUserID());
			callableStatement.setString(2, person.getPassword());
			callableStatement.executeQuery();
			System.out.println("Success insert");
			return true;
		} catch (SQLException e) {
			return false;
		} finally {
			JDBCUtils.free(null, null, connection);
		}
	}

	@Override
	public boolean deletePerson(Person person) {
	return false;
	}

	@Override
	public boolean findPerson(Person person) {
		Connection connection = null;
		connection = JDBCUtils.getConnection();
		ResultSet rs=null;
		try {
			CallableStatement callableStatement = connection.prepareCall("{call getUserByname(?)}");
			callableStatement.setString(1, person.getUserID());
			rs=callableStatement.executeQuery();
			while(rs.next()){
				if(rs.getString("userName").equals(person.getUserID())){
					JDBCUtils.free(rs, null, connection);
					return true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtils.free(rs, null, connection);
		}
		return false;
	}

	@Override
	public List<String> listAllUserName() {
		List<String> list = new ArrayList<String>();
		Connection connection = JDBCUtils.getConnection();
		try
        {
            CallableStatement cs = connection.prepareCall("{call listAllUser()}");
            ResultSet rs = cs.executeQuery(); 
            while(rs.next())
            {
                list.add(rs.getString("username"));
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }        
		return list;
	}

	@Override
	public boolean isValidPerson(Person person) {
		Connection connection = null;
		connection = JDBCUtils.getConnection();
		try {
			CallableStatement callableStatement = connection.prepareCall("{call passwordCheck()}");
			ResultSet rs=callableStatement.executeQuery();
			while(rs.next()){
				if(rs.getString("username").equals(person.getUserID())){
					JDBCUtils.free(rs, null, connection);
					return true;
				}			
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Distinguish Failed!");
		return false;
	}

	@Override
	public boolean isInGroup(Person username) {

		return false;
	}

	@Override
	public boolean updatePerson(Person person, String phone, String birthday, String gender, String school,
			String degree, String level) {
		return false;
	}

}
