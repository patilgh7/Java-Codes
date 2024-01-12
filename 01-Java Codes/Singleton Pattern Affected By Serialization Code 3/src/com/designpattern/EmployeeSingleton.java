package com.designpattern;

import java.io.Serializable;

public class EmployeeSingleton implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	
	
	protected Object readResolve() {
		return instance;
	}

}
