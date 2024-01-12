package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ExecuteQuery3_Demo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// here we call getConnection method from Test class
		// java madhe mysql chya query read karnyasathi executeQuery use karto
		// executeQuery hi ResultSet return karte ResultSet ek interface ahe
		
		// fakt 2 column name,marks show karayche astil tar
		
		Connection con = Test.getConnection();
		String query = "select name,marks from student where marks>=?";
		PreparedStatement pst= con.prepareStatement(query);
		pst.setInt(1, 80);
		
		ResultSet rs = pst.executeQuery(); 
		
		while(rs.next()) {
			System.out.println("name "+rs.getString(1));
			System.out.println("marks "+rs.getString(2));
			
		}
		
		rs.close();
		pst.close();
		con.close();				
				

	}

}
