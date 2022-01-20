package com.sjcet.calculator;

public class MyCalculator {
	public int add(int a, int b){
		return a+b;
	}
	public static void main(String[] args) {
		MyCalculator obj = new MyCalculator();
		System.out.println(obj.add(10, 20));
	}

}
