/**
 * @author Sarju
 * Date: 03-04-2020
 * Description: Demonstrates skip(long n) method in FileReader Class
 */
package javaStreamDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderSkipDemo {
	public static void main(String[] args)throws FileNotFoundException,IOException {
		File file = null;
		FileReader reader = null;
		
			file = new File("input.txt");
			reader = new FileReader(file);
			//skip first 6 characters
			reader.skip(10);
			int i;
			while ((i=reader.read())!= -1) {
				System.out.print((char)i);
			}
		
				if (reader != null) {
					reader.close();
				}
		}
	}


