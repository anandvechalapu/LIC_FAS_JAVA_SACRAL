package com.lic.epgs.customer.customermakercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lic.epgs.customer.customermakercontroller.model.CustomerBasicDetails;

public interface SaveCustomerBasicDetails_CustomerMakerController19Repository extends JpaRepository<CustomerBasicDetails, Long> {

	/**
	 * This method is used to save the customer basic details in the database
	 * 
	 * @param customer Basic Details - Request body in JSON format containing the customer basic details
	 * @return customerBasicDetails - Saved/updated customer basic details in the response body
	 */
	public CustomerBasicDetails save(CustomerBasicDetails customerBasicDetails);

	/**
	 * This method is used to update the customer mapped details in the database
	 * 
	 * @param customerId - Customer ID
	 * @return customerBasicDetails - Updated customer mapped details
	 */
	public CustomerBasicDetails updateCustomerMappedDetails(Long customerId);

}