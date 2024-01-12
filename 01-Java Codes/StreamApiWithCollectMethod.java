package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiWithCollectMethod {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Ajay");
		list.add("Sujay");
		list.add("Naresh");
		list.add("Jayesh");
		
		list.stream().limit(2).collect(Collectors.toList()).forEach(System.out::println);;
		
		// limit() method 
		//when you write limit(2) then it shows Output : Ajay Sujay
		//when you write limit(3) then it shows Output : Ajay Sujay Naresh

	}

}
