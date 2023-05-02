package com.lic.epgs.customer.customermakercontroller.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.customer.customermakercontroller.model.CustomerContactDetails;
import com.lic.epgs.customer.customermakercontroller.repository.AddCustomerContactDetails_CustomerMakerControllerRepository;

@Service
public class AddCustomerContactDetails_CustomerMakerControllerService {

	@Autowired
	AddCustomerContactDetails_CustomerMakerControllerRepository addCustomerContactDetails_CustomerMakerControllerRepository;

	public CustomerContactDetails save(CustomerContactDetails customerContactDetails) {
		return addCustomerContactDetails_CustomerMakerControllerRepository.save(customerContactDetails);
	}

	public Optional<CustomerContactDetails> findByCustomerId(Long customerId) {
		return addCustomerContactDetails_CustomerMakerControllerRepository.findByCustomerId(customerId);
	}
	
	public void deleteByCustomerId(Long customerId) {
		addCustomerContactDetails_CustomerMakerControllerRepository.deleteByCustomerId(customerId);
	}

}