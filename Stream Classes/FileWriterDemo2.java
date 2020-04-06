/**
 * @author Sarju
 * Date: 04-04-2020
 * Description: Demonstrates write(char[] charArray) method in FileReader Class
 */
package javaStreamDemo;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo2 {
	public static void main(String[] args) throws IOException {
		char[] data = "This is FileWriter Demo using write(char[] charArray).".toCharArray();
		FileWriter fileWriter = new FileWriter("file.txt");
			//inherited method from java.io.Writer 
			fileWriter.write(data);
			fileWriter.close();
	
	}
	

}
