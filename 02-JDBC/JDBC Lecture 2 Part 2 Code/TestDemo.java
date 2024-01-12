package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestDemo {

	static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/mydata";
		String username = "root";
		String password = "Gauravpatil@123";
		Connection con = DriverManager.getConnection(url, username, password);
		return con;
		
	}
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = getConnection();
		//String query = "update student set marks = ? where id = ?";
		String query = "update student set name = ? where name = ?";
		PreparedStatement pst = con.prepareStatement(query);
		//pst.setInt(1, 92);
		//pst.setInt(2, 3);
		
		pst.setString(1, "Shital"); // 1 = set name
		pst.setString(2,"Pooja");  // 2 = where name
		
		int i = pst.executeUpdate();
		System.out.println(i+" row inserted");
		
		pst.close();
		con.close();

	}

}
