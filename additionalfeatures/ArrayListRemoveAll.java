package com.sjcet.additionalfeatures;

import java.util.ArrayList;

public class ArrayListRemoveAll {

	public static void main(String[] args) {
		// create an arrayList
        ArrayList<String> languages = new ArrayList<>();

        // add elements to arrayList
        languages.add("Java");
        languages.add("JavaScript");
        languages.add("Python");
        System.out.println("Programming Languages: " + languages);

        // remove all elements from arrayList
        languages.removeAll(languages);
        System.out.println("ArrayList after removeAll(): " + languages);

	}

}
