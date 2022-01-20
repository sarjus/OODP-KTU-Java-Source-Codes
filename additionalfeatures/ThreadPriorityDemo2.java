package com.sjcet.additionalfeatures;

public class ThreadPriorityDemo2 extends Thread{
	public void run(){  
		   System.out.println("running thread name is:"+Thread.currentThread().getName()+" and priority is:"+Thread.currentThread().getPriority());  
		  
		  }  
		 public static void main(String args[]){  
			 ThreadPriorityDemo2 firstThread =new ThreadPriorityDemo2();  
			 ThreadPriorityDemo2 secondThread=new ThreadPriorityDemo2(); 
			 firstThread.setName("First Thread");
			 secondThread.setName("Second Thread");
			 System.out.println("The Main Class Thread Priority"+Thread.currentThread().getPriority());
			 firstThread.setPriority(Thread.MIN_PRIORITY);  
			 secondThread.setPriority(Thread.MAX_PRIORITY);  
			 firstThread.start();  
			 secondThread.start();  
		   
		 }  

}
