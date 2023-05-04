package com.lic.epgs.subcustomer.subcustomermakercontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.subcustomer.subcustomermakercontroller.model.SubCustomerAddress;
import com.lic.epgs.subcustomer.subcustomermakercontroller.repository.RemoveSubCustomerAddressDetailsRepository;

@Service
public class RemoveSubCustomerAddressService {

	@Autowired
	private RemoveSubCustomerAddressDetailsRepository removeSubCustomerAddressDetailsRepository;
	
	public SubCustomerAddress findBySubCustomerIdAndAddressId(Long subCustomerId, Long addressId){
		return removeSubCustomerAddressDetailsRepository.findBySubCustomerIdAndAddressId(subCustomerId, addressId);
	}
	
	public void deleteBySubCustomerIdAndAddressId(Long subCustomerId, Long addressId){
		removeSubCustomerAddressDetailsRepository.deleteBySubCustomerIdAndAddressId(subCustomerId, addressId);
	}
	
}