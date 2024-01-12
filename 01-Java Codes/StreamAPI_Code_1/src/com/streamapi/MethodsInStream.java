package com.streamapi;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MethodsInStream {

	public static void main(String[] args) {
		
		
		/*
		 * 1.filter
		 * filter(Predicate) -> Predicate means boolean value function mhanje he
		 * fuction true or false return karel
		 * 
		 * 2.map -> map element return karato
		 * map(Function)
		 * map value return karato simply
		 */		
		
		List<String> names = List.of("Aman", "Durgesh","Ankit", "Anita");
		
		List<String> newNames = names.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
		
		System.out.println(newNames);
		
		
		List<Integer> numbers = List.of(23,24,3,5);
		
		
		 List<Integer> newNumbers =numbers.stream().map(i->i*i).collect(Collectors.toList());
		 
		 System.out.println(newNumbers);
		 

	
		 
		
		
	}

}
