package com.string;

import java.util.HashMap;
import java.util.Map;

public class StrinCode {

	public static void main(String[] args) {
		
		String s = "My Name is Gaurav";
		
		String arr[] = s.split(" ");
		
		System.out.println(arr[1]);
		
		
		String s1 = "My Name is Gaurav 123";
		
		char arr2[] = s1.toCharArray();
		
		for(int i = 0; i < arr2.length; i++) {
			if(Character.isDigit(arr2[i]))
			{
				System.out.println(arr2[i]);
			}
		}
		
		String s2 = "My Name is Gaurav 123";
		
		String s3= s2.replace("Name", "");
		
		System.out.println(s3);
		
		
		String s4 = "My Name is My Gaurav My Gaurav My Vedant ";
		
		String str[] = s4.split(" ");
		
		HashMap<String, Integer> hs = new HashMap<>();
		
		for(String str2 : str) {
			if(hs.containsKey(str2)) {
				hs.put(str2, hs.get(str2)+1);
			}else {
				hs.put(str2, 1);
			}
		}
		
		
		for(Map.Entry<String, Integer> e : hs.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue()+" ");
		}
		
		

	}

}
