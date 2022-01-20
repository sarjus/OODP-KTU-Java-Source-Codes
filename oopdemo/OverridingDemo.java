package com.sjcet.oopdemo;
//Using run-time polymorphism
class Figure {
	double dim1;
	double dim2;
	Figure(double a, double b) {
	dim1 = a;
	dim2 = b;
	}
	double area() {
		System.out.println("Area for Figure is undefined.");
		return 0;
	}
}
class Rectangle extends Figure {
	Rectangle(double a, double b) {
		super(a, b);
	}
	// override area for rectangle
	double area() {
		System.out.println("Inside Area for Rectangle.");
		return dim1 * dim2;
	}
}
class Triangle extends Figure{
	Triangle(double a, double b){
		super(a,b);
	}
	// override area for Triangle
	double area() {
		System.out.println("Inside Area for Rectangle.");
		return dim1 * dim2/2;
	}
}
public class OverridingDemo {

	public static void main(String[] args) {
		Figure f = new Figure(10, 10);
		Rectangle r = new Rectangle(9, 5);
		System.out.println("Area is " + r.area());
		Triangle t = new Triangle(15, 7);
		System.out.println("Area is " + t.area());

	}

}
