package com.lambda;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * MyInter m= new MyInterImpl();
		 * 
		 * m.sayHello();
		 */
		
		
		/*
		 * MyInter m = new MyInter() {
		 * 
		 * public void sayHello() { System.out.println("Hi Hello........"); }
		 * 
		 * };
		 * 
		 * m.sayHello();
		 * 
		 * 
		 * MyInter m2 = new MyInter() {
		 * 
		 * @Override public void sayHello() {
		 * System.out.println("This is second anonymous class....");
		 * 
		 * } };
		 * 
		 * m2.sayHello();
		 */
		
		// Using Lambda 
		
		MyInter m = ()->{System.out.println("This is lambda ....");};
		m.sayHello();
		
		
		MyInter m2 = ()->System.out.println("This is 2nd time using lambda");
		m2.sayHello();
		
	}	

}
