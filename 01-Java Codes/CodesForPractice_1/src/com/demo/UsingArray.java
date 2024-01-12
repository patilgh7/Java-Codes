package com.demo;

import java.util.Arrays;

public class UsingArray {

	public static void main(String[] args) {
		
		String strArray[] = {"G","H"};
		
		System.out.println(Arrays.toString(strArray));
		
		// Create New Empty Array to Add element in that array
		String newEmptyArray[] = new String[strArray.length+1];
		
		String newElement = "P";
		
	
		for(int i = 0; i < strArray.length; i++) {
			
			newEmptyArray[i] = strArray[i];
			
			
		}
		
		//Specifying the position of the added elements ( Last)  
		
		newEmptyArray[newEmptyArray.length-1]= newElement;
		
		strArray = newEmptyArray;
		
		System.out.println(Arrays.toString(strArray));
		
		
		
		
		System.out.println("==================================");
		
		String firstArray[] = {"Gaurav", "Shridhar"};
		
		
		System.out.println(Arrays.toString(firstArray));
		
		String secondArray[] = new String[firstArray.length+1];
		
		String thirdElement = "Tanu";
		
		for(int i = 0; i < firstArray.length; i++) {
			secondArray[i] = firstArray[i];
		}
		
		secondArray[secondArray.length-1]= thirdElement;
		
		
		System.out.println(Arrays.toString(secondArray));
		
		

	}

}
