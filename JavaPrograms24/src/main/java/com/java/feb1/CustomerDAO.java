package com.java.feb1;

import java.util.List;

public interface CustomerDAO {
	
	List<Customer> showCustomerList();
	public List<Customer> sortCustomersByName(List<Customer> customers) throws Exception;
}
