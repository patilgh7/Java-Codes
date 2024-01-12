package com.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class ConvertHashMapIntoStream2 {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();

		map.put("Ram", 91);
		map.put("Ajay", 83);
		map.put("Raj", 94);
		map.put("Sachin", 99);

	
		
		Set<String> set = map.keySet();
		
		Stream<String> stream = set.stream();
		
		stream.forEach(str -> System.out.println("Name : "+str+", Marks : "+map.get(str)));
		

	}

}
