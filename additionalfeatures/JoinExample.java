package com.sjcet.additionalfeatures;

public class JoinExample {
	static int sum=0;
    public static void main(String a[]) throws InterruptedException {
        MyThread thread_1=new MyThread();
        thread_1.start();       //starting thread_1
        thread_1.setPriority(4);
        System.out.println(Thread.currentThread().getPriority());
        thread_1.join();      
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(sum);   //main thread printing the sum
        //here main wants to wait till completion of run method,
        //when we use join then there is no need to wait such a long time.
    }}class MyThread extends Thread{
        public void run(){
        	
            for(int i=0;i<10;i++){
            	JoinExample.sum=JoinExample.sum+i;
            }

            ///thousands of lines
        }

}
