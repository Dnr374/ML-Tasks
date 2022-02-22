package com.bhavna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bhavna.entity.EmpEntity;

@Repository
public interface EmpRepository extends CrudRepository<EmpEntity, Integer> {
	@Query(value = "SELECT * FROM EMPSTATUS  WHERE STATUS = 'Active'",nativeQuery = true)
	public List<EmpEntity> getActiveEmployee();
}
