/**
* The TernaryOperatorDemo program implements an application that
* find big number among two given numbers using of Ternary Operator in Java.
* Displays the result to the standard output
*
* @author  Sarju S
* @version 1.0
* @since   2020-09-18 
*/
package com.sjcet.basicPrograms;

public class TernaryOperatorDemo {

	public static void main(String[] args) {
		int firstNumber = 1;
        int secondNumber = 2;
        int bigNumber;
        bigNumber = firstNumber>secondNumber ? firstNumber : secondNumber;
        
        System.out.println("I am "+ bigNumber+ ", the Big Number");

	}

}
