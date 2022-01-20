package com.sjcet.db;
import java.sql.*;
public class JDBCCreateDBDemo {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	
	static final String DB_URL = "jdbc:mysql://localhost:3306/";
	
	//Database username & password
	static final String USER = "admin";
	static final String PWD = "sjcet123";
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = null;
		Statement statement = null;
		//1. Register JDBC Driver
		Class.forName(JDBC_DRIVER);
		
		//2. Open a connection
		System.out.println("Connecting to DB....");
		con = DriverManager.getConnection(DB_URL,USER,PWD);
		
		//3. Create Statement
		statement = con.createStatement();
		
		//4.Execute a Query
		String sql = "create database student";
		boolean result = statement.execute(sql);
		if(result) {
			System.out.println("Data base created successfully...");
		}
		
		
	}

}
