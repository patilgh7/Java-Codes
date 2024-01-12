package com.demo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Ananymous a =new Ananymous() {
		 * 
		 * @Override public void show() { System.out.println("Hello");
		 * 
		 * } };
		 * 
		 * a.show();
		 */
		
		/*
		 * For one sysout statement :
		 * 
		 * Ananymous lambda = ()->System.out.println("Hello Mo");
		 * 
		 * lambda.show();
		 */
		
		
		// For two sysout statement :
		Ananymous lam = ()->{System.out.println("Hi");System.out.println("Hello");};
		
		lam.show();
		
		
		
		

	}

}
