package com.java.feb8;

import java.util.ArrayList;
import java.util.List;

public class PersonDAOImpl implements PersonDAO{
	
	private List<Person> personList = new ArrayList<>();
	private int nextPersonId = 1;
	
	 @Override
	    public void addPerson(Person person) {
	        int personId = nextPersonId++;
	        person.setPersonId(personId);
	        personList.add(person);
	    }

	    @Override
	    public Person getPersonById(int personId) {
	        for (Person person : personList) {
	            if (person.getPersonId() == personId) {
	                return person;
	            }
	        }
	        return null;
	    }

	    @Override
	    public List<Person> getAllPersons() {
	        return new ArrayList<>(personList);
	    }

	    @Override
	    public void updatePerson(Person person) {
	        int personId = person.getPersonId();
	        for (int i = 0; i < personList.size(); i++) {
	            if (personList.get(i).getPersonId() == personId) {
	                personList.set(i, person);
	                return;
	            }
	        }
	        System.out.println("Person with ID " + personId + " not found.");
	    }

	    @Override
	    public void deletePerson(int personId) {
	        personList.removeIf(person -> person.getPersonId() == personId);
	    }

	    // Implementation of additional methods for Wrapper classes and conversions
	    @Override
	    public Integer getPersonAgeAsWrapper(int personId) {
	        Person person = getPersonById(personId);
	        return (person != null) ? person.getAge() : null;
	    }

	    @Override
	    public void setPersonAgeFromWrapper(int personId, Integer age) {
	        Person person = getPersonById(personId);
	        if (person != null) {
	            person.setAge(age);
	            updatePerson(person);
	        }
	    }

	    // Utility methods for conversions
	    @Override
	    public Integer convertStringToInteger(String value) {
	        try {
	            return Integer.parseInt(value);
	        } catch (NumberFormatException e) {
	            System.out.println("Error converting string to Integer: " + e.getMessage());
	            return null;
	        }
	    }

	    @Override
	    public String convertIntegerToString(Integer value) {
	        return (value != null) ? value.toString() : null;
	    }

	    @Override
	    public Double convertStringToDouble(String value) {
	        try {
	            return Double.parseDouble(value);
	        } catch (NumberFormatException e) {
	            System.out.println("Error converting string to Double: " + e.getMessage());
	            return null;
	        }
	    }

	    @Override
	    public String convertDoubleToString(Double value) {
	        return (value != null) ? value.toString() : null;
	    }
	}


