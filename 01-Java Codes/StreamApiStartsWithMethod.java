package com.demo;

import java.util.ArrayList;
import java.util.List;

public class StreamApiStartsWithMethod {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();

		names.add("Dilip");
		names.add("Arjun");
		names.add("Suraj");
		names.add("Ronaldinho");
		names.add("Raju");

		names.stream().filter(name -> name.startsWith("R")).forEach(System.out::println);
	}

}
