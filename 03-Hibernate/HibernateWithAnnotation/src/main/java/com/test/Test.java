package com.test;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		System.out.println("Step 1");
		
		Configuration cfg = new Configuration(); // acivate hibernate framework -> liabraries in dependency get activated
		
		
		Configuration cfg2 = cfg.configure("hibernate.cfg.xml");
		
		System.out.println("Step 2");
		// SessionFactory creates JDBC Connection Pool 
		SessionFactory factory = cfg2.buildSessionFactory(); 
		Session session = factory.openSession();
		
		Transaction t = session.beginTransaction();
		
		Student student = new Student("Shyam", 89, "abc");
		
		Serializable id = session.save(student);
		t.commit();
		System.out.println("id>>"+id);
		
		System.out.println("Record Saved Successfully...");
		
		session.close();
		factory.close();
		
		
		
		

	}

}
