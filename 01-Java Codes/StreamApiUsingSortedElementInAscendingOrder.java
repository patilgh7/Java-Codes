package com.demo;

import java.util.ArrayList;
import java.util.List;

public class StreamApiUsingSortedElementInAscendingOrder {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		
		names.add("Dilip");
		names.add("Arjun");
		names.add("Suraj");
		names.add("Ronaldinho");
		
		names.stream().sorted().forEach(System.out::println);
	

	}

}
