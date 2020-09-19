package com.mymax.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mymax.entity.MasterProvince;

@Repository
public interface MasterProvinceRepository extends JpaRepository<MasterProvince, String>{

}
