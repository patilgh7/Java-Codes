package com.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("Gaurav", 1);
		map.put("Shri", 5);
		map.put("Anna", 3);
		map.put("Vicky", 2);
		map.put("Patil", 4);
		
		/*
		 * for(Map.Entry<String, Integer> entry:map.entrySet()) {
		 * System.out.println(entry.getKey()+" "+entry.getValue()); }
		 */
		
		Set<String> keys = map.keySet();
		
		for(String s:keys) {
			System.out.println(s);
			System.out.println(map.get(s));
		}

	}

}
