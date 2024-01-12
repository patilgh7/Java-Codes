package com.designpattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SingletonSerialization implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		// serialization (write)
		FileOutputStream fos = new FileOutputStream("D:\\demo.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		EmployeeSingleton empObject = EmployeeSingleton.getEmpSingletonInstance();
		oos.writeObject(empObject);
		
		oos.close();
		
		//deserialization (read)
		FileInputStream fis = new FileInputStream("D:\\demo.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		EmployeeSingleton empObjectDes = (EmployeeSingleton) ois.readObject();
		ois.close();
		
		System.out.println("Instance 1 : "+empObject.hashCode());
		System.out.println("Instance 2 : "+empObjectDes.hashCode());
	}



}
