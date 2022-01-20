/**
* The VectorAccessElementDemo program implements an application that
* simply demonstrates the different ways to Access elements in Vector
*
* @author  Sarju S
* @version 1.0
* @since   2020-09-24
*/

package com.sjcet.basicPrograms;

import java.util.Iterator;
import java.util.Vector;

public class VectorAccessElementDemo {

	public static void main(String[] args) {
		Vector<String> animals= new Vector<>();
        animals.add("Dog");
        animals.add("Horse");
        animals.add("Cat");

        // Using get()
        String element = animals.get(2);
        System.out.println("Element at index 2: " + element);

        // Using iterator()
        Iterator<String> iterate = animals.iterator();
        System.out.print("Vector: ");
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print("\t");
        }//end of while

	}//end of main

}//end of class
