/**
* The FreqOfCharacter program implements an application that
* that finds the frequency of a given character in a string
*
* @author  Sarju S
* @version 1.0
* @since   2020-10-01 */
package com.sjcet.basicPrograms;

import java.util.Scanner;

public class FreqOfCharacter {
	public static void main(String[] args) {
		String input;
		int count=0;
		System.out.println("Please Enter the String:");
		Scanner sc = new Scanner(System.in);
		input =sc.nextLine();
		//Converting string to lower case 
		String inputCopy = input.toLowerCase();
		System.out.println("Please Enter the Character to Search:");
		char charToSearch = sc.next().charAt(0);//Read a character using Scanner Class
		//Converting character to lower case 
		char charToSearchCopy = Character.toLowerCase(charToSearch);
		char [] array = inputCopy.toCharArray();
		for(char ch:array) {
			if(ch==charToSearchCopy) {
				count++;
			}
		}//end for
	System.out.println("The frequency of a given character:"+charToSearch+" in the string: "+input+ " is: "+count);
	}// end main

}
