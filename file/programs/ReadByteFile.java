package com.sjcet.file.programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadByteFile {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		FileInputStream fis = new FileInputStream("myfile.txt");
		int i;
		while ((i = fis.read()) != -1) {
            System.out.print((char) i);
        }
		fis.close();
	}

}
