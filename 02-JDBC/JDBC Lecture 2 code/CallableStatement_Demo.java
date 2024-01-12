package com.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CallableStatement_Demo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// here we call getConnection method from Test class
		// CallableStatement method is used for store procedure
		// mulltiple query handle karnyasathi CallableStatement use karto
		// 	boolean hasRs query ahe ki nahi check karnyasathi ...query nastil tar 
		// getResultSet() result return karate
		
		Connection con = Test.getConnection();
		String procedure = "call studDetails ()";
		CallableStatement cst = con.prepareCall(procedure);
		boolean hasRs = cst.execute();
		// select distinct name from student;
		if(hasRs) {
			ResultSet rst = cst.getResultSet();
			while(rst.next()) {
				System.out.println("names : "+rst.getString(1));
			}
		}
		
		// select max(marks) from student;
		
		if(cst.getMoreResults()) {
			ResultSet rst = cst.getResultSet();
			while(rst.next()) {
				System.out.println("Max Marks : "+rst.getInt(1));
			}
		}
	
		cst.close();
		con.close();	
				

	}

}
