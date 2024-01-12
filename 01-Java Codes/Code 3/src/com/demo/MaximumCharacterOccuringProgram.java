package com.demo;

import java.util.HashMap;
import java.util.Map.Entry;

public class MaximumCharacterOccuringProgram {

	public static void main(String[] args) {
		
		String str = "GGG";
		
		// convert string to character array
		char charArray[] = str.toCharArray();
		
		// Declare Hashmap to store
		HashMap<Character, Integer> charCountMap = new HashMap<>();
		
		// put elements in Hashmap
		/*
		 * charCountMap.containsKey(c) -> charCountMap ha jo hashmap ahe to containskey
		 * method vaprun single single character check karnar char c madhle .....char c :charArray ya character 
		 * array madhle single character ch c check kar asa sangat ahot apan
		 */
		
		
		for(char c : charArray) {
			if(charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c)+1);
			}
			else {
				charCountMap.put(c, 1);
			}
		}
		
		
		int maxCount = 0;
        
        char maxChar = 0;
         
        for (Entry<Character, Integer> entry : charCountMap.entrySet()) 
        {
            if (entry.getValue() > maxCount)
            {
                maxCount = entry.getValue();
                 
                maxChar = entry.getKey();
            }
        }
         
        System.out.println("Input String : "+str);
         
        System.out.println("Maximum Occurring char and its count :");
         
        System.out.println(maxChar+" : "+maxCount);
		
		

	}

}
