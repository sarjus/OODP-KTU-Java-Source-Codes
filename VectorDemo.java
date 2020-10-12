package com.sjcet.basicPrograms;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// create default vector 
		Vector<Integer> v1 = new Vector<>();
		System.out.println("Vector 1 size="+v1.capacity());
		for(int i=0;i<11;i++) {
			v1.add(i);			
		}
		System.out.println("Vector 1: "+v1);
		System.out.println("Vector 1 size="+v1.capacity());
		
		Vector<Integer> v2 = new Vector<>(5);
		System.out.println("Vector 2 size="+v2.capacity());
		for(int i=0;i<6;i++) {
			v2.add(i);			
		}
		System.out.println("Vector 2: "+v2);
		System.out.println("Vector 2 size="+v2.capacity());
		
		Vector<Integer> v3 = new Vector<>(5,1);
		System.out.println("Vector 3 size="+v3.capacity());
		for(int i=0;i<6;i++) {
			v3.add(i);			
		}
		System.out.println("Vector 3: "+v3);
		System.out.println("Vector 3 size="+v3.capacity());
		
		Vector<Integer> v4 = new Vector<>(v3);
		v4.add(1,25);
		v4.add(1,50);
		v4.addAll(v1);
		System.out.println("Vector 4 size="+v4.capacity());
		System.out.println("Vector 4: "+v4);
		//System.out.println(v4.get(3));
		v4.remove(0);
		v4.removeAllElements();
		Iterator <Integer> iterate = v4.iterator();
		while(iterate.hasNext()) {
			System.out.println(iterate.next());
		}
		
		
	}

}
