package com.bhavna.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bhavna.entity.Customer;
import com.bhavna.service.BankService;




@RestController
public class BankController {
//	@Autowired
//	EmpService empService;
//
	@RequestMapping(value = "/demo", method = RequestMethod.GET)  
	public String sample(){
		return "Hello world";
	}
	@Autowired
	private BankService service;
	
	@GetMapping("/getAllOrders")
	@ResponseBody
	public List<Customer> getAllCustomers() {
		return service.getCustomers();
	}
//
//
//	@RequestMapping(value = "/getAllEmployee", method = RequestMethod.GET  )//,produces= {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
//	public List<EmpEntity> getAll(){
//		return empService.getAllEmployee();
//	}
//	@RequestMapping(value = "/getActiveEmployee", method = RequestMethod.GET  )//,produces= {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
//	public List<EmpEntity> getActive(){
//		return empService.getActiveEmployee();
//	}
}
