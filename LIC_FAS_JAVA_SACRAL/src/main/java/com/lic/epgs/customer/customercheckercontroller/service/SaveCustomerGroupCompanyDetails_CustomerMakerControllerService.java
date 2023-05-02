package com.lic.epgs.customer.customercheckercontroller.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.customer.customercheckercontroller.model.CustomerGroupCompanyDetails;
import com.lic.epgs.customer.customercheckercontroller.repository.SaveCustomerGroupCompanyDetails_CustomerMakerControllerRepository;

@Service
public class SaveCustomerGroupCompanyDetails_CustomerMakerControllerService {
	
	@Autowired
	private SaveCustomerGroupCompanyDetails_CustomerMakerControllerRepository saveCustomerGroupCompanyDetailsCustomerMakerControllerRepository;
	
	public boolean saveCustomerGroupCompanyDetails(int customerId, int groupId) {
		boolean isSuccess = saveCustomerGroupCompanyDetailsCustomerMakerControllerRepository.saveCustomerGroupCompanyDetails(customerId, groupId);
		return isSuccess;
	}
	
	public Optional<CustomerGroupCompanyDetails> findByCustomerIdAndGroupId(int customerId, int groupId) {
		Optional<CustomerGroupCompanyDetails> customerGroupCompanyDetails = saveCustomerGroupCompanyDetailsCustomerMakerControllerRepository.findByCustomerIdAndGroupId(customerId, groupId);
		return customerGroupCompanyDetails;
	}

}