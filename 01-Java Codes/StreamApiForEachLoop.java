package com.demo;

import java.util.ArrayList;
import java.util.List;


public class StreamApiForEachLoop {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		
		names.add("Ram");
		names.add("Shri");
		names.add("Hari");
		names.add("Krishna");
		
		names.stream().forEach(str -> System.out.print(str +"=>>"));
		
		// for printing yo can write forEach loop like this

	}

}
