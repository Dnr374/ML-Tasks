package com.bhavna.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bhavna.entity.EmpEntity;

@Repository
public interface EmpRepo extends JpaRepository<EmpEntity, Integer>{
	@Query(value="select * from emp  where name=:name",nativeQuery = true)
	 EmpEntity getByName(String name);
	
}
