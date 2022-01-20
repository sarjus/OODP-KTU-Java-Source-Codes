/**
* The BreakStatementDemo program implements an application that
* simply demonstrates use of labeled break statement in Java.
*
* @author  Sarju S
* @version 1.0
* @since   2020-09-22 
*/
package com.sjcet.basicPrograms;

public class BreakStatementDemo2 {
	public static void main(String[] args) {
		int[][] arrayOfNumbers = { 
	            { 32, 87, 3, 589 },
	            { 12, 1076, 2000, 8 },
	            { 622, 127, 77, 955 }
	        };
	        int searchfor = 12;

	        int i;
	        int j = 0;
	        boolean foundIt = false;
	    search:
	        for (i = 0; i < arrayOfNumbers.length; i++) {
	            for (j = 0; j < arrayOfNumbers[i].length;j++) {
	                if (arrayOfNumbers[i][j] == searchfor) {
	                    foundIt = true;
	                    break search;
	                }//end if 
	            }//end j loop
	        }//end i loop
	        System.out.println("i="+i+" j="+j);
	        if (foundIt) {
	            System.out.println("Found " + searchfor + " at " + i + ", " + j);
	        } else {
	            System.out.println(searchfor + " not in the array");
	        }
	}//end main
}// end class
