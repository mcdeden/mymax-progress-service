package com.mymax.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mymax.entity.MasterOccupation;

@Repository
public interface MasterOccupationRepository extends JpaRepository<MasterOccupation, String>{

}
