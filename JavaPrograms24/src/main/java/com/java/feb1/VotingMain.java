package com.java.feb1;

import java.util.List;

public class VotingMain {
	
	public static void main(String[] args) {
		
		VotingDAOImpl votingDAO = new VotingDAOImpl();

        try {
            // Register a person
            votingDAO.registerPerson("John Doe", 21);
        } catch (Exception e) {
            // Handling the exception
            System.err.println("Error: " + e.getMessage());
        }

        // Assuming the voterList is populated or updated elsewhere in the application
        List<Voting> voters;
		try {
			voters = votingDAO.showVoterList();
			for (Voting voter : voters) {
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
