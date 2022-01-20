package com.sjcet.file.programs;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteByteFile {

	public static void main(String[] args) throws IOException,FileNotFoundException {
		  String mycontent = "This is my Data which needs" +
		     " to be written into the file";
	      FileOutputStream fos = new FileOutputStream("myfile.txt");
		  		  /*String content cannot be directly written into
		   * a file. It needs to be converted into bytes
		   */
		  byte[] bytesArray = mycontent.getBytes();
		  fos.write(bytesArray);
		  fos.flush();
		  System.out.println("File Written Successfully");
	      fos.close();
	}
}
	


