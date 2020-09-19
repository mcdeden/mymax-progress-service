package com.mymax.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mymax.entity.ProspectingCustomer;

@Repository
public interface ProspectingCustomerRepository extends JpaRepository<ProspectingCustomer, String> {

	@Query("select c from ProspectingCustomer c where c.idCardNumber = :nik")
	Optional<ProspectingCustomer> findByIdCardNumber(@Param("nik") String nik);
	
	@Query("select c from ProspectingCustomer c where c.salesUser.id = :salesId")
	List<ProspectingCustomer> findAllBySalesId(@Param("salesId") String salesId);
	
	@Query("select c from ProspectingCustomer c where c.id = :id")
	Optional<ProspectingCustomer> findOneById(@Param("id") String id);
	
	@Query("delete from ProspectingCustomer c where c.id = :pcid and c.salesUser.id = :salesId")
	void deleteOneByIdAndSalesId(@Param("pcid") String pcid, @Param("salesId") String salesId);
	
}
