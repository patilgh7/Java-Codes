package com.factorypattern;

public class AndroidOS implements OS{

	@Override
	public void availability() {
		System.out.println("Availability = 50");
		
	}
	
	@Override
	public void price() {
		System.out.println("Rs.25000");
		
	}



}
