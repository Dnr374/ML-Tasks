package com.bhavna.service;

import com.bhavna.entity.EmpEntity;

public interface EmpService {
	
	public EmpEntity getEmployeeByName(String  name);
	
	public void postEmployee(EmpEntity emp);
	
	
}
