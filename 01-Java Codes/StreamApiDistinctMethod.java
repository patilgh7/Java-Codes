package com.demo;

import java.util.ArrayList;
import java.util.List;

public class StreamApiDistinctMethod {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		
		names.add("Shridhar");
		names.add("Tanu");
		names.add("Raj");
		names.add("Shridhar");
		names.add("Nikhil");
		names.add("Tanu");
		
		names.stream().distinct().forEach(System.out::println);
		
		
		// distinct method removes duplicates
		


	}

}
