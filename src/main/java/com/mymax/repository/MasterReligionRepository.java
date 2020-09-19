package com.mymax.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mymax.entity.MasterReligion;

@Repository
public interface MasterReligionRepository extends JpaRepository<MasterReligion, String>{

}
