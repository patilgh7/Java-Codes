package com.demo;

import java.util.Arrays;

public class UsingStreamSmallAndSecondSmall {

	public static void main(String[] args) {
	
		getSmallAndSecondSmallestNumber(new int[] {17, 11, 23, 64, 41, 88, 35});
		

	}
	
	public static void getSmallAndSecondSmallestNumber(int inputArray[]) {
		
		System.out.println("Input Array : "+Arrays.toString(inputArray));
		
		System.out.println("Smallest And SecondSmallest Numbers Are : ");
		
		
		Arrays.stream(inputArray).sorted().limit(3).forEach(System.out::println);
		
		System.out.println("==================");
		
		
	}

}
