package com.demo;

public class ArraysDemo {

	public static void main(String[] args) {

		int arr[] = { 10, 4, 12, 15, 5 };

		/*
		 * for (int i = 0; i < arr.length; i++) { System.out.println(arr[i]); }
		 */

		/*
		 * for (int i = 0; i < arr.length; i++) { for(int j = i+1; j < arr.length; j++)
		 * { if(arr[i] > arr[j]) { int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp; }
		 * 
		 * }
		 * 
		 * 
		 * }
		 */

		
		for(int i = 0; i < arr.length-1; i++) {
			if(arr[i] > arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				
				i = -1;
			}
		}
	
		
		 for(int i : arr) { System.out.println(i); }
		 

	}

}
