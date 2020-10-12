/**
* The EqualityRelationalOperatorDemo program implements an application that
* simply demonstrates Equality/Relational Operators in Java.
*
* @author  Sarju S
* @version 1.0
* @since   2020-09-18 
*/
package com.sjcet.basicPrograms;

public class EqualityRelationalOperatorDemo {
	public static void main(String[] args) {
		int firstValue = 1;
        int secondValue = 2;
      //Equality Operators
        if(firstValue == secondValue)
            System.out.println("firstValue == secondValue");
        if(firstValue != secondValue)
            System.out.println("firstValue != secondValue");
        
        //Relational Operators
        if(firstValue > secondValue)
            System.out.println("firstValue > secondValue");
        if(firstValue < secondValue)
            System.out.println("firstValue < secondValue");
        if(firstValue <= secondValue)
            System.out.println("firstValue <= secondValue");
      
	}
}
