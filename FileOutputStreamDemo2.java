/* Java Program demonstration of the method 
 * java.io.FileOutputStream.write(byte[] b) /*
 */
package javaStreamDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;  
public class FileOutputStreamDemo2 {
	public static void main(String args[]){    
        try{    
          FileOutputStream fout=new FileOutputStream("testout.txt");    
          byte[] b = {65,66,67,68,69};
          	
       // writes bytes to the output stream
          fout.write(b);
          fout.close(); 
          System.out.println("Writing into the file operation completed");
          System.out.println("Reading from the file operation started");
          FileInputStream fis = new FileInputStream("testout.txt");
          //System.out.println(fis.available());
          byte[] buf = new byte[fis.available()]; 
          fis.read(buf); 
          String value = new String(buf, StandardCharsets.UTF_8); 
          System.out.print(value);
          fis.close();
  		
         }catch(Exception e){System.out.println(e);}    
   }   


}
