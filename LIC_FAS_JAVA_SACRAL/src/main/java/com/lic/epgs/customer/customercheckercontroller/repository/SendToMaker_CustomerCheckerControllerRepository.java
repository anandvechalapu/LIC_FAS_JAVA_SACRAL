package com.lic.epgs.customer.customercheckercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.lic.epgs.customer.customercheckercontroller.model.CommonResponseDto;

public interface SendToMaker_CustomerCheckerControllerRepository extends JpaRepository<CommonResponseDto, Long>{
	@Modifying
	@Transactional
	@Query(value="UPDATE Customer c SET c.isActive=false WHERE c.customerId=:customerId",nativeQuery=true)
	void setFlagInactive(@Param("customerId") Long customerId);
	
	@Modifying
	@Transactional
	@Query(value="INSERT INTO Customer (customerName, isActive) VALUES (:customerName, true)",nativeQuery=true)
	void createNewCustomer(@Param("customerName") String customerName);

}