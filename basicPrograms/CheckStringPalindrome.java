/**
* The CheckStringPalindrome program implements an application that
* that checks whether a given string is a palindrome or not
*
* @author  Sarju S
* @version 1.0
* @since   2020-10-01 */
package com.sjcet.basicPrograms;

import java.util.Scanner;

public class CheckStringPalindrome {

	public static void main(String[] args) {
		String word;
        Scanner sc=new Scanner(System.in);
        boolean isPalindrome = true;
        System.out.println("Please enter the string to check whether it is palindrome or not: ");
        word=sc.nextLine();
        String copy = word; //for future reference
        //Converting the string to lower case so that it can accept Malayalam and malayalam as same
        word=word.toLowerCase();
        int length=word.length();
        for(int i=0;i<(length/2);i++){
        	//comparing first and last character in the string 
        	if((word.charAt(i))!=(word.charAt(length-i-1))){
                //String is not Palindrome
        		isPalindrome = false;
                break;
            }//end if
        }
        if(isPalindrome) {
        	System.out.println("The Given String "+copy+" is Palindrome");
        }
        else {
        	System.out.println("The Given String "+copy+" is not Palindrome");
        }
    }// end main 
}


