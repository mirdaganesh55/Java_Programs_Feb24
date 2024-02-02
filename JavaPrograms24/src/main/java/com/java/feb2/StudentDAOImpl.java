package com.java.feb2;

import java.util.HashMap;
import java.util.Map;

public class StudentDAOImpl implements StudentDAO {
	
	private Map<Integer, Student> studentMap;

    public StudentDAOImpl() {
        // Initializing the map in the constructor
        studentMap = new HashMap<>();
    }

    // Create (Add) operation
    public void addStudent(Student student) {
        studentMap.put(student.getRollNo(), student);
    }

    // Read (Retrieve) operation
    public Student getStudent(int rollNo) {
        return studentMap.get(rollNo);
    }

    // Update operation
    public void updateStudent(Student student) {
        // Assuming the rollNo is not updated, otherwise, you may need to handle it differently
        int rollNo = student.getRollNo();
        if (studentMap.containsKey(rollNo)) {
        	System.out.println("If "+rollNo);
            studentMap.put(rollNo, student);
            
        } else {
            System.out.println("Student with Roll No " + rollNo + " not found for update.");
        }
    }

    // Delete operation
    public void deleteStudent(int rollNo) {
        studentMap.remove(rollNo);
    }

    // Display all students
    public void displayAllStudents() {
        for (Student student : studentMap.values()) {
            System.out.println(student);
        }
    }
	
}
