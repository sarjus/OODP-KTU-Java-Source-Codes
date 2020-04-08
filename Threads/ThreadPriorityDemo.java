package threadsDemo;
import java.lang.*; 
public class ThreadPriorityDemo extends Thread {
	public void run() 
    { 
        System.out.println("Inside run method"); 
    } 
  
    public static void main(String[]args) 
    { 
    	ThreadPriorityDemo firstThread = new ThreadPriorityDemo(); 
    	ThreadPriorityDemo secondThread = new ThreadPriorityDemo(); 
    	ThreadPriorityDemo thirdThread = new ThreadPriorityDemo(); 
  
        System.out.println("firstThread thread priority : " + 
                              firstThread.getPriority()); // Default 5 
        System.out.println("secondThread thread priority : " + 
                              secondThread.getPriority()); // Default 5 
        System.out.println("thirdThread thread priority : " + 
                              thirdThread.getPriority()); // Default 5 
  
        firstThread.setPriority(2); 
        secondThread.setPriority(5); 
        thirdThread.setPriority(8); 
  
        // thirdThread.setPriority(21); will throw IllegalArgumentException 
        System.out.println("firstThread thread priority : " + 
                              firstThread.getPriority());  //2 
        System.out.println("secondThread thread priority : " + 
                              secondThread.getPriority()); //5 
        System.out.println("thirdThread thread priority : " + 
                              thirdThread.getPriority());//8 
  
        // Main thread 
        System.out.print(Thread.currentThread().getName()); 
        System.out.println("Main thread priority : "
                       + Thread.currentThread().getPriority()); 
  
        // Main thread priority is set to 10 
        Thread.currentThread().setPriority(10); 
        System.out.println("Main thread priority : "
                       + Thread.currentThread().getPriority()); 
    } 

}
