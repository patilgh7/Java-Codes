package com.lambda;

public class Main {

	public static void main(String[] args) {
		
		SumInter s = (int a, int b)->{return a+b;};

		System.out.println(s.sum(5, 20));
		
		SumInter s2 = (a,b)->a*b;
		
		System.out.println(s2.sum(25, 25));
	}

}
