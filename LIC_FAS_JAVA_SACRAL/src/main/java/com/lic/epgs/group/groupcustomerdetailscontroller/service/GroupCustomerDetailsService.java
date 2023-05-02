package com.lic.epgs.group.groupcustomerdetailscontroller.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.group.groupcustomerdetailscontroller.model.GroupCustomerDetails;
import com.lic.epgs.group.groupcustomerdetailscontroller.repository.GroupCustomerDetailsRepository;

@Service
public class GroupCustomerDetailsService {

	@Autowired
	GroupCustomerDetailsRepository groupCustomerDetailsRepository;

	public GroupCustomerDetails findByGroupCustomerId(Long groupCustomerId) {
		return groupCustomerDetailsRepository.findByGroupCustomerId(groupCustomerId);
	}

	public GroupCustomerDetails findByBasicDetailsNameAndType(String name, String type) {
		return groupCustomerDetailsRepository.findByBasicDetailsNameAndType(name, type);
	}

	public GroupCustomerDetails findByContactDetailsPrimaryContactNameAndNumber(String contactName, String contactNumber) {
		return groupCustomerDetailsRepository.findByContactDetailsPrimaryContactNameAndNumber(contactName, contactNumber);
	}

	public GroupCustomerDetails findByAddressDetailsAddressLineAndCity(String addressLine, String city) {
		return groupCustomerDetailsRepository.findByAddressDetailsAddressLineAndCity(addressLine, city);
	}

	public GroupCustomerDetails findByGroupCustomerDetailsCustomerIdAndName(Long customerId, String customerName) {
		return groupCustomerDetailsRepository.findByGroupCustomerDetailsCustomerIdAndName(customerId, customerName);
	}

	public GroupCustomerDetails findByNotes(String notes) {
		return groupCustomerDetailsRepository.findByNotes(notes);
	}

	public GroupCustomerDetails findByBankAccountDetailsAccountNumberAndBankName(String accountNumber,
			String bankName) {
		return groupCustomerDetailsRepository.findByBankAccountDetailsAccountNumberAndBankName(accountNumber, bankName);
	}

	public GroupCustomerDetails findByGroupCustomerIdAndReturnErrorMessage(Long groupCustomerId) {
		return groupCustomerDetailsRepository.findByGroupCustomerIdAndReturnErrorMessage(groupCustomerId);
	}

	public List<GroupCustomerDetails> findAll() {
		return groupCustomerDetailsRepository.findAll();
	}

	public Optional<GroupCustomerDetails> findById(Long id) {
		return groupCustomerDetailsRepository.findById(id);
	}

	public GroupCustomerDetails save(GroupCustomerDetails groupCustomerDetails) {
		return groupCustomerDetailsRepository.save(groupCustomerDetails);
	}

	public void deleteById(Long id) {
		groupCustomerDetailsRepository.deleteById(id);
	}
}