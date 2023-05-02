package com.lic.epgs.customer.customercheckercontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.customer.customercheckercontroller.dto.CustomerBasicDetailsDto;
import com.lic.epgs.customer.customercheckercontroller.repository.EditExitingCustomerBasicDetailsRepository;

@Service
public class EditExitingCustomerBasicDetailsService {
	
	@Autowired
	private EditExitingCustomerBasicDetailsRepository editExitingCustomerBasicDetailsRepository;
	
	public CustomerBasicDetailsDto findByCustomerId(Long customerId) {
		return editExitingCustomerBasicDetailsRepository.findByCustomerId(customerId);
	}

	public CustomerBasicDetailsDto save(CustomerBasicDetailsDto customerBasicDetailsDto) {
		return editExitingCustomerBasicDetailsRepository.save(customerBasicDetailsDto);
	}
	
	public void createHistoryRecordForCustomerBasicDetails(CustomerBasicDetailsDto customerBasicDetailsDto) {
		editExitingCustomerBasicDetailsRepository.createHistoryRecordForCustomerBasicDetails(customerBasicDetailsDto);
	}
	
	public void createHistoryRecordForAddressDetails(CustomerBasicDetailsDto customerBasicDetailsDto) {
		editExitingCustomerBasicDetailsRepository.createHistoryRecordForAddressDetails(customerBasicDetailsDto);
	}
	
	public void createHistoryRecordForContactDetails(CustomerBasicDetailsDto customerBasicDetailsDto) {
		editExitingCustomerBasicDetailsRepository.createHistoryRecordForContactDetails(customerBasicDetailsDto);
	}
	
	public void createHistoryRecordForCustomerNotes(CustomerBasicDetailsDto customerBasicDetailsDto) {
		editExitingCustomerBasicDetailsRepository.createHistoryRecordForCustomerNotes(customerBasicDetailsDto);
	}
	
	public void createHistoryRecordForBankAccountDetails(CustomerBasicDetailsDto customerBasicDetailsDto) {
		editExitingCustomerBasicDetailsRepository.createHistoryRecordForBankAccountDetails(customerBasicDetailsDto);
	}
	
	public void createHistoryRecordForDocumentDetails(CustomerBasicDetailsDto customerBasicDetailsDto) {
		editExitingCustomerBasicDetailsRepository.createHistoryRecordForDocumentDetails(customerBasicDetailsDto);
	}
	
	public void createHistoryRecordForCustomerUnitOfficeDetails(CustomerBasicDetailsDto customerBasicDetailsDto) {
		editExitingCustomerBasicDetailsRepository.createHistoryRecordForCustomerUnitOfficeDetails(customerBasicDetailsDto);
	}

}