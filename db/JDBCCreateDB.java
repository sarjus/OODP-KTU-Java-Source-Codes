package com.sjcet.db;

import java.sql.*;
public class JDBCCreateDB {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/";
	
	// 1. Database User name & Password
	static final String USER = "admin";
	static final String PWD = "sjcet123";
	
	public static void main(String[] args) {
		Connection con = null;
		Statement statement = null;
		try {
			// 2. Register JDBC driver
			Class.forName(JDBC_DRIVER);
			
			// 3. Open a connection
			System.out.println("Connecting to database...");
			con = DriverManager.getConnection(DB_URL, USER,PWD);
			
			// 4. Execute a query
			System.out.println("Creating database...");
			statement = con.createStatement();
			
			String sql = "create database student";
			boolean result = statement.execute(sql);
			System.out.println(result);
			System.out.println("Database created successfully...");
			} 
		catch (SQLException e) {
			System.out.println(e.getMessage());
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		finally {
			try {
				if (statement != null)
					statement.close();
				if (con != null)
					con.close();
			} 
			catch (SQLException e) {
				
			}

		}
	}
}