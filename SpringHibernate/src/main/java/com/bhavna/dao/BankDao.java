package com.bhavna.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bhavna.entity.Bank;
import com.bhavna.entity.Customer;

@Repository
public class BankDao {
	
	 @Autowired
	    private SessionFactory sessionFactory;

	  
	    public List < Customer > getCustomers() {
	        Session session = sessionFactory.openSession();
	        CriteriaBuilder cb = session.getCriteriaBuilder();
	        CriteriaQuery < Customer > cq = cb.createQuery(Customer.class);
	        Root < Customer > root = cq.from(Customer.class);
	        cq.select(root);
	        Query query = session.createQuery(cq);
	        return query.getResultList();
	    }


	    public void saveCustomer(Bank theCustomer) {
	        Session currentSession = sessionFactory.getCurrentSession();
	        currentSession.save(theCustomer);
	    }


	    public Bank getCustomerById(int theId) {
	        Session currentSession = sessionFactory.getCurrentSession();
	        Bank theCustomer = currentSession.get(Bank.class, theId);
	        return theCustomer;
	    }
}
