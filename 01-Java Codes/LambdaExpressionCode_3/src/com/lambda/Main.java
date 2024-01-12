package com.lambda;

public class Main {

	public static void main(String[] args) {
		
		LengthInter l = (str)->str.length();
		
		System.out.println(l.getLength("ABCDEF"));
	}

}
