/*Java Program to demonstrate int read(byte []b)*/
package javaStreamDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileInputStreamDemo3 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		String fileName = "input.txt";
		FileInputStream fis = new FileInputStream(fileName);
		//System.out.println(fis.available());
		byte[] buf = new byte[fis.available()]; 
		fis.read(buf); 
		String value = new
		String(buf, StandardCharsets.UTF_8); 
		System.out.print(value);
		
	}
}
