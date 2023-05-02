package com.lic.epgs.customer.customermakercontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.customer.customermakercontroller.model.CustomerBasicDetails;
import com.lic.epgs.customer.customermakercontroller.repository.SaveCustomerBasicDetails_CustomerMakerController19Repository;

@Service
public class SaveCustomerBasicDetails_CustomerMakerController19Service {

	@Autowired
	SaveCustomerBasicDetails_CustomerMakerController19Repository saveCustomerBasicDetails_CustomerMakerController19Repository;

	/**
	 * This method is used to save the customer basic details in the database
	 * 
	 * @param customer Basic Details - Request body in JSON format containing the customer basic details
	 * @return customerBasicDetails - Saved/updated customer basic details in the response body
	 */
	public CustomerBasicDetails save(CustomerBasicDetails customerBasicDetails) {
		return saveCustomerBasicDetails_CustomerMakerController19Repository.save(customerBasicDetails);
	}

	/**
	 * This method is used to update the customer mapped details in the database
	 * 
	 * @param customerId - Customer ID
	 * @return customerBasicDetails - Updated customer mapped details
	 */
	public CustomerBasicDetails updateCustomerMappedDetails(Long customerId) {
		return saveCustomerBasicDetails_CustomerMakerController19Repository.updateCustomerMappedDetails(customerId);
	}
}