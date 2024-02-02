package com.java.feb2;

public class StudentMain2 {
	
	public static void main(String[] args) {
        StudentDAOImpl studentDAO = new StudentDAOImpl();

        // Adding students
        Student s1 = new Student();
        s1.setRollNo(1);
        s1.setName("Akash Kumar");
        s1.setDepartment("Science");
        s1.setPercentage(98.90);
        studentDAO.addStudent(s1);

        Student s2 = new Student();
        s2.setRollNo(2);
        s2.setName("Rajesh Rathore");
        s2.setDepartment("Doctor");
        s2.setPercentage(55.90);
        studentDAO.addStudent(s2);

        // Displaying all students
        System.out.println("All Students:");
        studentDAO.displayAllStudents();

        // Retrieving a student
        int rollNoToRetrieve = 1;
        Student retrievedStudent = studentDAO.getStudent(rollNoToRetrieve);
        System.out.println("Student with Roll No " + rollNoToRetrieve + ": " + retrievedStudent);

        // Updating a student
        Student updatedStudent = new Student();
        int rollNoToUpdate = 2;
        updatedStudent.setPercentage(45.99);
        updatedStudent.setRollNo(rollNoToUpdate);
        studentDAO.updateStudent(updatedStudent);

//         Displaying all students after update
        System.out.println("\nAll Students after Update:");
        studentDAO.displayAllStudents();

        // Deleting a student
        int rollNoToDelete = 2;
        studentDAO.deleteStudent(rollNoToDelete);

        // Displaying all students after delete
        System.out.println("\nAll Students after Delete:");
        studentDAO.displayAllStudents();
    }	
}
