/**
* The MultidimensionalArrayDemo program implements an application that
* simply demonstrates use of Enhanced for loop to iterate through the 2D Array
*
* @author  Sarju S
* @version 1.0
* @since   2020-09-24
*/
package com.sjcet.basicPrograms;

public class MultidimensionalArrayDemo {

	public static void main(String[] args) {
		// create a 2d array
        int[][] anArray = {
            {1, -2, 3}, 
            {-4, -5, 6, 9}, 
            {7}, 
        };
      
        // first for...each loop access the individual array
        // inside the 2d array
        for (int[] innerArray: anArray) {
            // second for...each loop access each element inside the row
            for(int element: innerArray) {
                System.out.print(element+"\t");
            }
            System.out.print("\n");
        }

	}

}
