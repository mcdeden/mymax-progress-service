package com.mymax.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mymax.entity.MasterProduct;

@Repository
public interface MasterProductRepository extends JpaRepository<MasterProduct, String>{

}
