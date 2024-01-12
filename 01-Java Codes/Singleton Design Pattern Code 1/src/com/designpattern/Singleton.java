package com.designpattern;

public class Singleton {
	
	static Singleton instance;

	public static Singleton getObject() {
		
		instance = new Singleton();
		return instance;
	}
	
	
	public static void main(String[] args) {
		/*
		 * System.out.println("1st instance>> "+Singleton.getObject().hashCode());
		 * System.out.println("2nd instance>> "+Singleton.getObject().hashCode());
		 * System.out.println("3rd instance>> "+Singleton.getObject().hashCode());
		 */
		
		EmployeeSingleton emp = EmployeeSingleton.getEmpSingletonInstance();
		
		EmployeeSingleton emp2 = EmployeeSingleton.getEmpSingletonInstance();
		
		System.out.println(emp.hashCode());
		System.out.println(emp2.hashCode());
		
	}

}
