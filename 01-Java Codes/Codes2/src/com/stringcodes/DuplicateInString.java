package com.stringcodes;

public class DuplicateInString {

	public static void main(String[] args) {
		
		
		String str = "Big black bug bit a big black dog on his big black nose";
		
		int count;
		
		String word[] = str.split(" ");
		
		System.out.println("Duplicate in Given String : ");
		
		for(int i = 0; i < word.length; i++) {
			count = 1;
			for(int j = i+1; j < word.length; j++) {
				if(word[i].equals(word[j])) {
					count++;
					//Set words[j] to 0 to avoid printing visited word  
					word[j] ="0";
				}
			}
			
			//Displays the duplicate word if count is greater than 1    
	        if(count > 1 && word[i] != "0")    
	            System.out.println(word[i]);    
		}
		
		

	}

}
