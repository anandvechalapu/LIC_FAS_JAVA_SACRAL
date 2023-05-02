package com.lic.epgs.group.groupcustomerdetailscontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.group.groupcustomerdetailscontroller.model.GroupCustomer;
import com.lic.epgs.group.groupcustomerdetailscontroller.repository.GroupCustomerRepository;

@Service
public class GroupCustomerService{

	@Autowired
	private GroupCustomerRepository groupCustomerRepository;
	
	public GroupCustomer findByGroupCustomerId(Long groupCustomerId) {
		return groupCustomerRepository.findByGroupCustomerId(groupCustomerId);
	}
	
	public List<GroupCustomer> findByStatus(String status) {
		return groupCustomerRepository.findByStatus(status);
	}
	
	public List<GroupCustomer> findByGroupCustomerIdAndStatus(Long groupCustomerId, String status) {
		return groupCustomerRepository.findByGroupCustomerIdAndStatus(groupCustomerId, status);
	}
	
	public void deleteByGroupCustomerIdAndStatus(Long groupCustomerId, String status) {
		groupCustomerRepository.deleteByGroupCustomerIdAndStatus(groupCustomerId, status);
	}
	
	public void deleteByGroupCustomerId(Long groupCustomerId) {
		groupCustomerRepository.deleteByGroupCustomerId(groupCustomerId);
	}
}