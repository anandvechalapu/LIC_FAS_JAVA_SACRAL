package com.lic.epgs.proposal.proposalmakercontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.proposal.proposalmakercontroller.model.ProposalAddress;
import com.lic.epgs.proposal.proposalmakercontroller.service.ProposalAddressService;

@RestController
public class ProposalAddressController {

	@Autowired
	private ProposalAddressService proposalAddressService;
	
	@GetMapping("/proposal/{proposalId}/address/{addressId}")
	public ResponseEntity<ProposalAddress> getProposalAddress(@PathVariable Long proposalId, @PathVariable Long addressId) {
		ProposalAddress proposalAddress = proposalAddressService.getProposalAddressById(proposalId, addressId);
		return new ResponseEntity<>(proposalAddress, HttpStatus.OK);
	}
	
}