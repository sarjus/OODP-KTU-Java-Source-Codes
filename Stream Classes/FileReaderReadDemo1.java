package javaStreamDemo;
/**
 * @author Sarju
 * Date: 03-04-2020
 * Description: Demonstrates read() method in FileReader Class
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class FileReaderReadDemo1 {
	public static void main(String[] args) throws IOException,FileNotFoundException{
		File file = new File("input.txt");
		FileReader reader = new FileReader(file);;
		int i;
		while ((i=reader.read())!= -1){
			System.out.print((char)i);
		}
		if (reader != null){
			reader.close();
		}
			
	}
}


