package com.lic.epgs.group.groupcustomerdetailscontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.group.groupcustomerdetailscontroller.model.GroupCustomerContactDetails;
import com.lic.epgs.group.groupcustomerdetailscontroller.repository.GroupCustomerContactDetailsRepository;

@Service
public class GroupCustomerContactDetailsService {
	
	@Autowired
	private GroupCustomerContactDetailsRepository groupCustomerContactDetailsRepository;
	
	public GroupCustomerContactDetails findByGroupCustomerId(Long groupCustomerId) {
		return groupCustomerContactDetailsRepository.findByGroupCustomerId(groupCustomerId);
	}
	
	public void updateGroupCustomerContactDetails(GroupCustomerContactDetails groupCustomerContactDetails) {
		groupCustomerContactDetailsRepository.save(groupCustomerContactDetails);
	}
	
	public void addNewGroupCustomerContactDetails(GroupCustomerContactDetails groupCustomerContactDetails) {
		groupCustomerContactDetailsRepository.save(groupCustomerContactDetails);
	}
	
	public void saveGroupCustomerContactDetails(GroupCustomerContactDetails groupCustomerContactDetails) {
		groupCustomerContactDetailsRepository.save(groupCustomerContactDetails);
	}
	
	public void deleteGroupCustomerContactDetails(GroupCustomerContactDetails groupCustomerContactDetails) {
		groupCustomerContactDetailsRepository.delete(groupCustomerContactDetails);
	}
	
	public List<GroupCustomerContactDetails> getAllGroupCustomerContactDetails() {
		return groupCustomerContactDetailsRepository.findAll();
	}

}