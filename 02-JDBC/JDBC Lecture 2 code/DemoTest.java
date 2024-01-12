package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DemoTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		// here we call getConnection method from Test class
		
		Connection con = Test.getConnection();
		String query = "delete from student where id = ?";
		PreparedStatement pst= con.prepareStatement(query);
		
		pst.setInt(1, 5);
		
		int i = pst.executeUpdate();
		System.out.println(i+" row deleted");
 
	}

}
