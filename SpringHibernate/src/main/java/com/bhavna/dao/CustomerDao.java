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
public class CustomerDao {
	
	 @Autowired
	    private SessionFactory sessionFactory;

	  
	    public List < Customer > getCustomers() {
	        Session session = sessionFactory.openSession();
	        CriteriaBuilder cb = session.getCriteriaBuilder();
	        CriteriaQuery < Customer > cq = cb.createQuery(Customer.class);
	        Root < Customer > root = cq.from(Customer.class);
	        cq.select(root);
	        Query query = session.createQuery(cq);	        
	       List result=  query.getResultList();
	       session.close();
	       return result;
	    }


	    public void saveCustomer(Customer theCustomer) {
	        Session session = sessionFactory.openSession();
	        session.beginTransaction();
	        session.save(theCustomer);
	        session.getTransaction().commit();
	        session.close();
	    }
	    
	    public void updateCustomer(int customerId ,Customer theCustomer) {
	        Session session = sessionFactory.openSession();
	        session.beginTransaction();
	        session.update(theCustomer);
	        session.getTransaction().commit();	      
	        session.close();
	      
	    }


	    public Customer getCustomerById(int customerId) {
	        Session currentSession = sessionFactory.openSession();
	        Customer theCustomer = currentSession.get(Customer.class, customerId);
	        currentSession.close();
	        return theCustomer;
	    }

	    
}
