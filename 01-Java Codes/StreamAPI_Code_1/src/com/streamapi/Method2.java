package com.streamapi;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Method2 {

	public static void main(String[] args) {
		
		// sorted() method
		
		// For Integers
		List<Integer> num = List.of(55,20,10,15,50);
		
		num.stream().sorted().forEach(System.out::println);
		
		// For String 
		List<String> list = List.of("Babu", "Ajay", "Don", "Chetana");
	
		List<String> newList = list.stream().sorted().collect(Collectors.toList());
		
		System.out.println(newList);
		
		
		// min() method
		List<Integer> num2 = List.of(15,10,20,30,40);
		
		Integer integer = num2.stream().min((x,y)-> x.compareTo(y)).get();
		
		System.out.println("Minimum Number : "+integer);
		
		
		Integer integer2 = num2.stream().max((x,y)-> x.compareTo(y)).get();
		
		System.out.println("Maximum Number : "+integer2);
		
	}

}
