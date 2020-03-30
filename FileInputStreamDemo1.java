package javaStreamDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo1 {
	 public static void main(String[] args) throws FileNotFoundException, IOException {

	        String fileName = "input.txt";
            FileInputStream fis = new FileInputStream(fileName); 
            //System.out.println(fis.read());
            char c1 = (char) fis.read();
	        char c2 = (char) fis.read();
	        char c3 = (char) fis.read();
	        System.out.println(c1);
	        System.out.println(c2);
	        System.out.println(c3);
	        
	    }

}
