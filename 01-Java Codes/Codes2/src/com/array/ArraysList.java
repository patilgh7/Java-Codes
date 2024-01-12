package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysList {

	public static void main(String[] args) {
	
		// Sorting code
		
		/*Integer arr[] = {200,300,100,10,20,800};
		  List<Integer> sorting = Arrays.asList(arr);
		 *
		 * List<Integer> sorting = Arrays.asList(arr);
		 * 
		 * sorting.sort(null);
		 * 
		 * System.out.println(sorting);
		 * 
		 * 
		 * 
		 * System.out.println( sorting.get(0));
		 * 
		 * System.out.println( sorting.get(sorting.size()-1));
		 */
		 
		
		
		
		/*Integer arr[] = {200,300,100,10,20,800};
		  List<Integer> sorting = Arrays.asList(arr);
		 * Collections.sort(sorting);
		 * 
		 * System.out.println(sorting);
		 */
		
		
		int arr[] = {25,50,11,5,45};
		
		int size = arr.length;
		
		System.out.println("Size = "+size);
		
		int temp;
		
		for(int i = 0; i < size; i++) {
			for(int j = i+1; j < size; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
			System.out.println(arr[i]);
		}
		
		
		System.out.println("Max = "+arr[size-1]);
		
		System.out.println("Min = "+arr[0]);
		
		
	}

}
