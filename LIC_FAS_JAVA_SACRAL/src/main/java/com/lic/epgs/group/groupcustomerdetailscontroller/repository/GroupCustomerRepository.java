package com.lic.epgs.group.groupcustomerdetailscontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.group.groupcustomerdetailscontroller.model.GroupCustomer;

@Repository
public interface GroupCustomerRepository extends JpaRepository<GroupCustomer, Long> {
	
	//method to update group customer details
	GroupCustomer updateGroupCustomerDetails(GroupCustomer groupCustomer);
	
	//method to update group customer history
	GroupCustomer updateGroupCustomerHistory(GroupCustomer groupCustomer);
	
	//method to update group customer temporary details
	GroupCustomer updateGroupCustomerTemporaryDetails(GroupCustomer groupCustomer);
	
	//method to update status flag, modified by and modified on of the group customer
	GroupCustomer updateGroupCustomerStatusModifiedByModifiedOn(GroupCustomer groupCustomer);
	
	//method to update defunct and active flags of the group customer
	GroupCustomer updateGroupCustomerDefunctActiveFlag(GroupCustomer groupCustomer);
	
	//method to update related details of the group customer
	GroupCustomer updateGroupCustomerRelatedDetails(GroupCustomer groupCustomer);

}