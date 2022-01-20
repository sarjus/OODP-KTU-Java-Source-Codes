package com.sjcet.db;


import java.sql.*;
public class JDBCCreateTable {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB = "jdbc:mysql://localhost:3306/student";
	
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
			con = DriverManager.getConnection(DB, USER,PWD);
			
			// 4. Execute a query
			System.out.println("Creating Table..");
			statement = con.createStatement();
			
			String sql = "create table user " +
			"(roll_number integer not null, " +
					" first_name varchar(50), " +
			" last_name varchar(50), " +
					" age integer, " +
			" primary key ( roll_number ))";
			
			int i = statement.executeUpdate(sql);
			System.out.println("Table Created,"+"Value of i="+i);
			} 
		catch (SQLException e) {
			System.out.println(e.getMessage());
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		finally {
			try {
				System.out.println("Closing Connection");
				if (statement != null)
					statement.close();
				if (con != null)
					con.close();
				} 
			catch (SQLException e) {
					System.out.println(e.getMessage());
			}
		}
		System.out.println("Ending Program..");
	}
}