package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class MultipleInsertData {

	
	
	void userInput(int id, String name, int marks) {
		Connection con = null;
		PreparedStatement pst = null;
		
		try {
			con = TestDemo.getConnection();
			String query = "insert into student (id,name,marks) values (?,?,?)";
			pst = con.prepareStatement(query);
			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setInt(3, marks);
			
			int i = pst.executeUpdate();
			
			System.out.println(i+" row inserted");
				
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pst.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter number of rows : ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Enter ID : ");
			int id = sc.nextInt();
			
			System.out.println("Enter name : ");
			String name = sc.next();
			
			System.out.println("Enter marks : ");
			int marks = sc.nextInt();
			
			MultipleInsertData m = new MultipleInsertData();
			m.userInput(id, name, marks);
		}
		
		
	}
	
	

}
