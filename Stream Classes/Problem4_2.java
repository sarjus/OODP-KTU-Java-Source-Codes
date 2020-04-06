/**
 * 
 */
package javaStreamDemo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
 * @author Sarju S
 * Date: 06/04/2020
 * Description: Generate 100 Random Numbers and Write it in the file RandomNumbers.txt.
 */
public class Problem4_2 {

	public static void main(String[] args) throws IOException {
		// create instance of Random class 
        Random rand = new Random(100); 
        int randNumber;
        FileWriter fileWriter = new FileWriter("RandomNumbers.txt");
        for(int i=0;i<100;i++) {
        	// Generate random integers in range 0 to 999
            randNumber = rand.nextInt(1000);
            fileWriter.write(randNumber+"\t"+"");
                      
        }
        
        fileWriter.close();

	}

}
