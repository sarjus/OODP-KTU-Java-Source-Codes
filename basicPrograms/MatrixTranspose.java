/**
* The MatrixTranspose program implements an application that
* find the transpose of the given matrix and
*
* @author  Sarju S
* @version 1.0
* @since   2020-10-01 */
package com.sjcet.basicPrograms;

import java.util.Scanner;

public class MatrixTranspose {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows in the 2D matrix:");
		int noOfRows = sc.nextInt();
		System.out.println("Enter the number of columns in the 2D matrix:");
		int noOfcolumns = sc.nextInt();
		int [][]matrix = new int[noOfRows][noOfcolumns];
		System.out.println("Enter the elements");
		for(int i=0;i<noOfRows;i++) {
			for(int j=0;j<noOfcolumns;j++) {
				matrix[i][j] = sc.nextInt();
			}//end for j
		}//end for i
		System.out.println("The matrix is:");
		for(int i=0;i<noOfRows;i++) {
			for(int j=0;j<noOfcolumns;j++) {
				System.out.print(matrix[i][j]+"\t");
			}//end for j
			System.out.println();
		}// end for i
		int [][]Tmatrix = new int[noOfcolumns][noOfRows];
		for(int i=0;i<noOfcolumns;i++) {
			for(int j=0;j<noOfRows;j++) {
				Tmatrix[i][j] = matrix[j][i];
			}
		}
		System.out.println("The Transpose of the given matrix is:");
		for(int i=0;i<noOfcolumns;i++) {
			for(int j=0;j<noOfRows;j++) {
				System.out.print(Tmatrix[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
