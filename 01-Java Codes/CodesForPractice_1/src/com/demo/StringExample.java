package com.demo;

public class StringExample {

	public static void main(String[] args) {

		String s = "Java";

		long startTime = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
			s = s + "J2EE";
		}

		long endTime = System.currentTimeMillis();

		System.out.println(startTime);
		System.out.println(endTime);

		System.out.println("Time Taken by String " + (endTime - startTime) + " ms");

		StringBuffer sb = new StringBuffer("Java");

		startTime = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {

			sb.append("J2EE");
		}

		endTime = System.currentTimeMillis();

		System.out.println("=============================");

		System.out.println(startTime);
		System.out.println(endTime);

		System.out.println("Time Taken by StringBuffer " + (endTime - startTime) + " ms");

		StringBuilder sb1 = new StringBuilder("Java");

		startTime = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
			sb1.append("J2EE");
		}

		endTime = System.currentTimeMillis();

		System.out.println("=============================");

		System.out.println(startTime);
		System.out.println(endTime);

		System.out.println("Time Taken by StringBuilder " + (endTime - startTime) + " ms");

	}

}
