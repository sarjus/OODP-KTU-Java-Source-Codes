package com.sjcet.oopdemo;

public class VarargOverloadDemo {
	private static void test(int ... args){
        int sum = 0;
        for (int i: args) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }

    private static void test(boolean p, String ... args){
        System.out.println("Boolean value received = " + p);
        System.out.println("Arguments Length = "+ args.length);
    }

    public static void main( String[] args ) {
        test(1, 2, 3);
        test(true, "Hello", "World");
    }

}
