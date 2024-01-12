package com.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIDemo {

	public static void main(String[] args) {

		// create a list and filter all even numbers from list
		
		List<Integer> list1 = List.of(2,4,50,21,22,67);
		
		List<Integer> list2 = new ArrayList<>();
		
		list2.add(12);
		list2.add(34);
		list2.add(23);
		list2.add(78);
	
		
		List<Integer> list3 = Arrays.asList(23, 567, 12, 677, 24);
		
		// list1
		// without stream 
		// ha motha code ahe mhanje boiler plate code ...mhanje line of code jast ahe without using stream api
		List<Integer> listEven = new ArrayList<>();
		
		for(Integer i : list1) {
			if(i % 2 == 0) {
				listEven.add(i);
			}
		}
		
		System.out.println(list1);
		System.out.println("Without Stream API ");
		System.out.println(listEven);
		
		System.out.println("===================================");
		
		
		// Using Stream API
		Stream<Integer> stream = list1.stream();
		
		List<Integer> newList = stream.filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("Using Stream API ");
		System.out.println(newList);
		
		System.out.println("===================================");
		
		
		// And You can write above code in one line
		
		List<Integer> listEven2= list1.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("Using Stream API With One Line Code :  "+listEven2);
		
	}

}
