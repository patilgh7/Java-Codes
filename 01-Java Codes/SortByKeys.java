package com.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortByKeys {

	public static void main(String[] args) {
		
		
		Map<String, Integer> studentMap = new HashMap<String, Integer>();
		
		studentMap.put("Ram", 2);
		studentMap.put("Smith", 5);
		studentMap.put("Deepak", 1);
		studentMap.put("Abhishek", 7);
		studentMap.put("Jignesh", 4);
		
		Map<String, Integer> sortedStudentMap = new TreeMap<>(studentMap);
		
		System.out.println("Before Sorting : ");
		
		System.out.println(studentMap);
		
		System.out.println("After Sorting : ");
		
		System.out.println(sortedStudentMap);

	}

}
