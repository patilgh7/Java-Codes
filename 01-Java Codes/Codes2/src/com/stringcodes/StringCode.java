package com.stringcodes;

public class StringCode {

	public static void main(String[] args) {
		
		String str = "Vedant is good boy";
		
		String word[] = str.split(" ");
		
		for(int i = 0; i < word.length; i++) {
			System.out.println(word[i]);
		}
		
		

	}

}
