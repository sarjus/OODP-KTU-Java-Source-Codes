/**
* The UnaryOperatorDemo program implements an application that
* simply demonstrates Unary Operators in Java.
*
* @author  Sarju S
* @version 1.0
* @since   2020-09-18 
*/
package com.sjcet.basicPrograms;

public class UnaryOperatorDemo {
	public static void main(String[] args) {
		int counter = +1;        // counter is now 1
        System.out.println(counter);
        
        counter--;        // counter is now 0
        System.out.println(counter);

        counter++;        // counter is now 1
        System.out.println(counter);

        counter = -counter;        // counter is now -1
        System.out.println(counter);

        boolean success = false;        
        System.out.println(success); // false       
        System.out.println(!success);// true

	}

}
