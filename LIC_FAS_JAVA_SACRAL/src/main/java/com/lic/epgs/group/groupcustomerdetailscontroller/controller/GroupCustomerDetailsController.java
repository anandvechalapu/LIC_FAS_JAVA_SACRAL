package com.lic.epgs.group.groupcustomerdetailscontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.group.groupcustomerdetailscontroller.model.GroupCustomer;
import com.lic.epgs.group.groupcustomerdetailscontroller.service.ExistingGroupCustomerSearchService;

@RestController
@RequestMapping("/epgs/group/customer")
public class GroupCustomerDetailsController {
	
	@Autowired
	private ExistingGroupCustomerSearchService existingGroupCustomerSearchService;
	
	@GetMapping("/customer/{groupCode}")
	public GroupCustomer searchForExistingGroupCustomer(@PathVariable String groupCode, @RequestParam String groupName, @RequestParam String groupStatus, @RequestParam String unitCode, @RequestParam String status) {
		
		return existingGroupCustomerSearchService.searchForExistingGroupCustomer(groupCode, groupName, groupStatus, unitCode, status);
		
	}
	
	@GetMapping("/customers")
	public Page<GroupCustomer> searchForExistingGroupCustomerWithPagination(@RequestParam String groupCode, @RequestParam String groupName, @RequestParam String groupStatus, @RequestParam String unitCode, @RequestParam String status, @RequestParam int pageCount, @RequestParam int limit) {
		
		return existingGroupCustomerSearchService.searchForExistingGroupCustomerWithPagination(groupCode, groupName, groupStatus, unitCode, status, pageCount, limit);
		
	}

}