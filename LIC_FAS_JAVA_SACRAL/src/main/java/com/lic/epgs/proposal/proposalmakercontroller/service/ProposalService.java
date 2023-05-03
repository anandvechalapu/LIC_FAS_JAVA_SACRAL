package com.lic.epgs.proposal.proposalmakercontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.proposal.proposalmakercontroller.model.Proposal;
import com.lic.epgs.proposal.proposalmakercontroller.repository.ProposalRepository;

@Service
public class ProposalService {
	
	@Autowired
    private ProposalRepository proposalRepository;
	
	public Proposal getProposalOverallDetails_PROPOSALMAKERCONTROLLER34(Long proposalId) {
		return proposalRepository.getProposalOverallDetails_PROPOSALMAKERCONTROLLER34(proposalId);
	}

}