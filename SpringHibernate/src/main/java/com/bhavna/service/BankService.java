package com.bhavna.service;

import java.util.List;

import com.bhavna.entity.Bank;
import com.bhavna.entity.Customer;

public interface BankService {
	 public List < Customer > getCustomers();

	    public void saveCustomer(Bank bank);

	    public Bank getCustomer(int theId);
}
