package com.sjcet.db;


import java.sql.*;
public class JDBCInsertRecord {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB = "jdbc:mysql://localhost:3306/student";
	
	// 1. Database User name & Password
	static final String USER = "admin";
	static final String PWD = "sjcet123";
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		try {
			
			// 2. Register JDBC driver
			Class.forName(JDBC_DRIVER);
			
			// 3. Open a connection
			System.out.println("Connecting to database...");
			con = DriverManager.getConnection(DB, USER, PWD);
			
			// 4. Execute a query
			System.out.println("Inserting record..");
			stmt = con.createStatement();
			
			String sql = "INSERT INTO user values"
					+ "(2,'Sam','George',23),"
					+"(3,'Anil','Pate',21),"
					+"(1,'Ram','Naik',20)";
			int i = stmt.executeUpdate(sql);
			System.out.println("Rows inserted: "+i);
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
				if (stmt != null)
					stmt.close();
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
