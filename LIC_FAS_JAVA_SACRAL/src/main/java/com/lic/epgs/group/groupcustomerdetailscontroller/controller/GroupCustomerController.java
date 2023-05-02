package com.lic.epgs.group.groupcustomerdetailscontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.group.groupcustomerdetailscontroller.model.GroupCustomer;
import com.lic.epgs.group.groupcustomerdetailscontroller.service.GroupCustomerService;

@RestController
public class GroupCustomerController {

	@Autowired
	private GroupCustomerService groupCustomerService;
	
	@GetMapping("/groupCustomer/{groupCustomerId}")
	public GroupCustomer getGroupCustomerById(@PathVariable Long groupCustomerId) {
		return groupCustomerService.findByGroupCustomerId(groupCustomerId);
	}
	
	@GetMapping("/groupCustomer/status/{status}")
	public List<GroupCustomer> getGroupCustomerByStatus(@PathVariable String status) {
		return groupCustomerService.findByStatus(status);
	}
	
	@GetMapping("/groupCustomer/{groupCustomerId}/status/{status}")
	public List<GroupCustomer> getGroupCustomerByGroupCustomerIdAndStatus(@PathVariable Long groupCustomerId,
			@PathVariable String status) {
		return groupCustomerService.findByGroupCustomerIdAndStatus(groupCustomerId, status);
	}
	
	@DeleteMapping("/groupCustomer/{groupCustomerId}/status/{status}")
	public void deleteGroupCustomerByGroupCustomerIdAndStatus(@PathVariable Long groupCustomerId,
			@PathVariable String status) {
		groupCustomerService.deleteByGroupCustomerIdAndStatus(groupCustomerId, status);
	}
	
	@DeleteMapping("/groupCustomer/{groupCustomerId}")
	public void deleteGroupCustomerByGroupCustomerId(@PathVariable Long groupCustomerId) {
		groupCustomerService.deleteByGroupCustomerId(groupCustomerId);
	}
	
}