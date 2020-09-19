package com.mymax.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mymax.entity.MasterSourceOfFund;

@Repository
public interface MasterSourceOfFundRepository extends JpaRepository<MasterSourceOfFund, String>{

}
