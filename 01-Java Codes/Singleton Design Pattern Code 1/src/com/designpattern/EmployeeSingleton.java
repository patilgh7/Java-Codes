package com.designpattern;

public class EmployeeSingleton {
	
	private EmployeeSingleton() {
		
	}
	
	private static EmployeeSingleton instance;
	
	public static EmployeeSingleton getEmpSingletonInstance() {
		
		if(instance == null) {
			instance = new EmployeeSingleton();
		}else {
			return instance;
		}
		
		return instance;
		
	}

}
