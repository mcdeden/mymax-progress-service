package com.mymax.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mymax.entity.MyCustomerProduct;

@Repository
public interface MyCustomerProductRepository extends JpaRepository<MyCustomerProduct, String>{

}
