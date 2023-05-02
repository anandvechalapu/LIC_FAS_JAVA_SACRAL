package com.lic.epgs.group.groupcustomerdetailscontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.group.groupcustomerdetailscontroller.model.Address;
import com.lic.epgs.group.groupcustomerdetailscontroller.service.AddCustomerAddressDetailsService;

@RestController
@RequestMapping("/address")
public class AddCustomerAddressDetailsController {
	
	@Autowired
	private AddCustomerAddressDetailsService addCustomerAddressDetailsService;
	
	@GetMapping("/addressType/{addressType}")
	public Address getAddressByAddressType(@PathVariable String addressType) {
		return addCustomerAddressDetailsService.findByAddressType(addressType);
	}
	
	@GetMapping("/country/{country}")
	public Address getAddressByCountry(@PathVariable String country) {
		return addCustomerAddressDetailsService.findByCountry(country);
	}
	
	@GetMapping("/state/{state}")
	public Address getAddressByState(@PathVariable String state) {
		return addCustomerAddressDetailsService.findByState(state);
	}
	
	@GetMapping("/district/{district}")
	public Address getAddressByDistrict(@PathVariable String district) {
		return addCustomerAddressDetailsService.findByDistrict(district);
	}
	
	@GetMapping("/town/{town}")
	public Address getAddressByTown(@PathVariable String town) {
		return addCustomerAddressDetailsService.findByTown(town);
	}
	
	@GetMapping("/addressLine1/{addressLine1}")
	public Address getAddressByAddressLine1(@PathVariable String addressLine1) {
		return addCustomerAddressDetailsService.findByAddressLine1(addressLine1);
	}
	
	@GetMapping("/addressLine2/{addressLine2}")
	public Address getAddressByAddressLine2(@PathVariable String addressLine2) {
		return addCustomerAddressDetailsService.findByAddressLine2(addressLine2);
	}
	
	@GetMapping("/addressLine3/{addressLine3}")
	public Address getAddressByAddressLine3(@PathVariable String addressLine3) {
		return addCustomerAddressDetailsService.findByAddressLine3(addressLine3);
	}
	
	@GetMapping("/all")
	public List<Address> getAllAddress(){
		return addCustomerAddressDetailsService.getAllAddress();
	}
	
	@PostMapping("/save")
	public void saveAddress(@RequestBody Address address) {
		addCustomerAddressDetailsService.save(address);
	}
	
	@PutMapping("/update")
	public void updateAddress(@RequestBody Address address) {
		addCustomerAddressDetailsService.update(address);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteAddress(@PathVariable Long id) {
		addCustomerAddressDetailsService.deleteAddress(id);
	}
	
	
}