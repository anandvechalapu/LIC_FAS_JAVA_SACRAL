package com.lic.epgs.customer.customermakercontroller.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.customer.customermakercontroller.model.CustomerContactDetails;
import com.lic.epgs.customer.customermakercontroller.service.AddCustomerContactDetails_CustomerMakerControllerService;

@RestController
@RequestMapping("/customer")
public class AddCustomerContactDetails_CustomerMakerController {
	
	@Autowired
	AddCustomerContactDetails_CustomerMakerControllerService addCustomerContactDetails_CustomerMakerControllerService;
	
	@PostMapping("/save")
	public CustomerContactDetails save(@RequestBody CustomerContactDetails customerContactDetails) {
		return addCustomerContactDetails_CustomerMakerControllerService.save(customerContactDetails);
	}
	
	@PostMapping("/findbyid")
	public Optional<CustomerContactDetails> findByCustomerId(Long customerId) {
		return addCustomerContactDetails_CustomerMakerControllerService.findByCustomerId(customerId);
	}
	
	@PostMapping("/deletebyid")
	public void deleteByCustomerId(Long customerId) {
		addCustomerContactDetails_CustomerMakerControllerService.deleteByCustomerId(customerId);
	}

}