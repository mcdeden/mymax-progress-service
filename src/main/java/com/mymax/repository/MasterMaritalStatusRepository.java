package com.mymax.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mymax.entity.MasterMaritalStatus;

@Repository
public interface MasterMaritalStatusRepository extends JpaRepository<MasterMaritalStatus, String>{

}
