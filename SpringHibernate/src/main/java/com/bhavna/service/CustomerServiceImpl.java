package com.bhavna.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.bhavna.dao.CustomerDao;
import com.bhavna.entity.Bank;
import com.bhavna.entity.Customer;


//import com.bhavna.repository.EmpRepository;

@Transactional
@Service
public class CustomerServiceImpl implements CustomerService {
	 @Autowired
	    private CustomerDao customerDAO;

	    @Override
	   
	    public List < Customer > getCustomers() {
	        return customerDAO.getCustomers();
	    }

	    @Override
	   
	    public void saveCustomer(Customer customer) {
	    	customerDAO.saveCustomer(customer);
	    }

	    @Override
	
	    public Customer getCustomer(int theId) {
	        return customerDAO.getCustomerById(theId);
	    }

		@Override
		public void updateCustomer(int customerId, Customer customer) {
		  customerDAO.updateCustomer(customerId,customer);
		}

		

}
