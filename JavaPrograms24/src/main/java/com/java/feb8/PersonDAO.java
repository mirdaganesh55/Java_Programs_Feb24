package com.java.feb8;

import java.util.List;

public interface PersonDAO {
	
	 void addPerson(Person person);
	    Person getPersonById(int personId);
	    List<Person> getAllPersons();
	    void updatePerson(Person person);
	    void deletePerson(int personId);
	    // Additional methods for Wrapper classes and conversions
	    Integer getPersonAgeAsWrapper(int personId);
	    void setPersonAgeFromWrapper(int personId, Integer age);
	    // Utility methods for conversions
	    Integer convertStringToInteger(String value);
	    String convertIntegerToString(Integer value);
	    Double convertStringToDouble(String value);
	    String convertDoubleToString(Double value);
}
