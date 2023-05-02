package com.lic.epgs.group.groupcustomerdetailscontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.group.groupcustomerdetailscontroller.service.GroupCustomerBankAccountDetailsService;

@RestController
public class GroupCustomerBankAccountDetailsController {

	@Autowired
	private GroupCustomerBankAccountDetailsService groupCustomerBankAccountDetailsService;
	
	@GetMapping("/groupCustomer/{groupCustomerId}/bankAccountDetails")
	public String getGroupCustomerBankAccountDetailsByGroupCustomerId(@PathVariable Long groupCustomerId) {
		return groupCustomerBankAccountDetailsService.getGroupCustomerBankAccountDetailsByGroupCustomerId(groupCustomerId);
	}
}