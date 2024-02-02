package com.java.feb2;

public class Student {
	
	private int rollNo;
	private String name;
	private String department;
	private double percentage;
	
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student2 [rollNo=" + rollNo + ", name=" + name + ", department=" + department + ", percentage="
				+ percentage + "]";
	}
	public Student(int rollNo, String name, String department, double percentage) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.department = department;
		this.percentage = percentage;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
}
