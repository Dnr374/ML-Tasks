package com.bhavna.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bhavna.entity.EmpEntity;

@Repository
public interface EmpRepo extends JpaRepository<EmpEntity, Integer>{
	
}
