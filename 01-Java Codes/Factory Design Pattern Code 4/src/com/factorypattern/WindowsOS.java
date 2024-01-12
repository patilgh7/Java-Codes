package com.factorypattern;

public class WindowsOS implements OS {

	@Override
	public void availability() {
		System.out.println("Availability = 10");
		
	}

	@Override
	public void price() {
		System.out.println("Rs.50000");
		
	}
	

}
