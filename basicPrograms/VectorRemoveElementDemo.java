/**
* The VectorRemoveElementDemo program implements an application that
* simply demonstrates the different ways to Remove elements in Vector
*
* @author  Sarju S
* @version 1.0
* @since   2020-09-24
*/

package com.sjcet.basicPrograms;

import java.util.Vector;

public class VectorRemoveElementDemo {

	public static void main(String[] args) {
		Vector<String> animals= new Vector<>();
        animals.add("Dog");
        animals.add("Horse");
        animals.add("Cat");

        System.out.println("Initial Vector: " + animals);

        // Using remove()
        String element = animals.remove(1);
        System.out.println("Removed Element: " + element);
        System.out.println("New Vector: " + animals);

        // Using clear()
        animals.clear();
        System.out.println("Vector after clear(): " + animals);

	}

}
