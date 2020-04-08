package threadsDemo;
/**
* @author Sarju S
* Date: 08/04/2020
* Description: Demonstrate thread is Java by Extending Thread Class
*/
public class CreateThreadDemo1 extends Thread{

	public void run(){  
	    System.out.println("My first thread is in running state.");  
	  }   
	  public static void main(String args[]){
		  CreateThreadDemo1 obj=new CreateThreadDemo1();
		  obj.start(); 
		  //obj.start(); // throws IllegalThreadStateException 
	  }  
}
