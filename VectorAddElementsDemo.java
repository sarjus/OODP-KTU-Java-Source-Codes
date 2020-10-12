/**
* The VectorAddElementsDemo program implements an application that
* simply demonstrates the different ways to add elements in Vector
*
* @author  Sarju S
* @version 1.0
* @since   2020-09-24
*/
package com.sjcet.basicPrograms;

import java.util.Vector;

public class VectorAddElementsDemo {

	public static void main(String[] args) {
		Vector<String> mammals= new Vector<>();

        // Using the add() method
        mammals.add("Dog");
        mammals.add("Horse");

        // Using index number
        mammals.add(2, "Cat");
        System.out.println("Vector: " + mammals);

        // Using addAll()
        Vector<String> animals = new Vector<>();
        animals.add("Crocodile");

        animals.addAll(mammals);
        System.out.println("New Vector: " + animals);

	}

}
