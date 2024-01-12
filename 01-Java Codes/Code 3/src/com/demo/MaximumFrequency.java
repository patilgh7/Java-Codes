package com.demo;

import java.util.HashMap;
import java.util.Map;

public class MaximumFrequency {

	public static void main(String[] args) {
		
		String str = "hhhhheellloo";
		
		
		char strArray[] = str.toCharArray();
		
		int size = strArray.length;
		
		//System.out.println(size);
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char ch:strArray) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
		
		
		for(Map.Entry<Character, Integer> e : map.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue()+" ");
		}
		
		
		


	}

}
