package com.bhavna.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.bhavna.entity.EmpEntity;
import com.bhavna.service.EmpService;

@RestController
@RefreshScope
public class EmpController {
	@Autowired
	private EmpService empService;
		
	@GetMapping(value="get/api/Employee/{name}"+"${domain}")
	public EmpEntity getEmployeeById(@PathVariable String  name) {
		return empService.getEmployeeByName(name)	;
	}
	
	@PostMapping(value="/post/api/Employee")
	public String postEmployee(@RequestBody EmpEntity emp) {
		empService.postEmployee(emp);
		return "Record added Succefully";
	}
}
