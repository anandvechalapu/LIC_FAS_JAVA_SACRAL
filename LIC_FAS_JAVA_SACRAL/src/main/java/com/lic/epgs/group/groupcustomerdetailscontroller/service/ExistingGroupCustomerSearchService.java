package com.lic.epgs.group.groupcustomerdetailscontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.lic.epgs.group.groupcustomerdetailscontroller.model.GroupCustomer;
import com.lic.epgs.group.groupcustomerdetailscontroller.repository.ExistingGroupCustomerSearchRepository;

@Service
public class ExistingGroupCustomerSearchService {
	
	@Autowired
	private ExistingGroupCustomerSearchRepository existingGroupCustomerSearchRepository;
	
	public GroupCustomer searchForExistingGroupCustomer(String groupCode, String groupName, String groupStatus, String unitCode, String status) {
		
		return existingGroupCustomerSearchRepository.searchForExistingGroupCustomer(groupCode, groupName, groupStatus, unitCode, status);
		
	}
	
	public Page<GroupCustomer> searchForExistingGroupCustomerWithPagination(String groupCode, String groupName, String groupStatus, String unitCode, String status, int pageCount, int limit) {
		
		Pageable pageable = PageRequest.of(pageCount, limit);
		
		return existingGroupCustomerSearchRepository.searchForExistingGroupCustomerWithPagination(groupCode, groupName, groupStatus, unitCode, status, pageCount, limit);
		
	}

}