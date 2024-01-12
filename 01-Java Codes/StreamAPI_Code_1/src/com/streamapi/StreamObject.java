package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {

	public static void main(String[] args) {
		
		// Stream API - Collection Process
		// We can use Stream API for to process Collection Framework and to process group of object
		// We can use Stream API for Arrays class
		
		// Create A Stream Object Using Following Methods
		
		// 1 -blank stream 
		Stream<Object> emptyStream = Stream.empty();
	
		
		// 2-array,object,collection
		
		String names[] = {"Durgesh", "Uttam", "Ankit", "Divya"};
		
		Stream<String> stream1 = Stream.of(names);
		
		// forEach madhe consumer mhanje asa fuction je kahi return nahi karat
		stream1.forEach(e->{System.out.println(e);});
		
		
		System.out.println("=======================================================");
		
        // Another Way of Writing Above Code
		Stream<String> stream2 = Stream.of("Gaurav", "Shridhar", "Tanu", "Priyanka");
		
		stream2.forEach(e->{System.out.println(e);});
		
		// 3-Using Stream builder()
		 Stream<Object> streamBuilder = Stream.builder().build();

		 
		 System.out.println("=======================================================");
		 
		// 4-Using Arrays class
		 IntStream stream3 = Arrays.stream(new int[] {2, 4 , 5 , 6 , 8});
		 
		 stream3.forEach(e->{System.out.println(e);});
		 
		 
		 System.out.println("=======================================================");
		 // 5-List, Set
		 
		 List<Integer> list1 = List.of(5, 55, 555, 123, 145);
		 
		 Stream<Integer> stream5 = list1.stream();
		 
		 stream5.forEach(e->{System.out.println(e);});
		 
		 System.out.println("=======================================================");
		 
		 //6
		Stream<String> stream6 = Arrays.stream(new String[] {"H", "K"});
		
		stream6.forEach(e->{System.out.println(e);});
		

	}

}
