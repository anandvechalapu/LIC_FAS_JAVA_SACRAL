package com.lic.epgs.group.groupcustomerdetailscontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.group.groupcustomerdetailscontroller.model.Address;
import com.lic.epgs.group.groupcustomerdetailscontroller.repository.AddCustomerAddressDetailsRepository;

@Service
public class AddCustomerAddressDetailsService {
	
	@Autowired
	private AddCustomerAddressDetailsRepository addCustomerAddressDetailsRepository;
	
	public Address findByAddressType(String addressType) {
		return addCustomerAddressDetailsRepository.findByAddressType(addressType);
	}
	
	public Address findByCountry(String country) {
		return addCustomerAddressDetailsRepository.findByCountry(country);
	}
	
	public Address findByState(String state) {
		return addCustomerAddressDetailsRepository.findByState(state);
	}
	
	public Address findByDistrict(String district) {
		return addCustomerAddressDetailsRepository.findByDistrict(district);
	}
	
	public Address findByTown(String town) {
		return addCustomerAddressDetailsRepository.findByTown(town);
	}
	
	public Address findByAddressLine1(String addressLine1) {
		return addCustomerAddressDetailsRepository.findByAddressLine1(addressLine1);
	}
	
	public Address findByAddressLine2(String addressLine2) {
		return addCustomerAddressDetailsRepository.findByAddressLine2(addressLine2);
	}
	
	public Address findByAddressLine3(String addressLine3) {
		return addCustomerAddressDetailsRepository.findByAddressLine3(addressLine3);
	}
	
	public void save(Address address) {
		addCustomerAddressDetailsRepository.save(address);
	}
	
	public void update(Address address) {
		addCustomerAddressDetailsRepository.update(address);
	}
	
	public List<Address> getAllAddress(){
		return addCustomerAddressDetailsRepository.findAll();
	}
	
	public void deleteAddress(Long id) {
		addCustomerAddressDetailsRepository.deleteById(id);
	}
}