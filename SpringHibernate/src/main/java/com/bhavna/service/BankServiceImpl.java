package com.bhavna.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.bhavna.dao.CustomerDao;
import com.bhavna.entity.Bank;
import com.bhavna.entity.Customer;


//import com.bhavna.repository.EmpRepository;


@Service
public class BankServiceImpl implements BankService {
	 @Autowired
	    private CustomerDao customerDAO;

	    @Override
	    @Transactional
	    public List < Customer > getCustomers() {
	        return customerDAO.getCustomers();
	    }

	    @Override
	    @Transactional
	    public void saveCustomer(Bank bank) {
	    	customerDAO.saveCustomer(bank);
	    }

	    @Override
	    @Transactional
	    public Bank getCustomer(int theId) {
	        return customerDAO.getCustomerById(theId);
	    }

}
