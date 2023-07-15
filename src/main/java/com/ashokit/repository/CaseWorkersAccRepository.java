package com.ashokit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entity.CaseWorkersAccEntity;

public interface CaseWorkersAccRepository extends JpaRepository<CaseWorkersAccEntity,Integer> 
{
	public CaseWorkersAccEntity findByEmailAndPwd(String email,String pazzwd);
	
	public CaseWorkersAccEntity findByEmail(String email);
	

}
