package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Statement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Step 1");
		String url = "jdbc:mysql://localhost:3306/collegedb";
		String username = "root";
		String password = "Gauravpatil@123";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("Step 2");
		Statement statement = con.createStatement();
		System.out.println("Step 3");
		String query = "insert into employee values(104,'Vjay',25000),(105,'Sujay',20000)";
		//statement.execute(query);
		int i = statement.executeUpdate(query);
		System.out.println(i+" row inserted");
		System.out.println("Step 4");
		
		//System.out.println("Insertion Successfully");
		
		statement.close();
		con.close();

	}
	

}
