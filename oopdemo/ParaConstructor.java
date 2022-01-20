package com.sjcet.oopdemo;
class Box4{
	double length;
	double width;
	double depth;
	Box4(double length, double width, double depth){
		this.length = length;
		this.width =width;
		this.depth =depth;		
	}
}
public class ParaConstructor {
	public static void main(String[] args) {
		Box4 myBox = new Box4(10.50,20.20,30.55);
		System.out.println("I am Box 1");
		System.out.println("My Length= "+myBox.length);
		System.out.println("My Width= "+myBox.width);
		System.out.println("My Depth= "+myBox.depth);
		
		System.out.println("I am Box 2");
		Box4 myBox1 = new Box4(23.50,78.75,50.55);
		System.out.println("My Length= "+myBox1.length);
		System.out.println("My Width= "+myBox1.width);
		System.out.println("My Depth= "+myBox1.depth);
		
	}
}
