/**
* The program, ContinueStatementDemo , steps through a String, 
* counting the occurences of the letter "p". 
* If the current character is not a p, the continue statement skips 
* the rest of the loop and proceeds to the next character. 
* If it is a "p", the program increments the letter count
*
* @author  Sarju S
* @version 1.0
* @since   2020-09-22 
*/
package com.sjcet.basicPrograms;

public class ContinueStatementDemo {

	public static void main(String[] args) {
		String searchMe = "peter piper picked a peck of pickled peppers";
        int max = searchMe.length();//find the length of the string
        int numPs = 0;// Variable to count number of P's

        for (int i = 0; i < max; i++) {
            // interested only in p's
            if (searchMe.charAt(i) != 'p')
                continue;

            // process p's
            numPs++;
        }//end of for
        System.out.println("Found " + numPs + " p's in the string.");
	}//end of main
}// end of class
