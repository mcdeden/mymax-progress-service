package com.mymax.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mymax.entity.MasterTaxOption;

@Repository
public interface MasterTaxOptionRepository extends JpaRepository<MasterTaxOption, String>{
	
}
