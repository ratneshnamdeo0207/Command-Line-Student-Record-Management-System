package com.files.entitty;

public class student {
	
	private String id;
	private String name;
	private char gender;
	private int age;
	private long phone;
	private String email;
	
	public student(String id, String name, char gender, int age, long phone, String email) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.phone = phone;
		this.email = email;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(String s) {
		char c = s.charAt(0);
		this.gender = c;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	@Override
	public String toString() {
		System.out.println("---------------------------------");
		System.out.println("Student details:\nStudent Id\t : \t" + id + ",\nStudent-name\t : \t" + name + ",\nGender\t\t : \t" + gender + ",\nAge\t\t : \t" + age + ",\nPhone Number\t : \t" + phone
				+ ",\nEmail\t\t : \t" + email);
		System.out.println("---------------------------------");
		return "";
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}

}
