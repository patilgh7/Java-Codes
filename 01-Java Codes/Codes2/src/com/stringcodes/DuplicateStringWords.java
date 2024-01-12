package com.stringcodes;

public class DuplicateStringWords {

	public static void main(String[] args) {
	
		String str = "My name is My Gaurav My Gaurav";
		
		String words[] = str.split(" ");
		
		int count;
		
		for(int i = 0; i < words.length; i++) {
			count = 1;
			for(int j = i+1; j < words.length; j++) {
				if(words[i].equals(words[j])) {
					count++;
					words[j] = "0";
				}
			}
			
			if(count > 1 && words[i] != "0") {
				System.out.println(words[i]);
			}
			
			
		}

	}

}
