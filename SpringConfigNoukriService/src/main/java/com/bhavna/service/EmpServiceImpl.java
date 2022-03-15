package com.bhavna.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bhavna.entity.EmpEntity;
import com.bhavna.repository.EmpRepo;

@Service
public class EmpServiceImpl implements EmpService {
	@Autowired
	private EmpRepo empRepo;
	
	
	@Override
	public EmpEntity getEmployeeByName(String name) {
		return empRepo.getByName(name);
	}
	
	@Override
	public void postEmployee(EmpEntity emp) {
		empRepo.save(emp);		
	}
	

}
