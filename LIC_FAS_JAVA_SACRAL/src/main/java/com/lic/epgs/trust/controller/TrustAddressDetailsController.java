package com.lic.epgs.trust.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.trust.entity.TrustAddressDetails;
import com.lic.epgs.trust.service.TrustAddressDetailsService;

@RestController
@RequestMapping("/api")
public class TrustAddressDetailsController {
	
	@Autowired
	TrustAddressDetailsService trustAddressDetailsService;
	
	@PostMapping("/createAddressDetails")
	public TrustAddressDetails saveAddressDetails(@RequestBody TrustAddressDetails addressDetails) {
		return trustAddressDetailsService.saveAddressDetails(addressDetails);
	}
	
	@PutMapping("/updateAddressDetails")
	public void updateAddressDetails(@RequestParam("addressId") Long addressId, @RequestParam("modifiedBy") String modifiedBy, @RequestParam("createdBy") String createdBy, @RequestParam("trustId") Long trustId, @RequestParam("addressLine1") String addressLine1, @RequestParam("addressLine2") String addressLine2, @RequestParam("city") String city, @RequestParam("state") String state, @RequestParam("zipCode") String zipCode, @RequestParam("isActive") Boolean isActive) {
		trustAddressDetailsService.updateAddressDetails(addressId, modifiedBy, createdBy, trustId, addressLine1, addressLine2, city, state, zipCode, isActive);
	}
	
	@GetMapping("/getAddressDetailsByTrustId")
	public List<TrustAddressDetails> getAddressDetailsByTrustId(@RequestParam("trustId") Long trustId) {
		return trustAddressDetailsService.getAddressDetailsByTrustId(trustId);
	}
	
	@DeleteMapping("/deleteAddressDetails")
	public void deleteAddressDetails(@RequestParam("addressId") Long addressId) {
		trustAddressDetailsService.deleteAddressDetails(addressId);
	}

}