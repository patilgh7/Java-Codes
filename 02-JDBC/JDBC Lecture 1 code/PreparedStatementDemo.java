package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStatementDemo {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pst = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/collegedb";
			String username = "root";
			String password = "Gauravpatil@123";
			con = DriverManager.getConnection(url, username, password);
			String query = "insert into employee values(?,?,?)";
			pst = con.prepareStatement(query);
			pst.setInt(1, 107);
			pst.setString(2, "Chetana");
			pst.setInt(3, 30000);
			
			int i = pst.executeUpdate();
			System.out.println(i+" row inserted");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				pst.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	
		
	
		


	}

}
