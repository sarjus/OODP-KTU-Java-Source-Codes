package com.sjcet.file.programs;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCharFile {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("input.txt");
		char[] myContent = new char[100];
		fr.read(myContent);
		System.out.println(myContent);
		fr.close();

	}

}
