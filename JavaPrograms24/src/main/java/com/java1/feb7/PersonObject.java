package com.java1.feb7;

public class PersonObject implements Cloneable {
	private int id;
	private String name;
	private int age;

	public PersonObject(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	// Getters and setters for the attributes

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	// Override toString() method to provide a string representation of the object

	@Override
	public String toString() {
		return "Person{" +
				"id=" + id +
				", name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}

