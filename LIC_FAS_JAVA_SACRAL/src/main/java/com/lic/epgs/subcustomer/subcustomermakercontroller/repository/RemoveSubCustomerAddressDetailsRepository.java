package com.lic.epgs.subcustomer.subcustomermakercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.subcustomer.subcustomermakercontroller.model.SubCustomerAddress;

@Repository
public interface RemoveSubCustomerAddressDetailsRepository extends JpaRepository<SubCustomerAddress, Long> {

	public SubCustomerAddress findBySubCustomerIdAndAddressId(Long subCustomerId, Long addressId);

	public void deleteBySubCustomerIdAndAddressId(Long subCustomerId, Long addressId);
	
}