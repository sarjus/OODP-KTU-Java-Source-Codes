//Write a Java program to store the marks of students corresponding to three subjects in database. The program should provide provision for the following.
//1.	Create a table in database corresponding to a particular class.
//2.	Find student who topped the class.
//3.	Find the average class marks for a given subject.

package com.sjcet.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class GradeCard {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB = "jdbc:mysql://localhost:3306/student";
	
	// 1. Database User name & Password
	static final String USER = "admin";
	static final String PWD = "sjcet123";
	
	public static void main(String[] args){
		Connection con = null;
		Statement statement = null;
		try{
			// 2. Register JDBC driver
			Class.forName(JDBC_DRIVER);
			
			// 3. Open a connection
			System.out.println("Connecting to database...");
			con = DriverManager.getConnection(DB, USER,PWD);
			
			// 4. Executing query for Create a table in database corresponding to a particular class
			System.out.println("Creating Table..");
			statement = con.createStatement();
				String sql = "create table class " +
				"(roll_number integer not null, " +
						" first_name varchar(50), " +
				" last_name varchar(50), " +
						" subject1 integer, " +
						" subject2 integer, " +
						" subject3 integer, " +
						" total integer, " +
				" primary key ( roll_number ))";
				
			statement.executeUpdate(sql);
			System.out.println("Table Created");
			
			// 5. Executing  query for inserting values into table including total marks
			sql = "INSERT INTO `class` VALUES"+
				"(3,'Mahismathi','Kattappa',40,50,60,150)," +
						"(2,'Mahendra','Bahubali',62,31,45,138),"+
						"(1,'Suresh','Gopi',85,77,99,261)";
				statement.executeUpdate(sql);
			System.out.println("Values Inserted");
			
			// 6. Executing  query for retrieving values table in the descending order of the total marks
				//So the first row will be the student details who is top in the class
			sql = "SELECT roll_number, first_name, last_name, subject1, subject2, "+
				"subject3, total FROM class WHERE 1 ORDER BY `total` DESC ";
			ResultSet rs = statement.executeQuery(sql);
			if (rs.next()){
				// Retrieve by column name
				System.out.println("Student who topped the class");
				System.out.print("Roll Number: " + rs.getInt(1));
				System.out.print(", First Name: " + rs.getString(2));
				System.out.println(", Last Name: " + rs.getString(3));
			}
			rs.close();
			
			//Read the subject name from the user
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the subject whose average is to be find:");
			String subject = sc.next();
			
			// 7. Executing  query for Find the average class marks for a given subject.
			sql="SELECT AVG("+subject+") FROM class";
			rs = statement.executeQuery(sql);
			if(rs.next()){
				System.out.println("Average marks in the "+subject+" is: "+ rs.getFloat(1));
			}
				   
			//8. Close Connection
			statement.close();
			con.close();
			rs.close();
			sc.close();
		}
		catch (SQLException e){
			System.out.println(e.getMessage());
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		} 
	}
}
