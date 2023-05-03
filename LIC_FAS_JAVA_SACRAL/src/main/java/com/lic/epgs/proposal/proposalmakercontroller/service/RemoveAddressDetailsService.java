package com.lic.epgs.proposal.proposalmakercontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.proposal.proposalmakercontroller.entity.Address;
import com.lic.epgs.proposal.proposalmakercontroller.repository.RemoveAddressDetailsRepository;

@Service
public class RemoveAddressDetailsService {
	
	@Autowired
	private RemoveAddressDetailsRepository removeAddressDetailsRepository;
	
	public Address deleteAddressByAddressIdAndProposalIdAndModifiedBy(Long addressId, Long proposalId, String modifiedBy) {
		return removeAddressDetailsRepository.deleteAddressByAddressIdAndProposalIdAndModifiedBy(addressId, proposalId, modifiedBy);
	}

}