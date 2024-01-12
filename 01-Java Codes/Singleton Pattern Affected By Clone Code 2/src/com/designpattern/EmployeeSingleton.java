package com.designpattern;

public class EmployeeSingleton implements Cloneable{
	
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
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		EmployeeSingleton obj1 = getEmpSingletonInstance();
		EmployeeSingleton obj2 = (EmployeeSingleton) obj1.clone();     // shallow cloning
		
		System.out.println("before cloning>> "+obj1.hashCode());
		System.out.println("after cloning>> "+obj2.hashCode());
		
		
	}
	
	@Override   // deep cloning 
	protected Object clone() throws CloneNotSupportedException{
		
		return instance;
	}

}
