/**
 * 
 */
package javaStreamDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 @author Sarju S
 * Date: 06/04/2020
 * Description: Generate Integer Numbers and Write it in the Console.
 */
public class Problem4_3 {
	void readFile(String filename) throws FileNotFoundException {
		
	}
	
	public static void main(String[] args) throws IOException {
		File file = new File("RandomNumbers.txt");
		Scanner scanner = new Scanner(file);
		while(scanner.hasNextInt()) {
			System.out.print(scanner.nextInt()+" ");
		}
		scanner.close();
	
	}

}
