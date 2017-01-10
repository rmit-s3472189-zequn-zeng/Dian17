package com.model;

import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.ResultSet;  
import java.sql.Statement; 
public class JDBCUtils {

	public static Connection getConnection(){
		String driverName = "com.mysql.jdbc.Driver";  
		  
       // String url = "jdbc:mysql://101.200.127.60:3306/Dian17";  
        String url = "jdbc:mysql://101.200.127.60:3306/Dian17?"
                + "user=zequnzeng&password=21119188&useUnicode=true&characterEncoding=UTF8";
        Connection con = null ;  
        try {        
            Class.forName(driverName);  
            con= DriverManager.getConnection(url);
            System.out.println("success");  
        } catch (Exception e) {  
        	System.out.println("Connect to database Failed"+e.getMessage().toString());
        }           
        return con ;  		
	}
	
	public static void free(ResultSet rs, Statement sta , Connection con){
		try {  
            if(null != rs)  
            {  
                rs.close();  
                rs = null ;  
            }  
              
            if(null != sta)  
            {  
                sta.close();  
                sta = null ;  
            }  
              
            if(null != con)  
            {  
                con.close();  
                con = null ;  
            }  
              
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
	}
}
