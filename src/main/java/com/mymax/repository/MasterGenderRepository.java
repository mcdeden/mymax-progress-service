package com.mymax.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mymax.entity.MasterGender;

@Repository
public interface MasterGenderRepository extends JpaRepository<MasterGender, String>{
	
}
