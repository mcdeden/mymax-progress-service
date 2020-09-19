package com.mymax.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mymax.entity.MasterDebtorGroup;

@Repository
public interface MasterDebtorGroupRepository extends JpaRepository<MasterDebtorGroup, String>{

}
