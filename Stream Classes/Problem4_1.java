/**
 * 
 */
package javaStreamDemo;

/**
 * @author Sarju S
 * Date: 06/04/2020
 * Description: Generate 100 Random Numbers in Java
 *
 */
import java.util.Random; 
public class Problem4_1 {
	public static void main(String[] args) {
		
		// create instance of Random class 
        Random rand = new Random(100); 
        int randNumber;
        System.out.println("The Generated Random Numbers are:");
        for(int i=0;i<100;i++) {
        	// Generate random integers in range 0 to 999
            randNumber = rand.nextInt(1000); 
    		System.out.print(randNumber+" ");
        }
        

	}

}
