package com.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class CollableStatement_Demo2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = TestSecond.getConnection();
		String procedure = "call insert_Student(?,?,?)";
		CallableStatement cst = con.prepareCall(procedure);
		
		cst.setInt(1, 15);
		cst.setString(2, "Vijay");
		cst.setInt(3, 99);
		
		
	
		int i = cst.executeUpdate();
		
		System.out.println(i+" row inserted");
		
		
		cst.close();
		con.close();	


	}

}
