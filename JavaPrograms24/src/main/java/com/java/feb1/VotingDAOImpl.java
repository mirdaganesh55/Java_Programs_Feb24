package com.java.feb1;

import java.util.ArrayList;
import java.util.List;

public class VotingDAOImpl implements VotingDAO{
	

    private List<Voting> voterList = new ArrayList<>(); 
    
	@Override
	public List<Voting> showVoterList() throws Exception {
		registerPerson("Raja Pradhan", 21);
		return voterList;
	}
	 public String generateAadharId(String name, int age) {
	        // Sample logic for generating Aadhar ID
	        // You can replace this with your own logic based on your requirements
	        StringBuilder aadharIdBuilder = new StringBuilder();

	        // Adding first four letters of the name (or the whole name, depending on your requirements)
	        aadharIdBuilder.append(name.substring(0, Math.min(name.length(), 4)).toUpperCase());

	        // Adding age as a two-digit number
	        aadharIdBuilder.append(String.format("%02d", age));

	        // Adding a random number or any other component based on your requirements
	        aadharIdBuilder.append("123"); // Replace with your logic

	        return aadharIdBuilder.toString();
	    }

	    public void registerPerson(String name, int age) throws Exception {
	        if (age < 18) {
	            throw new Exception("Person must be at least 18 years old to register.");
	        }

	        // Generate Aadhar ID
	        String aadharId = generateAadharId(name, age);

	        // Create a Voting object and add it to the voterList
	        Voting newVoter = new Voting(name, age, aadharId);
	        voterList.add(newVoter);

	        System.out.println("Person registered successfully: " + name + ", Aadhar ID: " + aadharId);
	    }
}
