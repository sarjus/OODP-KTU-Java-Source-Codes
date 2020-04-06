/**
 * @author Sarju
 * Date: 03-04-2020
 * Description: Demonstrates read(char[] charArray, int off, int len) method in FileReader Class
 */
package javaStreamDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class FileReaderReadDemo3{
	public static void main(String[] args) throws FileNotFoundException,IOException{
		File file = new File("input.txt");
		FileReader reader = new FileReader(file);
			char[] cs = new char[100];
			reader.read(cs, 10, 7);
			for (char c : cs) {
				System.out.print(c);
			}
		reader.close();
	}
	

}
