/**
* The BitwiseOperatorDemo program implements an application that
* simply demonstrates use of Bitwise Operators in Java.
*
* @author  Sarju S
* @version 1.0
* @since   2020-09-18 
*/
package com.sjcet.basicPrograms;

public class BitwiseOperatorDemo {

	public static void main(String[] args) {
		// Bitwise OR
		int firstNumber = 12; // 12 = 00001100 (In Binary)
		int secondNumber = 25;//25 = 00011001 (In Binary)
		int result = firstNumber | secondNumber; //00001100 | 00011001 = 00011101  = 29 (In decimal)
		System.out.println("The result after Bitwise OR operation is: "+result );
		
		//Bitwise AND
		result = firstNumber & secondNumber; //00001100 & 00011001 = 000001000  = 8 (In decimal)
		System.out.println("The result after Bitwise AND operation is: "+result );
		
		//Bitwise XOR
		result = firstNumber ^ secondNumber;//00001100 ^ 00011001 = 00010101  = 21 (In decimal)
		System.out.println("The result after Bitwise XOR operation is: "+result );
		
		//Signed Left Shift
		firstNumber = 212;//212 (In binary: 11010100)
		System.out.println(firstNumber << 1);//212 << 1 evaluates to 424 (In binary: 110101000)
    	System.out.println(firstNumber << 0);//212 << 0 evaluates to 212 (In binary: 11010100)
    	System.out.println(firstNumber << 4);//212 << 4 evaluates to 3392 (In binary: 110101000000)
    	
    	//Signed Right Shift
    	System.out.println(firstNumber >> 1);//212 >> 1 evaluates to 106 (In binary: 01101010)
    	System.out.println(firstNumber >> 0);//212 >> 0 evaluates to 212 (In binary: 11010100)
    	System.out.println(firstNumber >> 8);//212 >> 8 evaluates to 0 (In binary: 00000000)

	}
}
