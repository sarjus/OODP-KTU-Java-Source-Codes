/**
* The SortArrayDemo program implements an application that
* simply demonstrates use of Arrays.sort to sort the array
*
* @author  Sarju S
* @version 1.0
* @since   2020-09-24
*/
package com.sjcet.basicPrograms;

import java.util.Arrays;

public class SortArrayDemo {

	public static void main(String[] args) {
		int intArr[] = { 10, 20, 15, 22, 35 }; 
		
		Arrays.sort(intArr); 
		
		System.out.println("The sorted Array is:");
		for(int element:intArr) {
			System.out.print(element+" ");
		}

	}

}
