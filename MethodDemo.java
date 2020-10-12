
package com.sjcet.oopdemo;

class Square{
	public int calculateSquare(int number) {
		return number*number;
	}
}
public class MethodDemo {

	public static void main(String[] args) {
		
		int number =10;
		Square square = new Square();
		int squareOfNumber = square.calculateSquare(number);
		System.out.println("The Square of Number "+number+" is: "+squareOfNumber);
	}

}
