package com.sjcet.morefeatures;

public class ExceptionDemo {

	public static void main(String args[]) {
	      int firstNumber, secondNumber;
	      try {
	         /* We suspect that this block of statement can throw 
	          * exception so we handled it by placing these statements
	          * inside try and handled the exception in catch block
	          */
	         firstNumber = 0;
	         secondNumber = 62 / firstNumber;
	         System.out.println(secondNumber);
	         System.out.println("Hey I'm at the end of try block");
	      }
	      catch (ArithmeticException e) { 
	         /* This block will only execute if any Arithmetic exception 
	          * occurs in try block
	          */
	         System.out.println("You should not divide a number by zero");
	      }
	      finally{
	    	  System.out.println("I'm final block, exception can't block my execution");
	      }
	      
	      
	   }

}
