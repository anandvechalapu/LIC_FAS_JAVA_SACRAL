package com.lic.epgs.group.groupcustomerdetailscontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.group.groupcustomerdetailscontroller.model.GroupCustomerContactDetails;
import com.lic.epgs.group.groupcustomerdetailscontroller.service.GroupCustomerContactDetailsService;

@RestController
@RequestMapping("/groupcustomercontactdetails")
public class GroupCustomerContactDetailsController {
	
	@Autowired
	private GroupCustomerContactDetailsService groupCustomerContactDetailsService;
	
	@GetMapping("/{groupCustomerId}")
	public GroupCustomerContactDetails getGroupCustomerContactDetailsByGroupCustomerId(@PathVariable Long groupCustomerId) {
		return groupCustomerContactDetailsService.findByGroupCustomerId(groupCustomerId);
	}
	
	@PostMapping
	public void addNewGroupCustomerContactDetails(@RequestBody GroupCustomerContactDetails groupCustomerContactDetails) {
		groupCustomerContactDetailsService.addNewGroupCustomerContactDetails(groupCustomerContactDetails);
	}
	
	@PutMapping
	public void updateGroupCustomerContactDetails(@RequestBody GroupCustomerContactDetails groupCustomerContactDetails) {
		groupCustomerContactDetailsService.updateGroupCustomerContactDetails(groupCustomerContactDetails);
	}
	
	@DeleteMapping
	public void deleteGroupCustomerContactDetails(@RequestBody GroupCustomerContactDetails groupCustomerContactDetails) {
		groupCustomerContactDetailsService.deleteGroupCustomerContactDetails(groupCustomerContactDetails);
	}
	
	@GetMapping
	public List<GroupCustomerContactDetails> getAllGroupCustomerContactDetails() {
		return groupCustomerContactDetailsService.getAllGroupCustomerContactDetails();
	}
}