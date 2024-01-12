package com.demo;

public class Singleton implements Cloneable{
	
	private Singleton() {
		
	}
	
	private static Singleton instance;
	
	private static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}else {
			return instance;
		}
		
		return instance;
		
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Singleton obj1 = Singleton.getInstance();
		
		Singleton obj2 = (Singleton) obj1.clone();       // shallow cloning
		
		System.out.println(obj1.hashCode());

		System.out.println(obj2.hashCode());
	}
	
	@Override                                      // deep cloning
	protected Object clone() {
		return instance;
	}
	

}
