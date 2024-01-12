package com.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo2 {

	public static void main(String[] args) {
		
		
		String string = "My name My name is Ram is My My My my my ";
		
		String str[] = string.split(" ");
		
		HashMap<String, Integer> hMap = new HashMap<>();

		for(String s : str) {
			if(hMap.containsKey(s)) {
				hMap.put(s, hMap.get(s)+1);
			}
			else {
				hMap.put(s, 1);
			}
			
		}
		
		Set<Entry<String,Integer>> e = hMap.entrySet();
		
		int maxCount = 0;
		
		String maxString = null;
		
		for(Map.Entry<String , Integer> e2 : e) {
			if(e2.getValue() > maxCount) {
				maxCount = e2.getValue();
				maxString = e2.getKey();
			}
		}
		
		System.out.println("Input String : "+string);
        System.out.println("=========================================================");
        System.out.println("Maximum Occurring String and its count :");
		
		System.out.println(maxString+":"+maxCount);
		
		

	}

}
