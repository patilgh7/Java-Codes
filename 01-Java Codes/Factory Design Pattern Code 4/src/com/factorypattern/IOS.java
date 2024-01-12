package com.factorypattern;

public class IOS implements OS{

	@Override
	public void availability() {
		System.out.println("Availability = 5");
		
	}

	@Override
	public void price() {
		System.out.println("Rs.125000");
		
	}



}
