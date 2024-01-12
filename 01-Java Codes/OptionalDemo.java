package com.demo;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
	
		String str = "m";
			
		/*
		 * if(str == null) { 
		 * System.out.println("null"); 
		 * }else {
		 * System.out.println(str.length()); 
		 * }
		 */
		
		Optional<String> optional = Optional.ofNullable(str);
		
		System.out.println(optional.orElse(str));
		
	
	}

}
