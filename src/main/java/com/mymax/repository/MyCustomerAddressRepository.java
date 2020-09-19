package com.mymax.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mymax.entity.MyCustomerAddress;

@Repository
public interface MyCustomerAddressRepository extends JpaRepository<MyCustomerAddress, String>{

}
