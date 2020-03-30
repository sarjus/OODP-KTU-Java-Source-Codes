/*Java Program to demonstrate java.io.InputStream.read(byte[] b, int off, int len) method*/
package javaStreamDemo;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class FileInputStreamDemo4 {
	public static void main(String[] args) throws Exception {
		InputStream fis = null;
		byte[] buffer = new byte[5];
		char c;
		try{
			// new input stream created
	         fis = new FileInputStream("input.txt");
	         System.out.println("Characters printed:");
	         
	         // read stream data into buffer
	         fis.read(buffer, 1, 3);
	         String value = new String(buffer, StandardCharsets.UTF_8); 
	         
	         // prints character
	            System.out.print(value);
	         
	         
	      } catch(Exception e) {
	         // if any I/O error occurs
	         e.printStackTrace();
	      } finally {
	         // releases system resources associated with this stream
	         if(fis!=null)
	            fis.close();
	      }
	   }

}
