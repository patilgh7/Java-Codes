package com.factorypattern;

public class OSFactory {

	public static OS getInstance(String input) {
		
		if(input.equalsIgnoreCase("androidos")) {
			
			return new AndroidOS();
		}else if(input.equalsIgnoreCase("windowsos")) {
			
			return new WindowsOS();
		}else if(input.equalsIgnoreCase("ios")) {
			
			return new IOS();
		}
		
		throw new IllegalArgumentException("Invalid Input...");
	}

}
