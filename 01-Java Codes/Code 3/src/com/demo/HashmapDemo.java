package com.demo;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapDemo {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("ABC", 1);
		map.put("DFG", 2);
		map.put("JKL", 3);
		map.put("LKM", 4);
		
		//System.out.println(map);
		
		System.out.println("=======Only Value=================");

		for(String s : map.keySet()) {
			System.out.println(map.get(s));  // map.get(s)  -> gives value associated with key
		}
		
		System.out.println("=======Only Key=================");
		
		for(String s : map.keySet()) {
			System.out.println(s);           // s -> gives only key
		}
		
		
		System.out.println("=======Key And Values=================");
		
		for(String s : map.keySet()) {
			
			System.out.println(s+":"+map.get(s));
		}
		
		System.out.println("=========================================");
		
		for(String s : map.keySet()) {
			
			System.out.println(s+":"+map.get(s)+1);
		}
		
	
	}

}
