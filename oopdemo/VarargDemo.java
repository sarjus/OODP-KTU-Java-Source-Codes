package com.sjcet.oopdemo;

public class VarargDemo {
	public static int sumOfNumber(int...args){
        System.out.println("Argument length: " + args.length);
        int sum = 0;
        for(int x: args){
            sum += x;
        }
        return sum;
    }

    public static void main( String[] args ) {
        
        int sum2 = sumOfNumber(2, 4);
        System.out.println("sum2 = " + sum2);

        int sum3 = sumOfNumber(1, 3, 5);
        System.out.println("sum3 = " + sum3);

        int sum4 = sumOfNumber(1, 3, 5, 7);
        System.out.println("sum4 = " + sum4);
    }

}
