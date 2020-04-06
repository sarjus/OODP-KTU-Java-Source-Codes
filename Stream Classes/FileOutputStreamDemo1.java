/* Java Program demonstration of the method 
 * java.io.FileOutputStream.write(int b) /*
 */
package javaStreamDemo;

import java.io.FileOutputStream;  
public class FileOutputStreamDemo1 {
	public static void main(String args[]){    
        try{    
          FileOutputStream fout=new FileOutputStream("testout.txt");    
          fout.write(66);    
          fout.close();    
          System.out.println("success...");    
         }catch(Exception e){System.out.println(e);}    
   }   

}
