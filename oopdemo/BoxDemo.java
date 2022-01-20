/* A program that uses the Box class.
Call this file BoxDemo.java
*/
package com.sjcet.oopdemo;

import java.util.Scanner;

//class
class Box{
	double height;
	double depth;
	double width;
	public void setDimension(double height, double depth, double width) {
		this.height =height;
		this.width =width;
		this.depth = depth;
	}
	public double calculateVolume(double height, double depth, double width) {
		double volume = height*depth*width;
		return volume;
		
	}
}
// This class declares an object of type Box.
class BoxDemo {
	public static void main(String args[]) {
		Box myBox = new Box();
		System.out.println("Please enter the height, width and depth of the box:");
		Scanner sc = new Scanner(System.in);
		double height = sc.nextDouble();
		double width= sc.nextDouble();
		double depth = sc.nextDouble();
		myBox.setDimension(height, width, depth);
		System.out.println("Height= "+myBox.height);
		System.out.println("Depth= "+myBox.depth);
		System.out.println("Width="+myBox.width);
		double volume =myBox.calculateVolume(height, depth, width);
		System.out.println("Volume of the box with dimensions: "+height+" "+depth+" "+width+" is :"+volume);
	
	}
}
;