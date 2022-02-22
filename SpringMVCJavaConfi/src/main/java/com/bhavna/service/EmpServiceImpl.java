package com.bhavna.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bhavna.entity.EmpEntity;
import com.bhavna.repository.EmpRepository;
@Service
@Transactional
public class EmpServiceImpl implements EmpService {
	
	@Autowired
			private EmpRepository empRepo;
	
	@Override
	public List<EmpEntity> getAllEmployee() {
		return (List<EmpEntity>) empRepo.findAll();
	}

	@Override
	public List<EmpEntity> getActiveEmployee() {
		return empRepo.getActiveEmployee();
	}

}
