package com.sjcet.oopdemo;
class Recursion{
	public void reduceByOne(int n) {
		if(n>=0) {
			reduceByOne(n-1);
		}
		System.out.println("Completed Call: " + n);
	}
}
public class RecursionDemo {

	public static void main(String[] args) {
		Recursion test = new Recursion();
		test.reduceByOne(10);
	}

}
