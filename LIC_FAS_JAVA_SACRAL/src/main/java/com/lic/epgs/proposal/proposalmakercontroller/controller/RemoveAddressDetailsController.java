package com.lic.epgs.proposal.proposalmakercontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.proposal.proposalmakercontroller.entity.Address;
import com.lic.epgs.proposal.proposalmakercontroller.service.RemoveAddressDetailsService;

@RestController
public class RemoveAddressDetailsController {
	
	@Autowired
	private RemoveAddressDetailsService removeAddressDetailsService;
	
	@DeleteMapping("/deleteAddress/{addressId}/{proposalId}/{modifiedBy}")
	public Address deleteAddressByAddressIdAndProposalIdAndModifiedBy(@PathVariable("addressId") Long addressId, @PathVariable("proposalId") Long proposalId, @PathVariable("modifiedBy") String modifiedBy) {
		return removeAddressDetailsService.deleteAddressByAddressIdAndProposalIdAndModifiedBy(addressId, proposalId, modifiedBy);
	}

}