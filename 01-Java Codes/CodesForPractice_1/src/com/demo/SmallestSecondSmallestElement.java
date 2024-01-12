package com.demo;

import java.util.Arrays;

public class SmallestSecondSmallestElement {

	public static void main(String[] args) {
	
	
		getSmallAndSecondSmallestElement(new int[] {17, 11, 23, 64, 41, 88, 35});

	}
	
	public static void getSmallAndSecondSmallestElement(int inputArray[]) {
		
		int smallest = inputArray[0];
		int secondSmallest = inputArray[0];
		
		
		for(int i = 0; i < inputArray.length; i++) {
			
			if(inputArray[i] < smallest) {
				secondSmallest = smallest;
				smallest = inputArray[i];	
			}
			else if(inputArray[i] > smallest && inputArray[i] < secondSmallest) {
				secondSmallest = inputArray[i];
			}
		}
		
		System.out.println("Input Array "+Arrays.toString(inputArray));
		
		System.out.println("Smallest Element : "+smallest);
		
		System.out.println("Second Smallest Element : "+secondSmallest);
	}
	 

}
