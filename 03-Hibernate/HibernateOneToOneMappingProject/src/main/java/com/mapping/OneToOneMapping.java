package com.mapping;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneMapping {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		
		cfg = cfg.configure("Hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Student s = new Student();
		
		Laptop laptop = new Laptop();
		laptop.setLaptopName("HP");
		
		s.setStudName("Ram");
		s.setMarks(80);
		s.setLaptop(laptop);
		
		Transaction t = session.beginTransaction();
		
		// save
		session.save(laptop);
		session.save(s);
		
		t.commit();
		
		//get
		Student s1 = session.get(Student.class, 1);
		System.out.println(s1);
		
		session.close();
		
		factory.close();
		
		

	}

}
