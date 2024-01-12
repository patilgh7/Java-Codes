package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListAndListToArrayConvert {

	public static void main(String[] args) {


		String strArray[] = {"Gaurav", "H"};
		
		System.out.println(Arrays.toString(strArray));
		
		// Take one separate string literal and add it to above strArray
		
		String s = "Patil";
		
		// Create ArrayList of strArray
		
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(strArray));
		
		list.add(s);
		
	
		// convert ArrayList to Array
		strArray = list.toArray(strArray);

		System.out.println(Arrays.toString(strArray));
	}

}
