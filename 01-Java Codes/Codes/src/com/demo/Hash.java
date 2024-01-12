package com.demo;

public class Hash {

	public static void main(String[] args) {
		
		String a = "200";
		String b = "20";
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		String c = "400";
		String d = "400";
		
		
		System.out.println(c.equals(d));
		
		System.out.println(c == d);

	}

}
