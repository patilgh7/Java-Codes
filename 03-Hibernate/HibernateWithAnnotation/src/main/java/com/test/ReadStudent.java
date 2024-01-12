package com.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class ReadStudent {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration(); // acivate hibernate framework -> liabraries in dependency get activated
		
		Configuration cfg2 = cfg.configure("hibernate.cfg.xml");
		
		System.out.println("Step 2");
		// SessionFactory creates JDBC Connection Pool 
		SessionFactory factory = cfg2.buildSessionFactory(); 
		Session session = factory.openSession();
		
		Query query= session.createQuery("from Student");
		List<Student> students = query.list();
		
		for(Student s : students) {
			System.out.println("Id>>"+s.getId());
			System.out.println("Name>>"+s.getName());
			System.out.println("Marks>>"+s.getMarks());
			System.out.println("Faculty>>"+s.getFaculty());
		}
		
	}

}
