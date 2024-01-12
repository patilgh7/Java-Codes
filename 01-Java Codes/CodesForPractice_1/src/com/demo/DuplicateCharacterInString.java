package com.demo;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharacterInString {

	public static void main(String[] args) {
		
		duplicateCharCount("JavaJ2EE");
		duplicateCharCount("Fresh Fish");
		duplicateCharCount("Better Butter");
		duplicateCharCount("AaaaAAA");
	
	}
	
	static void duplicateCharCount(String inputString) {
		
		//Creating a HashMap containing char as key and it's occurrences as value
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		
		// converting given string to charArray
		char strArray[] = inputString.toCharArray();
		
		// checking each char of stringArray
		
		for(char c : strArray) {
			
			if(charCountMap.containsKey(c)) {
				
				// If char is present in charCountMap, incrementing its count by 1
				charCountMap.put(c, charCountMap.get(c)+1);
			}else {
				//If char is not present in charCountMap,
				//putting this char to charCountMap with 1 as it's value
				
				charCountMap.put(c, 1);
			}
					
		}
		
		
		//Getting a Set containing all keys of charCountMap
		
		Set<Character> charInString = charCountMap.keySet();
		
		System.out.println("Duplicate Characters In "+inputString);
		
		// Iterating through Set 'charInString'
		
		for(Character ch : charInString) {
			
			if(charCountMap.get(ch) > 1) {
				//If any char has a count of more than 1, printing it's count
				System.out.println(ch+":"+charCountMap.get(ch));
			}
			
		}
		
	}

}
