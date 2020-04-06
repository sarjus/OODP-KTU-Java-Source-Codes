/* Java Program demonstration of the method 
 * java.io.FileOutputStream.write(byte[] b, int off, int len) /*
 */
package javaStreamDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamDemo3 {
	public static void main(String[] args) throws IOException {
	      FileOutputStream fout = null;
	      FileInputStream fin = null;
	      byte[] b = {65,66,67,68,69};
	   // create new file output stream
	      fout = new FileOutputStream("test.txt");
	      // writes byte to the output stream
	      fout.write(b, 2, 3);
	      fout.close();
	      fin = new FileInputStream("test.txt");
	         System.out.println("Characters printed:");
	         
	         byte[] buffer = new byte[5];
	         
	         // read stream data into buffer
	         fin.read(buffer, 2, 3);
	         String value = new String(buffer, StandardCharsets.UTF_8); 
	         // prints character
	            System.out.print(value);
	            fin.close();
	}

}
