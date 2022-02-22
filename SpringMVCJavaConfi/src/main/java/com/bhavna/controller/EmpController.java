package com.bhavna.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bhavna.entity.EmpEntity;
import com.bhavna.service.EmpService;


@RestController
public class EmpController {
	@Autowired
	EmpService empService;
		
		 @RequestMapping(value = "/demo", method = RequestMethod.GET)  
		public String sample(){
			return "heloooooooo";
			
			
		}
		
	
		 @RequestMapping(value = "/getAllEmployee", method = RequestMethod.GET  )//,produces= {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
	public List<EmpEntity> getAll(){
		return empService.getAllEmployee();
	}
		 @RequestMapping(value = "/getActiveEmployee", method = RequestMethod.GET  )//,produces= {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
	public List<EmpEntity> getActive(){
		return empService.getActiveEmployee();
	}
}
