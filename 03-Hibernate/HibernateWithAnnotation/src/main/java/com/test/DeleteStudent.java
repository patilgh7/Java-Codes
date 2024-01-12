package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteStudent {

	public static void main(String[] args) {
		Configuration cfg = new Configuration(); // acivate hibernate framework -> liabraries in dependency get activated
		
		Configuration cfg2 = cfg.configure("hibernate.cfg.xml");
		
		System.out.println("Step 2");
		// SessionFactory creates JDBC Connection Pool 
		SessionFactory factory = cfg2.buildSessionFactory(); 
		Session session = factory.openSession();
		
		Transaction t = session.beginTransaction();
		
		Student s = session.get(Student.class, 5);
		session.delete(s);
		
		t.commit();
		
		System.out.println("Record Saved Successfully...");
		
		session.close();
		factory.close();


	}

}
