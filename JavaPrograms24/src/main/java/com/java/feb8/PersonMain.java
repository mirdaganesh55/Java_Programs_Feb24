package com.java.feb8;

import java.util.List;

public class PersonMain {
	
	 public static void main(String[] args) {
	        // Create a PersonDAOImpl object
	        PersonDAO personDAO = new PersonDAOImpl();

	        // Add some persons
	        personDAO.addPerson(new Person(1,"Rani", 30, false));
	        personDAO.addPerson(new Person(2,"Raja", 25, true));

	        // Retrieve all persons and print them
	        System.out.println("All Persons:");
	        List<Person> allPersons = personDAO.getAllPersons();
	        for (Person person : allPersons) {
	            System.out.println(person);
	        }

	        // Get the age of a person with ID 1 and print it
	        int personId = 1;
	        Integer age = personDAO.getPersonAgeAsWrapper(personId);
	        System.out.println();
	        System.out.println("Age of Person with ID " + personId + ": " + age);

	        // Convert age to string and print it
	        String ageAsString = personDAO.convertIntegerToString(age);
	        System.out.println("Age as String: " + ageAsString);

	        // Update age of person with ID 1
	        Integer newAge = 35;
	        personDAO.setPersonAgeFromWrapper(personId, newAge);
	        System.out.println("Updated age of Person with ID " + personId + ": " + newAge);
	        System.out.println();
	        // Retrieve all persons again and print them to see the changes
	        System.out.println("All Persons after update:");
	        allPersons = personDAO.getAllPersons();
	        for (Person person : allPersons) {
	            System.out.println(person);
	        }

	        // Convert a string to double
	        String doubleString = "3.14";
	        Double doubleValue = personDAO.convertStringToDouble(doubleString);
	        System.out.println();
	        System.out.println("Converted Double value: " + doubleValue);

	        // Convert a double to string
	        Double pi = 3.14159265359;
	        String piString = personDAO.convertDoubleToString(pi);
	        System.out.println("Converted Pi value to String: " + piString);
	    }
}
