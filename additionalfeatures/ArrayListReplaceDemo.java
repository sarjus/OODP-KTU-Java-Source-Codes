package com.sjcet.additionalfeatures;

import java.util.ArrayList;

public class ArrayListReplaceDemo {
	public static void main(String[] args) {

	    // create an ArrayList
	    ArrayList<String> languages = new ArrayList<>();

	    // add elements to ArrayList
	    languages.add("Python");
	    languages.add("English");
	    languages.add("JavaScript");
	    System.out.println("ArrayList: " + languages);

	    // replace element at index 1
	    String element = languages.set(1, "Java");
	    System.out.println("Updated ArrayList: " + languages);
	    System.out.println("Replaced Element: " + element);
	    
	    String newElement = languages.set(3, "PHP");
	    System.out.println("Updated ArrayList: " + languages);
	    System.out.println("Replaced Element: " + newElement);
	    
	    
	  }

}
