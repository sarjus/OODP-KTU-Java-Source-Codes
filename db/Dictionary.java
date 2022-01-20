//Write a Java application program that simulates a simple dictionary. 
//There exists a dictionary database and a table contain a set of English 
//words and there meaning. The program accepts an English word from the user, 
//look up in the database and retrieve the meaning, if available. 
//The result is communicated back to the user.
package com.sjcet.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Dictionary {
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		//Registering DB
		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		//Data Base
		final String DB = "jdbc:mysql://localhost:3306/student";
		
		// Database User name & Password
		final String USER = "admin";
		final String PWD = "sjcet123";
		
		Connection con = null;
		PreparedStatement ps = null;
		try{
			Class.forName(JDBC_DRIVER);
			con = DriverManager.getConnection(DB, USER,PWD);
			
			System.out.println("Enter the word to search");
			String word = sc.next();
			//Table name dictionary
			ps = con.prepareStatement("select meaning from dictionary where word=?");
			ps.setString(1, word);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				String meaning = rs.getString("meaning");
				System.out.println("The meaning of the word "+word+ " is: "+meaning);
			}
			else {
	    	System.out.println("Word " + word+ "Not found");
	    	}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
