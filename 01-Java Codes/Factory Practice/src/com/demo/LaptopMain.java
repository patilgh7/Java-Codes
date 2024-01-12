package com.demo;

import java.util.Scanner;

public class LaptopMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Laptop Name : ");
		String input =sc.next();
		
		Laptop laptop = LaptopFactory.getInstance(input);
		laptop.price();
		

	}

}
