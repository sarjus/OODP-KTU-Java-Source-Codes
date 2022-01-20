package com.sjcet.basicPrograms;

public class CompareStringPerformance {

	public static void main(String[] args) {
		long start1 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++)
{
  String s1 = "Hello World";
  String s2 = "Welcome";
}
       long end1 = System.currentTimeMillis();
long total_time = end1 - start1;
System.out.println("Time taken to execute"+ 
      " string literal = " + total_time);
      long start2 = System.currentTimeMillis();
       for (int i = 0; i < 10000; i++)
{
  String s3 = new String("Hello World");
  String s4 = new String("Welcome ");
}
    long end2 = System.currentTimeMillis();
long total_time1 = end2 - start2;
System.out.println("Time taken to execute"+
         " string object=" + total_time1);
	}

}
