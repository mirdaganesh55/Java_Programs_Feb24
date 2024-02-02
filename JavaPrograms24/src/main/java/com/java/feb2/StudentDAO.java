package com.java.feb2;

public interface StudentDAO {
	
	void addStudent(Student student);

    // Read (Retrieve) operation
    Student getStudent(int rollNo);

    // Update operation
    void updateStudent(Student student);

    // Delete operation
    void deleteStudent(int rollNo);

    // Display all students
    void displayAllStudents();
	
}
