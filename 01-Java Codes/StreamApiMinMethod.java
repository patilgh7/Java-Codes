package com.demo;

import java.util.ArrayList;
import java.util.List;

public class StreamApiMinMethod {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(15);
		numbers.add(50);
		numbers.add(9);
		numbers.add(20);
		
		int minNum = numbers.stream().min(Integer::compare).get();
		
		System.out.println("Minimum Number Is "+minNum);

	}

}
