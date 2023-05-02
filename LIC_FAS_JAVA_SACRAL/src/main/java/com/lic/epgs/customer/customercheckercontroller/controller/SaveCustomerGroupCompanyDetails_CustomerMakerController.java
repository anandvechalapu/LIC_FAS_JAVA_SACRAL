package com.lic.epgs.customer.customercheckercontroller.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.customer.customercheckercontroller.model.CustomerGroupCompanyDetails;
import com.lic.epgs.customer.customercheckercontroller.service.SaveCustomerGroupCompanyDetails_CustomerMakerControllerService;

@RestController
@RequestMapping("/customerGroupCompany")
public class SaveCustomerGroupCompanyDetails_CustomerMakerController {
	
	@Autowired
	private SaveCustomerGroupCompanyDetails_CustomerMakerControllerService saveCustomerGroupCompanyDetailsCustomerMakerControllerService; 
	
	@PostMapping("/save")
	public ResponseEntity<String> saveCustomerGroupCompanyDetails(@RequestBody CustomerGroupCompanyDetails customerGroupCompanyDetails) {
		boolean isSuccess = saveCustomerGroupCompanyDetailsCustomerMakerControllerService.saveCustomerGroupCompanyDetails(customerGroupCompanyDetails.getCustomerId(), customerGroupCompanyDetails.getGroupId());
		if(isSuccess) {
			return new ResponseEntity<String>("Successfully Saved", HttpStatus.OK);
		}
		return new ResponseEntity<String>("Failed to Save", HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@PostMapping("/get")
	public ResponseEntity<Optional<CustomerGroupCompanyDetails>> getCustomerGroupCompanyDetails(@RequestBody CustomerGroupCompanyDetails customerGroupCompanyDetails) {
		Optional<CustomerGroupCompanyDetails> customerGroupCompanyDetailsOptional = saveCustomerGroupCompanyDetailsCustomerMakerControllerService.findByCustomerIdAndGroupId(customerGroupCompanyDetails.getCustomerId(), customerGroupCompanyDetails.getGroupId());
		if(customerGroupCompanyDetailsOptional.isPresent()) {
			return new ResponseEntity<Optional<CustomerGroupCompanyDetails>>(customerGroupCompanyDetailsOptional, HttpStatus.OK);
		}
		return new ResponseEntity<Optional<CustomerGroupCompanyDetails>>(customerGroupCompanyDetailsOptional, HttpStatus.NOT_FOUND);
	}

}