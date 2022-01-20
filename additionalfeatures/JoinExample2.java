package com.sjcet.additionalfeatures;

public class JoinExample2 {
	public static void main(String[] args) {
	      Thread th1 = new Thread(new MyClass2(), "th1");
	      Thread th2 = new Thread(new MyClass2(), "th2");
	      Thread th3 = new Thread(new MyClass2(), "th3");
	         
	      th1.start();
	      th2.start();        
	      th3.start();
	   }
	}
	 
	class MyClass2 implements Runnable{
	 
	    @Override
	    public void run() {
	    	Thread t = Thread.currentThread();
	        System.out.println("Thread started: "+t.getName());
	        try {
	            Thread.sleep(4000);
	        } catch (InterruptedException ie) {
	            ie.printStackTrace();
	        }
	        System.out.println("Thread ended: "+t.getName());    
	    }

}
