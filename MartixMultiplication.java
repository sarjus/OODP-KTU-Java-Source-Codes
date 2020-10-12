package com.sjcet.basicPrograms;

import java.util.Scanner;
public class MartixMultiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows in the first matrix:");
		int r1 = sc.nextInt();
		System.out.println("Enter the number of columns in the first matrix:");
		int c1 = sc.nextInt();
		int [][]firstMatrix = new int[r1][c1];
		System.out.println("Enter the elements");
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				firstMatrix[i][j] = sc.nextInt();
			}//end for j
		}//end for i
		
		System.out.println("Enter the number of rows in the second matrix:");
		int r2 = sc.nextInt();
		System.out.println("Enter the number of columns in the second matrix:");
		int c2 = sc.nextInt();
		if(r1==c2) {
			int [][]secondMatrix = new int[r2][c2];
			System.out.println("Enter the elements");
			for(int i=0;i<r2;i++) {
				for(int j=0;j<c2;j++) {
					secondMatrix[i][j] = sc.nextInt();
				}//end for j
			}//end for i
		
			System.out.println("The first matrix is:");
			for(int[] row : firstMatrix) {
				for (int column : row) {
					System.out.print(column + "\t");
				}
				System.out.println();
			}
		
		
			System.out.println("The second matrix is:");
			for(int[] row : secondMatrix) {
				for (int column : row) {
					System.out.print(column + "\t");
				}
				System.out.println();
			}
			int [][] productMatrix = new int[r1][c2];
				//Matrix Multiplication
			for(int i=0;i<r1;i++) {
				for(int j=0;j<c2;j++) {
					productMatrix[i][j]=0;
					for(int k=0;k<c1;k++) {
						productMatrix[i][j] = productMatrix[i][j]+ firstMatrix[i][k] * secondMatrix[k][j];
					}//end k
					
				}//end j
			}//end i
			System.out.println("The product matrix is:");
			for(int[] row : productMatrix) {
	            for (int column : row) {
	                System.out.print(column + "\t");
	            }
	            System.out.println();
	        }
		}//end if
		else {
			System.out.println("Matrix Multiplication is not possible");
		}
		
		
	}

}
