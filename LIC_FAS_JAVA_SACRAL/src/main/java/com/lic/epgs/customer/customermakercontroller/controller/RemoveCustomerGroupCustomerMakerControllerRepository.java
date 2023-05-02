package com.lic.epgs.customer.customermakercontroller.repository;

import org.springframework.stereotype.Repository;

import com.lic.epgs.customer.customermakercontroller.dto.CommonResponseDto;

@Repository
public class RemoveCustomerGroupCustomerMakerControllerRepository {
	
	public CommonResponseDto removeCustomerGroupCompany(String groupId, String customerId) {
		return new CommonResponseDto("SUCCESS", "Customer Group removed successfully");
	}

}

package com.lic.epgs.customer.customermakercontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.customer.customermakercontroller.dto.CommonResponseDto;
import com.lic.epgs.customer.customermakercontroller.service.RemoveCustomerGroupCustomerMakerControllerService;

@RestController
public class RemoveCustomerGroupCustomerMakerController {
	
	@Autowired
	private RemoveCustomerGroupCustomerMakerControllerService removeCustomerGroupCustomerMakerControllerService;
	
	@PostMapping("/removeCustomerGroup")
	public CommonResponseDto removeCustomerGroup(@RequestParam String groupId, @RequestParam String customerId) {
		return removeCustomerGroupCustomerMakerControllerService.removeCustomerGroupCompany(groupId, customerId);
	}

}