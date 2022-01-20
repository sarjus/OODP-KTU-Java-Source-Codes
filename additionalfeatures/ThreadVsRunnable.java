package com.sjcet.additionalfeatures;

//Implement Runnable Interface...
class CounterImplementsRunnable implements Runnable {

private int counter = 0;

public void run() {
  counter++;
  System.out.println("ImplementsRunnable : Counter : " + counter);
}
}

//Extend Thread class...
class CounterExtendsThread extends Thread {

private int counter = 0;

public void run() {
  counter++;
  System.out.println("ExtendsThread : Counter : " + counter);
}
}

//Use the above classes here in main to understand the differences more clearly...
public class ThreadVsRunnable {
	public static void main(String args[]) throws Exception {
		// Multiple threads share the same object.
		CounterImplementsRunnable rc = new CounterImplementsRunnable();
		
		Thread ithread1 = new Thread(rc);
		ithread1.start();
		Thread.sleep(1000); // Waiting for 1 second before starting next thread
		
		Thread ithread2 = new Thread(rc);
		ithread2.start();
		Thread.sleep(1000); // Waiting for 1 second before starting next thread
		
		Thread ithread3 = new Thread(rc);
		ithread3.start();
		
		// Creating new instance for every thread access.
		CounterExtendsThread ethread1 = new CounterExtendsThread();
		ethread1.start();
		Thread.sleep(1000); // Waiting for 1 second before starting next thread
		
		CounterExtendsThread ethread2 = new CounterExtendsThread();
		ethread2.start();
		Thread.sleep(1000); // Waiting for 1 second before starting next thread
		
		CounterExtendsThread ethread3 = new CounterExtendsThread();
		ethread3.start();
	}
}
