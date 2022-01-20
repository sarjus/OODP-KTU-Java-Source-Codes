/**
* The SearchArrayDemo program implements an application that
* simply demonstrates use of Arrays.binarySearch to serach an element in the Array
*
* @author  Sarju S
* @version 1.0
* @since   2020-09-24
*/
package com.sjcet.basicPrograms;

import java.util.Arrays;

public class SearchArrayDemo {

	public static void main(String[] args) {
		int intArr[] = { 10, 20, 15, 22, 35 }; 
		
		//Binary Search requires Arrays to be sorted first  
        Arrays.sort(intArr); 
        
      //Element to search
        int intKey = 22; 
        
        System.out.println(intKey + " found at index = "
                           + Arrays.binarySearch(intArr, intKey)); 
	}

}
