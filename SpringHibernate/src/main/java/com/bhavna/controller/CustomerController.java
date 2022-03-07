package com.bhavna.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bhavna.entity.Customer;
import com.bhavna.service.CustomerService;

@RestController
public class CustomerController {

	@RequestMapping(value = "/demo", method = RequestMethod.GET)  
	public String sample(){
		return "Hello world";
	}
	@Autowired
	private CustomerService service;
	
	@GetMapping("/getCustomers")
	@ResponseBody
	public List<Customer> getAllCustomers() {
		return service.getCustomers();
	}
	
	@GetMapping("/getCustomerById/{customerId}")
	@ResponseBody
	public Customer getCustomerById(@PathVariable int customerId) {
		return service.getCustomer(customerId);	
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@RequestBody Customer customer) {
		 service.saveCustomer(customer);
		 return "Customer added succefully";
	}
	
	@PutMapping("/updateCustomer/{customerId}")
	public String updateCustomer(@PathVariable int customerId,@RequestBody Customer customer) {
		 service.updateCustomer(customerId,customer);
		 return "Customer updated succefully";
		
	}

}
