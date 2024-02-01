package com.java.feb1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class CustomerDAOImpl implements CustomerDAO{
	
	 private List<Customer> customerList;


	    @Override
	    public List<Customer> showCustomerList() {
	    	CustomerManager();
	        return customerList;
	    }
	public void CustomerManager() {
        // Initialize the customerList
        customerList = new ArrayList<>();

        // Add some sample customers 
        customerList.add(new Customer("John Doe", new Date(), Gender.MALE, 123456789, "123 Main St"));
        customerList.add(new Customer("Appu Smith", new Date(), Gender.FEMALE, 987654321, "456 Oak St"));
        customerList.add(new Customer("Kallu Thanana", new Date(), Gender.FEMALE, 987654321, "456 Oak St"));
        customerList.add(new Customer("Dippu Jena", new Date(), Gender.FEMALE, 987654321, "456 Oak St"));
        customerList.add(new Customer("Yukesh Kumar", new Date(), Gender.FEMALE, 987654321, "456 Oak St"));
        customerList.add(new Customer("Lokesh Rathore", new Date(), Gender.FEMALE, 987654321, "456 Oak St"));
    }
	
    // Example method to sort a List of customers by name
	 public List<Customer> sortCustomersByName(List<Customer> customers) throws Exception {
	        List<Customer> sortedCustomers = new ArrayList<>(customers);
	        Collections.sort(sortedCustomers, (c1, c2) -> c1.getName().compareTo(c2.getName()));
	        return sortedCustomers;
	    }
// Generate the ID
	  public String generateUniqueId(int aadharId, Date dob) {
	        String dobString = new SimpleDateFormat("yyyyMMdd").format(dob);
	        return aadharId + dobString;
	    }
	 
}
