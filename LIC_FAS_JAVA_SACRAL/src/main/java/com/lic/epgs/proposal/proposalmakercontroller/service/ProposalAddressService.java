package com.lic.epgs.proposal.proposalmakercontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.proposal.proposalmakercontroller.model.ProposalAddress;
import com.lic.epgs.proposal.proposalmakercontroller.repository.ProposalAddressRepository;

@Service
public class ProposalAddressService {

	@Autowired
	private ProposalAddressRepository proposalAddressRepository;
	
	public ProposalAddress getProposalAddressById(Long proposalId, Long addressId) {
		return proposalAddressRepository.findByProposalIdAndAddressId(proposalId, addressId);
	}
	
}