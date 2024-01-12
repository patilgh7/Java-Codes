package com.demo;

import java.util.ArrayList;
import java.util.List;

public class StreamApiMapMethod2 {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		
		names.add("arjun jadhav");
		names.add("suraj patil");
		names.add("dinesh more");
		names.add("raju patil");
		
		// Using map we make all data into Capital Alphabets 
		
		names.stream().map(String::toUpperCase).forEach(System.out::println);
		
		

	}

}
