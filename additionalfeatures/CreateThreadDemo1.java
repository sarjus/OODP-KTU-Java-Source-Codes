package com.sjcet.additionalfeatures;

import java.util.Random;

/**
* @author Sarju S
* Date: 08/04/2020
* Description: Demonstrate thread is Java by Extending Thread Class
*/
public class CreateThreadDemo1 extends Thread{

	public void run(){  
		Random objGenerator = new Random();
        for (int iCount = 0; iCount< 10; iCount++){
          int randomNumber = objGenerator.nextInt(100);
          System.out.println("Random No : " + randomNumber); 
         }
	  }   
	  public static void main(String args[]){
		  CreateThreadDemo1 obj=new CreateThreadDemo1();
		  obj.start(); 
		  
		  
		  //obj.start(); // throws IllegalThreadStateException 
	  }  
}
