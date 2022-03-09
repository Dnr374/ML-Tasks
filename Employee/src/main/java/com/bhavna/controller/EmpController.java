package com.bhavna.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.bhavna.entity.EmpEntity;
import com.bhavna.service.EmpService;

@RestController
public class EmpController {
	@Autowired
	private EmpService empService;
	
	@GetMapping(value="get/api/Employee/{id}")
	public Optional<EmpEntity> getEmployeeById(@PathVariable Integer id) {
		return empService.getEmployeeById(id)	;
	}
	
	@PostMapping(value="/post/api/Employee")
	public String postEmployee(@RequestBody EmpEntity emp) {
		empService.postEmployee(emp);
		return "Record added Succefully";
	}
	
	@PutMapping(value="/put/api/Employee")
	public String updateEmployee(@RequestBody EmpEntity emp) {
		empService.updateEmployee(emp);
		return "Record updated Succefully";
	}
	
	@DeleteMapping(value="delete/api/Employee/{id}")
	public String deleteEmployee(@PathVariable int id) {
		empService.deleteEmployee(id);
		return "Record deleted Succefully";
	}
	
	@GetMapping(value="/getAllEmployee")
	public List<EmpEntity> getEmployees(
			@RequestParam(name="page", required=false, defaultValue = "0")Integer page,
			@RequestParam(name="size", required=false, defaultValue = "5") Integer size) {
		return empService.getAllEmployees(page,size);
	}
}
