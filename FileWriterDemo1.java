/**
 * @author Sarju
 * Date: 04-04-2020
 * Description: Demonstrates write(int c)/write(String str) 
 * method in FileReader Class
 */
package javaStreamDemo;
import java.io.FileWriter;
import java.io.IOException;
public class FileWriterDemo1 {
	public static void main(String[] args) throws IOException{
		FileWriter fileWriter = new FileWriter("file.txt");;
		//inherited method from java.io.OutputStreamWriter 
		fileWriter.write(65);
		fileWriter.write(66);
		fileWriter.write(67);
		fileWriter.write("\nEFG");
		fileWriter.close();					
	}

}
