package com.sjcet.file.programs;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class OddEvenFile {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		try{

			FileReader fin = new FileReader("oddeven.txt");
			BufferedReader br = new BufferedReader(fin);
			String inp = br.readLine();
			FileWriter oddfr = new FileWriter("odd.txt");
			FileWriter evenfr = new FileWriter("even.txt");
			for(String element: inp.split(" ")){
				if(Integer.parseInt(element)%2==0) {
					evenfr.write(element+" ");
				}
				else {
					oddfr.write(element+ " ");
				}
			}
			fin.close();
			oddfr.close();
			evenfr.close();
			}
			catch(IOException e){
			System.out.println(e.getMessage());
			}
	}

}
