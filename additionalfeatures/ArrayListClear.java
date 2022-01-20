package com.sjcet.additionalfeatures;

import java.util.ArrayList;

public class ArrayListClear {

	public static void main(String[] args) {
		// create an arrayList
        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("JavaScript");
        languages.add("Python");
        System.out.println("Programming Languages: " + languages);

        // remove all elements
        languages.clear();
        System.out.println("ArrayList after clear(): " + languages);

	}

}
