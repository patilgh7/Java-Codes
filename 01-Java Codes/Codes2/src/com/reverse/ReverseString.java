package com.reverse;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "My Name is Gaurav";
		
		char arr[]= str.toCharArray();
		
		int size = arr.length;
		
		System.out.println(size);
		
		for(int i = size-1; size-1 >= 0; i--) {
			System.out.println(arr[i]);
		}

	}

}
