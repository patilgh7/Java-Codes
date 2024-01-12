package com.demo;

public class Account {
	
	private int balance = 3000;
	
	public int balance() {
		return balance;
	}
	
	public void withdraw(int amount) {
		if(amount > balance) {
			throw new InsufficientFundException("Insufficient balance in your account");
		}
		
		balance = balance - amount;
	}

}
