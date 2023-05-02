package com.lic.epgs.group.groupcustomerdetailscontroller.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.group.groupcustomerdetailscontroller.model.GroupCustomer;
import com.lic.epgs.group.groupcustomerdetailscontroller.repository.GroupCustomerRepository;

@Service
public class GroupCustomerService {

	@Autowired
	private GroupCustomerRepository groupCustomerRepository;
	
	//method to update group customer details
	public GroupCustomer updateGroupCustomerDetails(GroupCustomer groupCustomer) {
		return groupCustomerRepository.save(groupCustomer);
	}
	
	//method to update group customer history
	public GroupCustomer updateGroupCustomerHistory(GroupCustomer groupCustomer) {
		return groupCustomerRepository.save(groupCustomer);
	}
	
	//method to update group customer temporary details
	public GroupCustomer updateGroupCustomerTemporaryDetails(GroupCustomer groupCustomer) {
		return groupCustomerRepository.save(groupCustomer);
	}
	
	//method to update status flag, modified by and modified on of the group customer
	public GroupCustomer updateGroupCustomerStatusModifiedByModifiedOn(GroupCustomer groupCustomer) {
		return groupCustomerRepository.save(groupCustomer);
	}
	
	//method to update defunct and active flags of the group customer
	public GroupCustomer updateGroupCustomerDefunctActiveFlag(GroupCustomer groupCustomer) {
		return groupCustomerRepository.save(groupCustomer);
	}
	
	//method to update related details of the group customer
	public GroupCustomer updateGroupCustomerRelatedDetails(GroupCustomer groupCustomer) {
		return groupCustomerRepository.save(groupCustomer);
	}
	
	//method to get group customer details by id
	public Optional<GroupCustomer> getGroupCustomerById(Long id) {
		return groupCustomerRepository.findById(id);
	}
	
	//method to delete group customer
	public void deleteGroupCustomer(Long id) {
		groupCustomerRepository.deleteById(id);
	}
	
}