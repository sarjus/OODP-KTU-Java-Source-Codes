package com.sjcet.file.programs;

import java.io.FileWriter;
import java.io.IOException;

public class WriteCharFile {

	public static void main(String[] args) throws IOException {
		String mycontent = "This is my Data which needs" +
			     " to be written into the file";
		FileWriter fw = new FileWriter("input.txt");
		fw.write(mycontent);
		fw.flush();
		fw.close();
		System.out.println("File Written Successfully");

	}

}
