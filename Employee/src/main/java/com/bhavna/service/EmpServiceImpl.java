package com.bhavna.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.bhavna.entity.EmpEntity;
import com.bhavna.repository.EmpRepo;

@Service
public class EmpServiceImpl implements EmpService {
	@Autowired
	private EmpRepo empRepo;
	
	
	@Override
	public Optional<EmpEntity> getEmployeeById(int id) {
		return empRepo.findById(id);	
	}
	
	@Override
	public void postEmployee(EmpEntity emp) {
		empRepo.save(emp);		
	}
	
	@Override
	public EmpEntity updateEmployee(EmpEntity emp) {
		return empRepo.save(emp);
	}
	
	@Override
	public void deleteEmployee(int id) {
		empRepo.deleteById(id); 
	}

	@Override
	public List<EmpEntity> getAllEmployees(int pageNo, int pageSize) {
		Pageable paging = PageRequest.of(pageNo, pageSize);
		Page<EmpEntity> pagedResult = empRepo.findAll(paging);
		return pagedResult.toList();
	}

}
