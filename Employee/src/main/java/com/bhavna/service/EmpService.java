package com.bhavna.service;

import java.util.List;
import java.util.Optional;

import com.bhavna.entity.EmpEntity;

public interface EmpService {
	
	public Optional<EmpEntity> getEmployeeById(int id);
	
	public void postEmployee(EmpEntity emp);
	
	public EmpEntity updateEmployee(EmpEntity emp);
	
	public void deleteEmployee(int id);

    public List<EmpEntity> getAllEmployees(int pageNo, int pageSize);
	
	
}
