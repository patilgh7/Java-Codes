package com.demo;

import java.util.ArrayList;
import java.util.List;

public class StreamApiMaxMethod {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>();

		numbers.add(150);
		numbers.add(1000);
		numbers.add(200);
		numbers.add(60);

		Integer maxNum = numbers.stream().max(Integer::compare).get();
		
		System.out.println("Maximum Number Is "+maxNum);
	}

}
