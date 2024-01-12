package com.demo2;

public class TestMain {

	public static void main(String[] args)  {
		try {
			throw new Test("Invalid input..");
		}catch (Exception e) {
			e.getMessage();
		}
		

	}

}
