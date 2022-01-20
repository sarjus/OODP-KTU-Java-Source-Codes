/**
* The ArithmeticDemo program implements an application that
* simply demonstrates use of Arithmetic Operators in Java.
*
* @author  Sarju S
* @version 1.0
* @since   2020-09-18 
*/
package com.sjcet.basicPrograms;

public class ArithmeticDemo{
	public static void main(String[] args){
		int counter = 1 + 2; // counter is now 3
        System.out.println("1 + 2 = " + counter);
        int originalcounter = counter;
        
        counter = counter - 1;    // counter is now 2
        System.out.println(originalcounter + " - 1 = " + counter);
        originalcounter = counter;

        counter = counter * 2;    // counter is now 4
        System.out.println(originalcounter + " * 2 = " + counter);
        originalcounter = counter;

        counter = counter / 2;    // counter is now 2
        System.out.println(originalcounter + " / 2 = " + counter);
        originalcounter = counter;

        counter = counter + 8;    // counter is now 10
        System.out.println(originalcounter + " + 8 = " + counter);
        originalcounter = counter;

        counter = counter % 7;    // counter is now 3
        System.out.println(originalcounter + " % 7 = " + counter);

	}

}
