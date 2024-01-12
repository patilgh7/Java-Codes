package com.demo;

import java.util.ArrayList;
import java.util.List;

public class StreamApiMapMethod3 {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		
		names.add("Ronaldinho");
		names.add("Messi");
		names.add("Ronaldo");
		names.add("Neymar");
		
		// Here We calculate length of each name using map method
		
		names.stream().map(str -> str.length()).forEach(System.out::println);
		
		
		// Another way of writing 
		names.stream().map(String::length).forEach(System.out::println);
		

	}

}
