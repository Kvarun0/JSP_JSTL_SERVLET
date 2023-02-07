package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;



public class LoginDao {
	
	String url="jdbc:mysql://localhost:3306/jsp_jstl_jdbc_servlet";
	
	String username="root";
	String password="root";
	
	String sql="select * from login_jsp_servlet where uname=? and pass=?";
	
	public boolean checkDetails(String uname, String pass){
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection(url,username,password);
		
			PreparedStatement pst=(PreparedStatement) con.prepareStatement(sql);
			
			pst.setString(1, uname);
			pst.setString(2, pass);
		
			ResultSet rs=pst.executeQuery();
			if(rs.next()){
				return true;
			}
			
		} catch (ClassNotFoundException e) {	
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return false;
	}
}
