package com.demo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		
		String str = "aaagggddd";
		
		char charArray[] = str.toCharArray();
		
		HashMap<Character, Integer> hMap = new HashMap<Character, Integer>();
		
	
		
		hMap.put('a', 15);
		hMap.put('b', 53);
		hMap.put('c', 45);
		hMap.put('d', 89);
		
		//System.out.println(hMap.get('a'));
		
		int length = hMap.size();
		
		System.out.println(length);
		
		/*
		 * Set<Character> s= hMap.keySet();
		 * 
		 * for(Character c :s) { System.out.println(c+" "+hMap.get(c)); }
		 */
	
		
		Set<Entry<Character,Integer>> e = hMap.entrySet();
		
		for(Map.Entry<Character, Integer> entry:e) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		
	}

}
