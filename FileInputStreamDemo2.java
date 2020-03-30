/*Java Program to demonstrate read() function
 * returns -1 when end of file is reached
 */
package javaStreamDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo2 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		String fileName = "input.txt";
		FileInputStream fis = new FileInputStream(fileName);
		int ch;
	while ((ch = fis.read()) != -1) {
		System.out.print((char) ch);
	}
	System.out.println();
	System.out.println(ch);
}

}
