package com.lic.epgs.group.groupcustomerdetailscontroller.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.group.groupcustomerdetailscontroller.model.GroupCustomer;
import com.lic.epgs.group.groupcustomerdetailscontroller.service.GroupCustomerService;

@RestController
@RequestMapping("/api/v1/groupcustomer")
public class GroupCustomerController {
	
	@Autowired
	private GroupCustomerService groupCustomerService;
	
	//method to update group customer details
	@PutMapping("/updateGroupCustomerDetails")
	public GroupCustomer updateGroupCustomerDetails(@RequestBody GroupCustomer groupCustomer) {
		return groupCustomerService.updateGroupCustomerDetails(groupCustomer);
	}
	
	//method to update group customer history
	@PutMapping("/updateGroupCustomerHistory")
	public GroupCustomer updateGroupCustomerHistory(@RequestBody GroupCustomer groupCustomer) {
		return groupCustomerService.updateGroupCustomerHistory(groupCustomer);
	}
	
	//method to update group customer temporary details
	@PutMapping("/updateGroupCustomerTemporaryDetails")
	public GroupCustomer updateGroupCustomerTemporaryDetails(@RequestBody GroupCustomer groupCustomer) {
		return groupCustomerService.updateGroupCustomerTemporaryDetails(groupCustomer);
	}
	
	//method to update status flag, modified by and modified on of the group customer
	@PutMapping("/updateGroupCustomerStatusModifiedByModifiedOn")
	public GroupCustomer updateGroupCustomerStatusModifiedByModifiedOn(@RequestBody GroupCustomer groupCustomer) {
		return groupCustomerService.updateGroupCustomerStatusModifiedByModifiedOn(groupCustomer);
	}
	
	//method to update defunct and active flags of the group customer
	@PutMapping("/updateGroupCustomerDefunctActiveFlag")
	public GroupCustomer updateGroupCustomerDefunctActiveFlag(@RequestBody GroupCustomer groupCustomer) {
		return groupCustomerService.updateGroupCustomerDefunctActiveFlag(groupCustomer);
	}
	
	//method to update related details of the group customer
	@PutMapping("/updateGroupCustomerRelatedDetails")
	public GroupCustomer updateGroupCustomerRelatedDetails(@RequestBody GroupCustomer groupCustomer) {
		return groupCustomerService.updateGroupCustomerRelatedDetails(groupCustomer);
	}
	
	//method to get group customer details by id
	@GetMapping("/getGroupCustomerById/{id}")
	public Optional<GroupCustomer> getGroupCustomerById(@PathVariable Long id) {
		return groupCustomerService.getGroupCustomerById(id);
	}
	
	//method to delete group customer
	@DeleteMapping("/deleteGroupCustomer/{id}")
	public void deleteGroupCustomer(@PathVariable Long id) {
		groupCustomerService.deleteGroupCustomer(id);
	}
	
}