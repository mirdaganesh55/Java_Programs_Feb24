package com.java.feb8;

public class Person {
	
	private int personId;
    private String name;
    // Using Integer as a wrapper class
    private Integer age; 
    private Boolean isStudent;
    
    
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Boolean getIsStudent() {
		return isStudent;
	}
	public void setIsStudent(Boolean isStudent) {
		this.isStudent = isStudent;
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", age=" + age + ", isStudent=" + isStudent + "]";
	}
	public Person(int personId, String name, Integer age, Boolean isStudent) {
		super();
		this.personId = personId;
		this.name = name;
		this.age = age;
		this.isStudent = isStudent;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
}
