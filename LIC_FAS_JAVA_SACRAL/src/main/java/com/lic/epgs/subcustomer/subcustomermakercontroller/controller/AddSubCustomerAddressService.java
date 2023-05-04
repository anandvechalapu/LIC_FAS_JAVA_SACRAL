package com.lic.epgs.subcustomer.subcustomermakercontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.subcustomer.subcustomermakercontroller.model.SubCustomerAddress;
import com.lic.epgs.subcustomer.subcustomermakercontroller.repository.AddSubCustomerAddressDetailsRepository;

@Service
public class AddSubCustomerAddressService {

	@Autowired
	private AddSubCustomerAddressDetailsRepository addSubCustomerAddressDetailsRepository;
	
	public SubCustomerAddress saveSubCustomerAddress(SubCustomerAddress subCustomerAddress){
		return addSubCustomerAddressDetailsRepository.save(subCustomerAddress);
	}
	
	public SubCustomerAddress updateSubCustomerAddress(SubCustomerAddress subCustomerAddress){
		return addSubCustomerAddressDetailsRepository.save(subCustomerAddress);
	}
}

package com.lic.epgs.subcustomer.subcustomermakercontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.subcustomer.subcustomermakercontroller.model.SubCustomerAddress;
import com.lic.epgs.subcustomer.subcustomermakercontroller.service.AddSubCustomerAddressService;
import com.lic.epgs.subcustomer.subcustomermakercontroller.service.RemoveSubCustomerAddressService;

@RestController
@RequestMapping("/subcustomer/address")
public class SubCustomerAddressController {
	
	@Autowired
	private AddSubCustomerAddressService addSubCustomerAddressService;
	
	@Autowired
	private RemoveSubCustomerAddressService removeSubCustomerAddressService;
	
	@PostMapping
	public SubCustomerAddress saveSubCustomerAddress(@RequestBody SubCustomerAddress subCustomerAddress) {
		return addSubCustomerAddressService.saveSubCustomerAddress(subCustomerAddress);
	}
	
	@PutMapping
	public SubCustomerAddress updateSubCustomerAddress(@RequestBody SubCustomerAddress subCustomerAddress) {
		return addSubCustomerAddressService.updateSubCustomerAddress(subCustomerAddress);
	}
	
	@DeleteMapping("/{subCustomerId}/{addressId}")
	public void deleteSubCustomerAddress(@PathVariable Long subCustomerId, @PathVariable Long addressId) {
		removeSubCustomerAddressService.deleteBySubCustomerIdAndAddressId(subCustomerId, addressId);
	}

}