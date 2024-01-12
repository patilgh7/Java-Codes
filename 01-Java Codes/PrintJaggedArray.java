package com.demo;

import java.util.Iterator;
import java.util.Scanner;

public class PrintJaggedArray {

	public static void main(String[] args) {
		
		// Jagged Array means odd number of columns
		// 2*3 matrix here 2 row and columns are 3
		// 4*5 matrix here 4 row and 5 columns
		// 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter row ");
		int row = sc.nextInt();

		System.out.println("Enter column ");
		int col = sc.nextInt();
		
		int matrix[][] = new int[row][col];
		
		System.out.println("Fill Matrix ");
		
		for(int i = 0; i < matrix.length; i++) 
		{
			for(int j = 0; j < matrix[i].length; j++) // j < matrix[i].length ...this is important condition
			{
				matrix[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Print Matrix");
		
		for(int i = 0; i < matrix.length; i++) 
		{
			for(int j = 0; j < matrix[i].length; j++)  // j < matrix[i].length ...this is important condition
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

}
