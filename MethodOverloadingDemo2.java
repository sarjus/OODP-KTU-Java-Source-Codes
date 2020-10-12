package com.sjcet.oopdemo;


import java.util.Scanner;

class Area{
		void calculateArea(float r) {
		float area = 3.14f*r*r;
		System.out.println("Area of Circle with radius: "+r+" is: "+area);
	}
	void calculateArea(float base, float height) {
		float area = base*height*0.5f;
		System.out.println("Area of Triangle with base: "+base+" and height: "+height+" is: "+area);
	}
	void calculateArea(int width, int length) {
		int area = width*length;
		System.out.println("Area of Rectangle with width: "+width+" and length: "+length+" is: "+area);
	}
}
public class MethodOverloadingDemo2 {

	public static void main(String[] args) {
		Area area = new Area();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Base of the Triangle");
		float baseOfTriangle = sc.nextFloat();
		System.out.println("Enter the Height of the Triangle");
		float heightOfTraingle = sc.nextFloat();
	
		
		System.out.println("Enter the width of the Rectangle");
		int widthOfRectangle = sc.nextInt();
		System.out.println("Enter the Height of the Rectangle");
		int heightOfRectangle = sc.nextInt();
		
		
		System.out.println("Enter the Radius of the Circle");
		float radius = sc.nextFloat();
		area.calculateArea(baseOfTriangle,heightOfTraingle);
		area.calculateArea(widthOfRectangle,heightOfRectangle);
		area.calculateArea(radius);

	}

}
