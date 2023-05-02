package com.lic.epgs.customer.customermakercontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.customer.customermakercontroller.model.CustomerBasicDetails;
import com.lic.epgs.customer.customermakercontroller.service.SaveCustomerBasicDetails_CustomerMakerController19Service;

@RestController
public class SaveCustomerBasicDetails_CustomerMakerController19Controller {

	@Autowired
	SaveCustomerBasicDetails_CustomerMakerController19Service saveCustomerBasicDetails_CustomerMakerController19Service;

	/**
	 * This method is used to save the customer basic details
	 * 
	 * @param customer Basic Details - Request body in JSON format containing the customer basic details
	 * @return customerBasicDetails - Saved/updated customer basic details in the response body
	 */
	@PostMapping(value = "/saveCustomerBasicDetails")
	public ResponseEntity<CustomerBasicDetails> save(@RequestBody CustomerBasicDetails customerBasicDetails) {
		return new ResponseEntity<CustomerBasicDetails>(saveCustomerBasicDetails_CustomerMakerController19Service
				.save(customerBasicDetails), HttpStatus.CREATED);
	}

	/**
	 * This method is used to update the customer mapped details
	 * 
	 * @param customerId - Customer ID
	 * @return customerBasicDetails - Updated customer mapped details
	 */
	@PutMapping(value = "/updateCustomerMappedDetails")
	public ResponseEntity<CustomerBasicDetails> updateCustomerMappedDetails(@RequestParam Long customerId) {
		return new ResponseEntity<CustomerBasicDetails>(
				saveCustomerBasicDetails_CustomerMakerController19Service.updateCustomerMappedDetails(customerId),
				HttpStatus.ACCEPTED);
	}

}