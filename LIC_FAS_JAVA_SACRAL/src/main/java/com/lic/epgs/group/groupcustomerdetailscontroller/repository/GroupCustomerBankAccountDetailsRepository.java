package com.lic.epgs.group.groupcustomerdetailscontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lic.epgs.group.groupcustomerdetailscontroller.entity.GroupCustomer;

@Repository
public interface GroupCustomerBankAccountDetailsRepository extends JpaRepository<GroupCustomer, Long>{
	
	@Query("SELECT gc.bankAccountDetails FROM GroupCustomer gc WHERE gc.groupCustomerId = :groupCustomerId")
	String getGroupCustomerBankAccountDetailsByGroupCustomerId(Long groupCustomerId);

}