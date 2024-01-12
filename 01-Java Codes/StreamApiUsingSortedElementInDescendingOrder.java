package com.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamApiUsingSortedElementInDescendingOrder {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();

		names.add("Dilip Patil");
		names.add("Arjun Jadhav");
		names.add("Suraj Patil");
		names.add("Dinesh More");
		names.add("Raju Patil");

		// Use sorted() method with Comparator.reverseOrder()
		
		names.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

	}

}
