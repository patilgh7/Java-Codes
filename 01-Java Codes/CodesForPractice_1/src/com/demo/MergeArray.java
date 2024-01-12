package com.demo;

import java.util.Arrays;

public class MergeArray {

	public static void main(String[] args) {
		
		String str1[] = {"A","B"};
		
		String str2[] = {"C","D"};
		
		String str3[] = new String[str1.length+str2.length];

		int pos = 0;
		
		for(String element : str1) {
			
			str3[pos]= element;
			pos++;
		}
		
		for(String element : str2) {
			
			str3[pos] = element;
			pos++;
		}

		System.out.println(Arrays.toString(str3));
	}

}
