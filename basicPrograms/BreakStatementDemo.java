/**
* The BreakStatementDemo program implements an application that
* simply demonstrates use of unlabeled  break statement in Java.
*
* @author  Sarju S
* @version 1.0
* @since   2020-09-22 
*/
package com.sjcet.basicPrograms;

public class BreakStatementDemo {

	public static void main(String[] args) {
		int[] arrayOfNumbers = 
            { 32, 87, 3, 589,
              12, 1076, 2000,
              8, 622, 127 };
        int searchfor = 12;

        int i;
        boolean foundIt = false;
        

        for (i = 0; i < arrayOfNumbers.length; i++) {
            if (arrayOfNumbers[i] == searchfor) {
                foundIt = true;
                break;
            }// end of if
        }//end of for

        if (foundIt) {
            System.out.println("Found " + searchfor + " at index " + i);
        } //end of if
        else {
            System.out.println(searchfor + " not in the array");
        }//end of else
	}//end of main
}//end of class
