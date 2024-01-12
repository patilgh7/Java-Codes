package com.demo;

import java.util.ArrayList;
import java.util.List;

public class StreamApiMapMethod {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(3);
		numbers.add(5);
		numbers.add(7);
		numbers.add(9);
		
		// map() method use when you want make some changes in given data
		// filter() method is used for filter the data
		
		// Using map method we have performed operation of square of given numbers 
		
		numbers.stream().map(num -> num * num).forEach(System.out::println);
		

	}

}
