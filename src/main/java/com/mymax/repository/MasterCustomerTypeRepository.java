package com.mymax.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mymax.entity.MasterCustomerType;

@Repository
public interface MasterCustomerTypeRepository extends JpaRepository<MasterCustomerType, String>{
	
}
