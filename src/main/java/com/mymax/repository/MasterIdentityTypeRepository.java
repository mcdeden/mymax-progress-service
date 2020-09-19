package com.mymax.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mymax.entity.MasterIdentityType;

@Repository
public interface MasterIdentityTypeRepository extends JpaRepository<MasterIdentityType, String>{

}
