package com.mymax.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mymax.entity.MasterProspectingStatus;

@Repository
public interface MasterProspectingStatusRepository extends JpaRepository<MasterProspectingStatus, String>{

}
