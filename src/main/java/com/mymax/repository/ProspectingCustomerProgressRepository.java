package com.mymax.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mymax.entity.ProspectingCustomerProgress;

@Repository
public interface ProspectingCustomerProgressRepository extends JpaRepository<ProspectingCustomerProgress, String> {

}
