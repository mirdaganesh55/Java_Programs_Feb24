package com.java.feb1;

public class Voting {
	
	private String name;
	private int age;
	private Gender gender;
	private String aadharId;
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
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getAadharId() {
		return aadharId;
	}
	public void setAadharId(String aadharId) {
		this.aadharId = aadharId;
	}
	@Override
	public String toString() {
		return "Voting [name=" + name + ", age=" + age + ", gender=" + gender + ", aadharId=" + aadharId + "]";
	}
	public Voting(String name, int age, Gender gender, String aadharId) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.aadharId = aadharId;
	}
	public Voting() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Voting(String name2, int age2, String aadharId2) {
		// TODO Auto-generated constructor stub
	}
}
