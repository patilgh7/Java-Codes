package com.demo;

public class LaptopFactory {
	
	public static Laptop getInstance(String input) {
		
		if(input.equalsIgnoreCase("HP")) {
			return new HP();
		}else if(input.equalsIgnoreCase("Dell")) {
			return new Dell();
		}else if(input.equalsIgnoreCase("Apple")) {
			return new Apple();
		}
		throw new IllegalArgumentException("Invalid Input");
	}

}
