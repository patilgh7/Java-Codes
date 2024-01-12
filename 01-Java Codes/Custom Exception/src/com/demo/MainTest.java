package com.demo;

public class MainTest {

	public static void main(String[] args) {
		
		
		Account ac = new Account();
		
		System.out.println("Current balance : "+ac.balance());
		
		ac.withdraw(1200);
		
		System.out.println("Current balance : "+ac.balance());
		

	}

}
