package com.files;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnect {

	Connection c;
	Statement st;
	ResultSet r;
	public JdbcConnect() {
		// TODO Auto-generated constructor stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver found");
			String url = "jdbc:mysql://localhost:3306/tony";
			String username = "root";
			String password = "Ratnesh@2345";
			c = DriverManager.getConnection(url, username, password);
			if(c.isClosed())
				System.out.println("Connection is closed");
			else
				System.out.println("Connection established");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
