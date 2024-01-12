package com.factorypattern;

import java.util.Scanner;

public class FactoryMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter OS For Availability : ");
		String input= sc.next();
		OS os = OSFactory.getInstance(input);
		os.availability();
		os.price();

	}

}
