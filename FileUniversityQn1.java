/**
 * @author Sarju
 * Date: 06-04-2020
 * 
 */
 /* University Question December 2019
 * Write a Java program to create a new file named ‘MyFile.txt’ 
 * and write the statement “This is the University Exam for OODP. 
 * This a program to illustrate the use of files.” into 
 * the file with each sentence in the statement representing a 
 * new line in the file.
 * 
 */

package javaStreamDemo;

import java.io.FileWriter;
import java.io.IOException;

public class FileUniversityQn1 {
	public static void main(String[] args) throws IOException {
		FileWriter fileWriter = new FileWriter("MyFile.txt");
		String input = "This is the University Exam for OODP.This a program to illustrate the use of files.";
		
		//An array of strings generated  by splitting the given string.
		//Please be sure that it is given as "\\.", otherwise it will not work
		String[] arrOfStr = input.split("\\."); 
		
		//Loop which iterates through the array of strings to get the sentences
		for (String a : arrOfStr) {
			
			//Concatenate "\n" to the existing sentence to write the content in new line in the file
			fileWriter.write(a+"\n");
		}
		
		fileWriter.close();
    }

}
