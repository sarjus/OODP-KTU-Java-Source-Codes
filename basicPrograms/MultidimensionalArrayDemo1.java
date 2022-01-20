/**
* The MultidimensionalArrayDemo1 program implements an application that
* simply demonstrates use of for loop to iterate through the 2D Array
*
* @author  Sarju S
* @version 1.0
* @since   2020-09-24
*/
package com.sjcet.basicPrograms;

public class MultidimensionalArrayDemo1 {

	public static void main(String[] args) {
		int[][] anArray = {
	            {1, -2, 3}, 
	            {-4, -5, 6, 9}, 
	            {7}, 
	        };
		
	        for (int i = 0; i < anArray.length; ++i) {
	            for(int j = 0; j < anArray[i].length; ++j) {
	                System.out.print(anArray[i][j]+"\t");
	            }
	            System.out.print("\n");
	        }

	}

}
