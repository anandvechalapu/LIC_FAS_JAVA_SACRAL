package com.lic.epgs.group.groupcustomerdetailscontroller.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.model.Customer;
import com.lic.epgs.model.Trust;
import com.lic.epgs.group.groupcustomerdetailscontroller.service.GroupCustomerDetailsControllerService;

@RestController
public class GroupCustomerDetailsController {

	private final GroupCustomerDetailsControllerService groupCustomerDetailsControllerService;

	public GroupCustomerDetailsController(GroupCustomerDetailsControllerService groupCustomerDetailsControllerService) {
		this.groupCustomerDetailsControllerService = groupCustomerDetailsControllerService;
	}

	@GetMapping("/customer/search")
	public List<Customer> searchMemberCustomerDetails(@RequestParam String customerCode,
			@RequestParam String customerName, @RequestParam String trustName) {
		return groupCustomerDetailsControllerService.searchMemberCustomerDetails(customerCode, customerName,
				trustName);
	}

	@GetMapping("/customer/active")
	public List<Customer> getActiveMemberCustomers() {
		return groupCustomerDetailsControllerService.getActiveMemberCustomers();
	}

	@GetMapping("/customer/basic")
	public List<Customer> getCustomerBasicDetails(@RequestParam String customerCode, @RequestParam String customerName,
			@RequestParam String customerStatus) {
		return groupCustomerDetailsControllerService.getCustomerBasicDetails(customerCode, customerName,
				customerStatus);
	}

	@GetMapping("/trust/details")
	public List<Trust> getTrustDetails(@RequestParam String trustName, @RequestParam String trustId) {
		return groupCustomerDetailsControllerService.getTrustDetails(trustName, trustId);
	}

}