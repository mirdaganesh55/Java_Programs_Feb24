package com.java.feb2;

public class Student3 {
	
	private int rollNo;
	public String name;
	String department;
	protected double percentage;
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public Student3(int rollNo, String name, String department, double percentage) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.department = department;
		this.percentage = percentage;
	}
	
	public Student3() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", department=" + department + ", percentage="
				+ percentage + "]";
	}
}
