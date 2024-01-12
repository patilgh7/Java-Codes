package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedStatementWithDoWhileLoop {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pst = null;
		try {
			Scanner sc = new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/collegedb";
			String username = "root";
			String password = "Gauravpatil@123";
			con = DriverManager.getConnection(url, username, password);
			String query = "insert into employee values(?,?,?)";
			pst = con.prepareStatement(query);
			do {
				
			
			System.out.println("Enter ID : ");
			int id = sc.nextInt();
			
			System.out.println("Enter Name : ");
			String name = sc.next();
			
			System.out.println("Enter Salary : ");
			int salary = sc.nextInt();
			
			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setInt(3, salary);
			
			int i = pst.executeUpdate();
			System.out.println(i+" row inserted");
			System.out.println("Do you want to continue(y/n)");
			String s = sc.next();
			if(s.startsWith("n")) {
				break;
			}
			}while(true);
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
