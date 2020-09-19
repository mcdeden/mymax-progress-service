package com.mymax.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mymax.entity.MasterCountry;

@Repository
public interface MasterCountryRepository extends JpaRepository<MasterCountry, String>{
	
}
