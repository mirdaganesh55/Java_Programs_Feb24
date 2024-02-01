package com.java.feb1;

import java.util.Date;

public class Customer {
	
	private String name;
	private Date Dob;
	private Gender gender;
	private int aadharId;
	private String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return Dob;
	}
	public void setDob(Date dob) {
		Dob = dob;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public int getAadharId() {
		return aadharId;
	}
	public void setAadharId(int aadharId) {
		this.aadharId = aadharId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", Dob=" + Dob + ", gender=" + gender + ", aadharId=" + aadharId
				+ ", address=" + address + "]";
	}
	public Customer(String name, Date dob, Gender gender, int aadharId, String address) {
		super();
		this.name = name;
		Dob = dob;
		this.gender = gender;
		this.aadharId = aadharId;
		this.address = address;
	}
	public Customer() {
		super();
	}
}
