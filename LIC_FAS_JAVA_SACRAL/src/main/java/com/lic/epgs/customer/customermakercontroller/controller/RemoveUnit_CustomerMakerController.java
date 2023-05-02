package com.lic.epgs.customer.customermakercontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.customer.customermakercontroller.service.RemoveUnit_CustomerMakerControllerService;

@RestController
public class RemoveUnit_CustomerMakerController {
	
	@Autowired
	RemoveUnit_CustomerMakerControllerService removeUnit_CustomerMakerControllerService;
	
	@DeleteMapping("/deleteUnitDetails/{customerUnitOfficeId}/{customerId}")
	public int deleteUnitDetails(@PathVariable("customerUnitOfficeId") Long customerUnitOfficeId, @PathVariable("customerId") Long customerId) {
		return removeUnit_CustomerMakerControllerService.deleteUnitDetails(customerUnitOfficeId, customerId);
	}

}