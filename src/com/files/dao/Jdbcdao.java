package com.files.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.files.JdbcConnect;
import com.files.entitty.student;

public class Jdbcdao {
	JdbcConnect jc;
	Connection c;
	Statement st;
	ResultSet r;
	student s;
	Scanner sc;
	
	public Jdbcdao() {
		s = new student();
		sc = new Scanner(System.in);
		try {
					
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Found");
			
			String url = "jdbc:mysql://localhost:3306/tony";
			String username = "root";
			String password = "Ratnesh@2345";
			c = DriverManager.getConnection(url, username, password);
			
			if(c.isClosed())
				System.out.println("Connection is closed");
			else
				System.out.println("Connection established");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void getRecords()
	{
		String q = "Select * from student";
		
		try {
			
			st = c.createStatement();
			r = st.executeQuery(q);
			
			while(r.next())
			{
				s.setAge(r.getInt(3));
				s.setEmail(r.getString(6));
				s.setId(r.getString(1));
				s.setName(r.getString(2));
				s.setPhone(r.getLong(4));
				s.setGender(r.getString(5));
				System.out.println(s.toString());
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void getRecordsById(String id) {
		
		// TODO Auto-generated method stub
		String q = "Select * from student where id = '" + 
		id + "'";
		
		try {
			st = c.createStatement();
			r = st.executeQuery(q);
			
			while(r.next())
			{
				s.setAge(r.getInt(3));
				s.setEmail(r.getString(6));
				s.setId(r.getString(1));
				s.setName(r.getString(2));
				s.setPhone(r.getLong(4));
				s.setGender(r.getString(5));
				System.out.println(s.toString());
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void getRecordsByName(String name) {
		// TODO Auto-generated method stub
		String q = "Select * from student where name = '" 
		+ name + "'";
		try {
			st = c.createStatement();
			r = st.executeQuery(q);
			while(r.next())
			{
				s.setAge(r.getInt(3));
				s.setEmail(r.getString(6));
				s.setId(r.getString(1));
				s.setName(r.getString(2));
				s.setPhone(r.getLong(4));
				s.setGender(r.getString(5));
				System.out.println(s.toString());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void getRecordsByCity(String city) {
		// TODO Auto-generated method stub
		String q = "Select * from student where city = '" 
		+ city + "'";
		try {
			st = c.createStatement();
			r = st.executeQuery(q);
			while(r.next())
			{
				s.setAge(r.getInt(3));
				s.setEmail(r.getString(6));
				s.setId(r.getString(1));
				s.setName(r.getString(2));
				s.setPhone(r.getLong(4));
				s.setGender(r.getString(5));
				System.out.println(s.toString());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public int totalstudents()
	{
		String q = "Select count(*) from student";
		
		try {
			st = c.createStatement();
			r = st.executeQuery(q);
			if(r.next())
//			System.out.println(r.getInt(1));
			return r.getInt(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}
	public void registerEmployee() {
		// TODO Auto-generated method stub
		student s = new student();
		
		int totalstudents = totalstudents() + 2;
		
		String id = "s" + ++totalstudents;
		System.out.println(id);
		
		s.setId(id);
		System.out.println("Enter student name:");
		s.setName(sc.nextLine());
		
		System.out.println("Enter student age:");
		s.setAge(sc.nextInt());
		 
		sc.nextLine();
		System.out.println("Enter student email:");
		s.setEmail(sc.nextLine());
		
		System.out.println("Enter student phone:");
		s.setPhone(sc.nextLong());
		sc.nextLine();
		System.out.println("Enter gender:");
		s.setGender(sc.nextLine());	
		
		String q = "insert into student (id, name, age, phone, gender, email) values ('" + 
		s.getId()+"', '"+ 
		s.getName()+  "', '" + 
		s.getAge() + "', '" + 
		s.getPhone() + "', '" + 
		s.getGender() + "', '" + 
		s.getEmail()+ "')";
		
		try {
			st = c.createStatement();
			int n = st.executeUpdate(q);
			if(n > 0)
				System.out.println("Query executed " + n + "rows affected");
			else {
				System.out.println("Query not executed");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void deleteEmployeeById(String id) {
		// TODO Auto-generated method stub
		String q = "delete from student where id = '" +
		id+"'";
		try {
			st = c.createStatement();
			int n = st.executeUpdate(q);
			if(n > 0)
				System.out.println("Query executed " + n + "rows affected");
			else {
				System.out.println("Query not executed");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
