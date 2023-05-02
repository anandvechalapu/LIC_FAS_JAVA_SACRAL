package com.lic.epgs.group.groupcustomerdetailscontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.group.groupcustomerdetailscontroller.model.GroupCustomerDetailsController;
import com.lic.epgs.group.groupcustomerdetailscontroller.repository.GetGroupMemberCustomerDetailRepository;

@Service
public class GetGroupMemberCustomerDetailsService {

	@Autowired
	private GetGroupMemberCustomerDetailRepository getGroupMemberCustomerDetailRepository;

	public List<GroupCustomerDetailsController> getGroupMemberCustomerDetails(String customerCode, int groupCustomerId) {
		return getGroupMemberCustomerDetailRepository.findByCustomerCodeAndGroupCustomerId(customerCode, groupCustomerId);
	}

}