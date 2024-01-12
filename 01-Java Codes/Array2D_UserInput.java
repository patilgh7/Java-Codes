package com.demo;

import java.util.Scanner;

public class Array2D_UserInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter row : ");
		int row = sc.nextInt();
		
		System.out.println("Enter column : ");
		int column = sc.nextInt();
		
		int matrix[][] = new int[row][column];
		
		// Fill the matrix
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix.length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		// Print the matrix
		
		System.out.println("Matrix : ");
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}

	}

}
