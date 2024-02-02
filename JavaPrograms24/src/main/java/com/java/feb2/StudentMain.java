package com.java.feb2;

import java.util.ArrayList;

public class StudentMain {
	
	public static void main(String[] args) {
		
		 ArrayList<Student3> studentList = new ArrayList<>();
		 
		Student3 s1 = new Student3();
		s1.setRollNo(1);
		s1.name = "Akash Kumar";
		s1.department = "Science";
		s1.percentage = 98.90;
		studentList.add(s1);
		
	   	Student3 s2 = new Student3();
		s2.setRollNo(2);
		s2.name = "Rajesh Rathore";
		s2.department = "Docter";
		s2.percentage = 55.90;
		studentList.add(s2);
		
		for (Student3 student : studentList) {
			System.out.println(student);
		}
	}
	
}
