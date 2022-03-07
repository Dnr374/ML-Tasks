package com.bhavna.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="Customer")
public class Customer {
	
	@Id
	@Column(name="Customer_Id")
	Integer customerId;
	
	@Column(name="Customer_NAME")
	String customerName;
	
	@OneToMany(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="Customer_id")
	private List<Bank> bank;


	public Integer getCustomerId() {
		return customerId;
	}


	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public List<Bank> getBank() {
		return bank;
	}




	public void setBank(List<Bank> bank) {
		this.bank = bank;
	}




	public Customer() {
		super();
	}
	
	
}
