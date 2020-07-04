//Define two user defined exception ‘EvenNumberException’ and ‘OddNumberException’. 
//Write a Java class which has a method which checks whether a given number if even or not.
//The method throws ‘EvenNumberException’ or ‘OddNumberException’ if the number is even or odd respectively. 
//Illustrate the handling of the exception with suitable sequence of codes. 
import java.util.Scanner;
class EvenNumberException extends Exception{
	public EvenNumberException(String s){
		// Call constructor of parent Exception 
        super(s); 
    } 
} 
class OddNumberException extends Exception{
	public OddNumberException(String s){ 
        // Call constructor of parent Exception 
        super(s); 
    } 
} 
public class UserDefinedExceptionDemo{
	public static void main(String args[]){
		try{
			System.out.println("Enter an even or odd number:");
			Scanner sc = new Scanner(System.in);
        	int number = sc.nextInt();
        	if(number%2==0){
        		throw new EvenNumberException("Even Number Exception"); 
        	}
        	else { 
                throw new OddNumberException("Odd Number Exception"); 
        	}
        } 
        catch (EvenNumberException ex){
        	System.out.print("Caught-> "); 
            System.out.println(ex.getMessage()); 
        } 
        catch (OddNumberException ex){ 
            System.out.print("Caught ->");
            System.out.println(ex.getMessage()); 
        } 
        
    } 
}
