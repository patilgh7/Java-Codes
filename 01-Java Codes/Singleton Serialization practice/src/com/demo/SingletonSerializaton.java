package com.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SingletonSerializaton implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		// Write 
		FileOutputStream fos = new FileOutputStream("D:\\Serializaton.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Singleton obj1 = Singleton.getInstance();
		oos.writeObject(obj1);
		oos.close();
		
		
		// Read
		FileInputStream fis = new FileInputStream("D:\\Serializaton.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Singleton obj2 = (Singleton) ois.readObject();
		ois.close();
		
		System.out.println("Instance1>> "+obj1.hashCode());
		System.out.println("Instance2>> "+obj2.hashCode());
		

	}

}
