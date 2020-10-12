/**
* The ScopeDemo program implements an application that
* simply demonstrates scope of the variables in Java Program .
*
* @author  Sarju S
* @version 1.0
* @since   2020-09-16 
*/
package com.sjcet.basicPrograms;

public class ScopeDemo {

	public static void main(String[] args) {
		int x; // known to all code within main
		x = 10;
		if(x == 10) { // start new scope
			int y = 20; // known only to this block
			// x and y both known here.
			System.out.println("x and y: " + x + " " + y);
			x = y * 2;
		}
	//	y = 100; // Error! y not known here
		// x is still known here.
		System.out.println("x is " + x);
	}
}
