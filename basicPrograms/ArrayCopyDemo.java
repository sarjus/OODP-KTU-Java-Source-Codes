/**
* The ArrayCopyDemo program implements an application that
* simply demonstrates use of System.arraycopy to copy contents one array to another
*
* @author  Sarju S
* @version 1.0
* @since   2020-09-24
*/
package com.sjcet.basicPrograms;

public class ArrayCopyDemo {

	public static void main(String[] args) {
		char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
			    'i', 'n', 'a', 't', 'e', 'd' };
        char[] copyTo = new char[7];

        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        
        System.out.println(new String(copyTo));

	}

}
