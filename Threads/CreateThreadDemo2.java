package threadsDemo;

public class CreateThreadDemo2 implements Runnable{
	public void run(){  
	    System.out.println("My first thread is in running state.");  
	  }   
	  public static void main(String args[]){
		  CreateThreadDemo2 obj=new CreateThreadDemo2();
		  Thread thread = new Thread(obj);
		  thread.start(); 
		  
	  }  

}
