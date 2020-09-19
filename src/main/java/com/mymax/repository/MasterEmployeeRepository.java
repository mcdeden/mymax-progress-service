package com.mymax.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mymax.entity.MasterEmployee;

@Repository
public interface MasterEmployeeRepository extends JpaRepository<MasterEmployee, String>{

}
