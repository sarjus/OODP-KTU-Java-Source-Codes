package com.sjcet.db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUpdateRecord {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB = "jdbc:mysql://localhost/student";
	
	// 1. Database User name & Password
	static final String USER = "admin";
	static final String PWD = "sjcet123";
	
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		String sql = "";
		try {
			// 2. Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");
			
			// 3. Open a connection
			System.out.println("Connecting to database...");
			con = DriverManager.getConnection(DB, USER, PWD);
			
			// 4. Execute a query
			System.out.println("Records :");
			stmt = con.createStatement();
			
			sql = "update user set age = 10 where roll_number = 1";
			stmt.executeUpdate(sql);
			
			sql = "update user set age = 20 where roll_number = 2";
			stmt.executeUpdate(sql);
			
			sql = "update user set age = 30 where roll_number = 3";
			stmt.executeUpdate(sql);
			
			sql = "select roll_number,age,first_name,last_name from user";
			ResultSet rs = stmt.executeQuery(sql);
			
			// 5. Fetch Details
			while (rs.next()) {
				// Retrieve by column name
				int id = rs.getInt("roll_number");
				int age = rs.getInt("age");
				String first = rs.getString("first_name");
				String last = rs.getString("last_name");
				
				// Display values
				System.out.print("Roll : " + id);
				System.out.print(", Age : " + age);
				System.out.print(", First : " + first);
				System.out.println(", Last : " + last);
			}
			rs.close();
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
			}
		}
	}
}
