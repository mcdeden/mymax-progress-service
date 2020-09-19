package com.mymax.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mymax.entity.MasterEducation;

@Repository
public interface MasterEducationRepository extends JpaRepository<MasterEducation, String>{

}
