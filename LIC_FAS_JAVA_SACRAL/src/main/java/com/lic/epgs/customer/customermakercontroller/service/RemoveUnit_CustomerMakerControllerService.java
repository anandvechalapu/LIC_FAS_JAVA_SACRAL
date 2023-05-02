package com.lic.epgs.customer.customermakercontroller.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.customer.customermakercontroller.repository.RemoveUnit_CustomerMakerControllerRepository;

@Service
public class RemoveUnit_CustomerMakerControllerService {
	
	@Autowired
	RemoveUnit_CustomerMakerControllerRepository removeUnit_CustomerMakerControllerRepository;
	
	public int deleteUnitDetails(Long customerUnitOfficeId, Long customerId) {
		Optional<RemoveUnit_CustomerMakerController> unit = removeUnit_CustomerMakerControllerRepository.findById(customerUnitOfficeId);
		if (unit.isPresent()) {
			return removeUnit_CustomerMakerControllerRepository.deleteUnitDetails(customerUnitOfficeId, customerId);
		} else {
			return 0;
		}
	}
	

}