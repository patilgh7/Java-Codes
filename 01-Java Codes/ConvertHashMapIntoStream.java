package com.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Stream;

public class ConvertHashMapIntoStream {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("Ronaldo", 85);
		map.put("Messi", 87);
		map.put("Neymar", 92);
		map.put("Ronaldinho", 80);
		
		// First make entrySet of HashMap
		Set<Entry<String, Integer>> entry = map.entrySet();
		
		// Then we can use stream method on that entry
		 Stream<Entry<String, Integer>> stream = entry.stream();
		 
		 stream.forEach(str -> System.out.println("Name : "+str.getKey()+" => Birth Year : "+str.getValue()));

	}
	
	

}
