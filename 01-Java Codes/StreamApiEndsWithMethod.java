package com.demo;

import java.util.ArrayList;
import java.util.List;

public class StreamApiEndsWithMethod {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();

		names.add("Dilip Patil");
		names.add("Arjun Jadhav");
		names.add("Suraj Patil");
		names.add("Dinesh More");
		names.add("Raju Patil");

		names.stream().filter(name -> name.endsWith("Patil")).forEach(System.out::println);
	}

}
