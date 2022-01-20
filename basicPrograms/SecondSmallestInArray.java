/**
* The SecondSmallestInArray program implements an application that
* that finds the second smallest element in an array
*
* @author  Sarju S
* @version 1.0
* @since   2020-10-01 */
package com.sjcet.basicPrograms;

import java.util.Scanner;

public class SecondSmallestInArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of elements in the integer array:");
		int noOfElements = sc.nextInt();
		int [] array = new int[noOfElements];
		System.out.println("Enter the "+noOfElements+" elements:");
		for(int i=0;i<noOfElements;i++) {
			array[i] = sc.nextInt();
		}
		int largest =array[0];
		int secondLargest = array[0];
		for (int i = 0; i < array.length; i++) {
			 
			if (array[i] > largest) {
				secondLargest = largest;
				largest = array[i];
 
			} else if (array[i] > secondLargest) {
				secondLargest = array[i];
 			}//end if-else if
		}//end for
		System.out.println("\nSecond largest number is:" + secondLargest);
		sc.close();
	}//end main
}
