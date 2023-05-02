package com.lic.epgs.customer.customermakercontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.customer.customermakercontroller.dto.CommonResponseDto;
import com.lic.epgs.customer.customermakercontroller.repository.RemoveCustomerGroupCustomerMakerControllerRepository;

@Service
public class RemoveCustomerGroupCustomerMakerControllerService {
	
	@Autowired
	private RemoveCustomerGroupCustomerMakerControllerRepository removeCustomerGroupCustomerMakerControllerRepository;
	
	public CommonResponseDto removeCustomerGroupCompany(String groupId, String customerId) {
		return removeCustomerGroupCustomerMakerControllerRepository.removeCustomerGroupCompany(groupId, customerId);
	}

}