package com.lic.epgs.proposal.proposalmakercontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.proposal.proposalmakercontroller.model.Proposal;
import com.lic.epgs.proposal.proposalmakercontroller.service.ProposalService;

@RestController
@RequestMapping("/proposal")
public class ProposalController {

	@Autowired
	private ProposalService proposalService;
	
	@GetMapping("/{proposalId}")
	public Proposal getProposalOverallDetails_PROPOSALMAKERCONTROLLER34(@PathVariable Long proposalId) {
		return proposalService.getProposalOverallDetails_PROPOSALMAKERCONTROLLER34(proposalId);
	}

}