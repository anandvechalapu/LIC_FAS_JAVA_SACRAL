package com.lic.epgs.group.groupcustomerdetailscontroller.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lic.epgs.group.groupcustomerdetailscontroller.repository.GroupCustomerDetailsControllerRepository;
import com.lic.epgs.model.Customer;
import com.lic.epgs.model.Trust;

@Service
@Transactional
public class GroupCustomerDetailsControllerService {

	private final GroupCustomerDetailsControllerRepository groupCustomerDetailsControllerRepository;

	public GroupCustomerDetailsControllerService(GroupCustomerDetailsControllerRepository groupCustomerDetailsControllerRepository) {
		this.groupCustomerDetailsControllerRepository = groupCustomerDetailsControllerRepository;
	}

	public List<Customer> searchMemberCustomerDetails(String customerCode, String customerName, String trustName) {
		return groupCustomerDetailsControllerRepository.searchMemberCustomerDetails(customerCode, customerName, trustName);
	}

	public List<Customer> getActiveMemberCustomers() {
		return groupCustomerDetailsControllerRepository.getActiveMemberCustomers();
	}

	public List<Customer> getCustomerBasicDetails(String customerCode, String customerName, String customerStatus) {
		return groupCustomerDetailsControllerRepository.getCustomerBasicDetails(customerCode, customerName, customerStatus);
	}

	public List<Trust> getTrustDetails(String trustName, String trustId) {
		return groupCustomerDetailsControllerRepository.getTrustDetails(trustName, trustId);
	}

}