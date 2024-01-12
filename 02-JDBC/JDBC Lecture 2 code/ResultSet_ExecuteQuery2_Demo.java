package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ResultSet_ExecuteQuery2_Demo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// here we call getConnection method from Test class
		// java madhe mysql chya query read karnyasathi executeQuery use karto
		// executeQuery hi ResultSet return karte ResultSet ek interface ahe
		
		// marks >= check karnyasathi
		
		Connection con = Test.getConnection();
		String query = "select * from student where marks>=?";
		PreparedStatement pst= con.prepareStatement(query);
		pst.setInt(1, 80);
		
		ResultSet rs = pst.executeQuery(); 
		
		while(rs.next()) {
			System.out.println("id "+rs.getInt(1));
			System.out.println("name "+rs.getString(2));
			System.out.println("marks "+rs.getString(3));
			System.out.println("email "+rs.getString(4));
			System.out.println("age "+rs.getString(5));
		}
		
		rs.close();
		pst.close();
		con.close();				


	}

}
