/**
* The SwapNumbers program implements an application that
* swap two given numbers using of Bitwise XOR in Java.
* Displays the result to the standard output
*
* @author  Sarju S
* @version 1.0
* @since   2020-09-18 
*/
package com.sjcet.basicPrograms;

public class SwapNumbers {

	public static void main(String[] args) {
		int firstNumber = 10; // Binary equivalent of 10 is 1010
		int secondNumber = 5;// Binary equivalent of 5 is 0101
		
		System.out.println("The First number before swapping:"+firstNumber);
        System.out.println("The Second number before swapping:"+secondNumber);
        
        firstNumber = firstNumber ^ secondNumber;//firstNumber becomes 1111 = 15
        secondNumber = firstNumber ^ secondNumber;//secondNumber becomes 1010 = 10
        firstNumber = firstNumber ^ secondNumber;//firstNumber becomes 0101 = 5
        
        System.out.println("The First number after swapping:"+firstNumber);
        System.out.println("The Second number after swapping:"+secondNumber);

	}

}
