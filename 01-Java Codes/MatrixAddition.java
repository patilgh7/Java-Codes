package com.demo;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Row : ");
		int row = sc.nextInt();
		
		System.out.println("Enter Column : ");
		int column = sc.nextInt();
		
		int matrix1[][] = new int[row][column];
		
		int matrix2[][] = new int[row][column];
		
		int sum[][] = new int[row][column];
		
		// Fill 1st Matrix
		System.out.println("Fill 1st Matrix : ");
		for(int i = 0; i < matrix1.length; i++) {
			    for(int j = 0; j < matrix1.length; j++) {
			    	matrix1[i][j] = sc.nextInt();
			    }
		}
		
		// Fill 2nd Matrix 
		System.out.println("Fill 2nd Matrix : ");
		for(int i = 0; i < matrix2.length; i++) {
			for(int j = 0; j < matrix2.length; j++) {
				
				matrix2[i][j] = sc.nextInt();
			}
		}
		
		// Print 1st Matrix
		System.out.println("Print 1st Matrix : ");
		for(int i = 0; i < matrix1.length; i++) {
			for(int j = 0; j < matrix1.length; j++) {
				
				System.out.print(matrix1[i][j]+" ");
			}
			System.out.println();
		}
	
		// Print 2nd Matrix
		System.out.println("Print 2nd Matrix : ");
		for(int i = 0; i < matrix2.length; i++) {
			for(int j = 0; j < matrix2.length; j++) {
				System.out.print(matrix2[i][j]+" ");
			}
			System.out.println();
		}
		
		// Sum of Two Matrix 
		System.out.println("Sum of Two Matrix : ");
		
		for(int i = 0; i < sum.length; i++) {
			for(int j = 0; j < sum.length; j++) {
				sum[i][j]= matrix1[i][j] + matrix2[i][j];
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}

	}

}
