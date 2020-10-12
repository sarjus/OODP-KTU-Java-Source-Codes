/**
* The TypecastingDemo program implements an application that
* simply demonstrates type casting in Java.
* Reference: https://docs.oracle.com/javase/tutorial/java/
*
* @author  Sarju S
* @version 1.0
* @since   2020-09-18 
*/
package com.sjcet.basicPrograms;

public class TypecastingDemo {

	public static void main(String[] args) {
		//Implicit 
		byte a=10;
		int b = a;
		float f = 124.15F;
		double d = f;
		//Explicit
		byte c = (byte) a;
		float newFloat = (float) d;
	}

}
