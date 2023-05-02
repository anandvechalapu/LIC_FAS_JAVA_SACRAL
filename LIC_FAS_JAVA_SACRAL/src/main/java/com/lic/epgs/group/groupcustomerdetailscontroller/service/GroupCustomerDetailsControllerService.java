package com.lic.epgs.group.groupcustomerdetailscontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.group.groupcustomerdetailscontroller.model.GroupCustomerDetailsController;
import com.lic.epgs.group.groupcustomerdetailscontroller.repository.GroupCustomerDetailsControllerRepository;

@Service
public class GroupCustomerDetailsControllerService {
	
	@Autowired
	GroupCustomerDetailsControllerRepository groupCustomerDetailsControllerRepository;
	
	public GroupCustomerDetailsController updateGroupStatus(Long id, boolean status, String modifiedBy, String modifiedOn) {
		return groupCustomerDetailsControllerRepository.updateGroupStatus(id, status, modifiedBy, modifiedOn);
	}

}