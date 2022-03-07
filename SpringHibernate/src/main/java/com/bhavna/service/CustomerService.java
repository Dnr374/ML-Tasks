package com.bhavna.service;

import java.util.List;

import com.bhavna.entity.Bank;
import com.bhavna.entity.Customer;

public interface CustomerService {
	 public List < Customer > getCustomers();

	    public void saveCustomer(Customer customer);
	    
	    public void updateCustomer(int customerId, Customer customer);

	    public Customer getCustomer(int theId);
}
