package com.mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToManyMapping {

	public static void main(String[] args) {
		
		
		Configuration cfg = new Configuration();
		
		cfg = cfg.configure("Hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Student s = new Student();
		
		List<Laptop> laptopList = new ArrayList<Laptop>();
		
		Laptop laptop1 = new Laptop();
		laptop1.setLaptopName("Hp");
		laptop1.setStudent(s);
		laptopList.add(laptop1);
		
		Laptop laptop2 = new Laptop();
		laptop2.setLaptopName("Apple");
		laptop2.setStudent(s);
		laptopList.add(laptop2);
		
		
		
		s.setStudName("Rajnikant");
		s.setMarks(80);
		s.setLaptops(laptopList);
		
		Transaction t = session.beginTransaction();
		
		session.save(laptop1);
		session.save(laptop2);
		session.save(s);
		t.commit();
		
		session.close();
		factory.close();
		
		
		

	}

}
