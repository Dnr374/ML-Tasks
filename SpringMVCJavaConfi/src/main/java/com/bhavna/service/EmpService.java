package com.bhavna.service;

import java.util.List;

import com.bhavna.entity.EmpEntity;



public interface EmpService {
	public List<EmpEntity> getAllEmployee();
	public List<EmpEntity> getActiveEmployee();
}
