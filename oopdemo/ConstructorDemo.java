package com.sjcet.oopdemo;
class Box3{
	double length;
	double width;
	double depth;
	//Constructor
	Box3(){
		this.length =10;
		this.width = 17.50;
		this.depth = 34.50;
	}
}
public class ConstructorDemo {
	public static void main(String[] args) {
		Box3 myBox = new Box3();//constructor will be automatically trigger from here
		System.out.println("My Length= "+myBox.length);
		System.out.println("My Width= "+myBox.width);
		System.out.println("My Depth= "+myBox.depth);
	

	}

}
