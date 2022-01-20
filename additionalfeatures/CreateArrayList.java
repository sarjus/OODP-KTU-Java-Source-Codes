package com.sjcet.additionalfeatures;

import java.util.ArrayList;

public class CreateArrayList {
	public static void main(String[] args){

	    // create ArrayList
	    ArrayList<String> languages = new ArrayList<String>();

	    // Add elements to ArrayList
	    languages.add("Java");
	    languages.add("Python");
	    languages.add("Swift");
	    System.out.println("ArrayList: " + languages);
	    
	    //Add elements at a position
	    languages.add(0, "C");
	    
	    System.out.println("Modified ArrayList: " + languages);
	  }

}
