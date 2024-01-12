package com.demo;

public class EqualityOfTwoArrays2 {

	public static void main(String[] args) {
		
		int arrayOne[] = {1, 2, 4, 5, 3};
		
		int arrayTwo[] = {1, 2, 4, 5, 3};
		
		boolean notEqual = false;
		
		if(arrayOne.length == arrayTwo.length) {
			
			for(int i = 0; i < arrayOne.length; i++) {
				
				if(arrayOne[i] != arrayTwo[i]) {
					notEqual = true;
					
				}
				
			}
		}else {
			notEqual = true;
		}
		
		if(notEqual) {
			System.out.println("Two arrays are not equal");
		}else {
			System.out.println("Arrays are Equal");
		}

	}

}
