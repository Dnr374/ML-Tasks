package com.bhavna.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bhavna.dao.BankDao;
import com.bhavna.entity.Bank;
import com.bhavna.entity.Customer;


//import com.bhavna.repository.EmpRepository;


@Service
public class BankServiceImpl implements BankService {
	 @Autowired
	    private BankDao bankDAO;

	    @Override
	    @Transactional
	    public List < Customer > getCustomers() {
	        return bankDAO.getCustomers();
	    }

	    @Override
	    @Transactional
	    public void saveCustomer(Bank bank) {
	    	bankDAO.saveCustomer(bank);
	    }

	    @Override
	    @Transactional
	    public Bank getCustomer(int theId) {
	        return bankDAO.getCustomerById(theId);
	    }

}
