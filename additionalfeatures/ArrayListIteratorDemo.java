package com.sjcet.additionalfeatures;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteratorDemo {
	public static void main(String[] args){
	    ArrayList<String> languages = new ArrayList<>();

	    // Add elements in the array list
	    languages.add("Java");
	    languages.add("Python");
	    languages.add("JavaScript");
	    languages.add("Swift");
	       
	    //Get Index of Each Element of ArrayList Using iterator()
	    Iterator<String> nextiterator = languages.iterator();
	    // loop through ArrayList till it has all elements
	    // Use methods of Iterator to access elements
	    while(nextiterator.hasNext()){

	      // access element
	      String element = nextiterator.next();
	      System.out.print(element + ": ");

	      // access index of each element
	      System.out.println(languages.indexOf(element));
	    }
	  }

}
