package com.java.feb1;

import java.util.List;

public class CustomerMain {

	public static void main(String[] args) {
		CustomerDAOImpl dao = new CustomerDAOImpl();
        // Create an instance of CustomerDAOImpl
		
        // Call the showCustomerList() method
        List<Customer> customers = dao.showCustomerList();

        // Iterate through the customer list and print information
        try {
            for (Customer customer : customers) {
                System.out.println("Name: " + customer.getName());
                System.out.println("Date of Birth: " + customer.getDob());
                System.out.println("Gender: " + customer.getGender());
                System.out.println("Aadhar ID: " + customer.getAadharId());
                System.out.println("Address: " + customer.getAddress());
                System.out.println("-----------------------------------------------");
            }
        } catch (Exception e) {
            handleErrorMessage("An error occurred : " +getExceptionName(e));
        }
        
     System.out.println("_____________-----------------______________");
        // Assuming you have a list of customers to sort
        List<Customer> unsortedCustomers = dao.showCustomerList();

        // Call the method to sort customers by name
        List<Customer> sortedCustomers;
		try {
			sortedCustomers = dao.sortCustomersByName(unsortedCustomers);
			for (Customer customer : sortedCustomers) {
	            System.out.println("Name: " + customer.getName());
	            System.out.println("Date of Birth: " + customer.getDob());
	            System.out.println("Gender: " + customer.getGender());
	            System.out.println("Aadhar ID: " + customer.getAadharId());
	            System.out.println("Address: " + customer.getAddress());
	            System.out.println("-------------");
	        }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    private static String getExceptionName(Exception msg) {
    	String exceptionName = msg.getClass().getSimpleName();
        return exceptionName;
    }
    private static void handleErrorMessage(String msg) {
        System.out.println(msg);
    }
}





