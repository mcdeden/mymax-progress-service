package com.mymax.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mymax.entity.MasterCity;

@Repository
public interface MasterCityRepository extends JpaRepository<MasterCity, String>{

}
