package com.lic.epgs.proposal.proposalmakercontroller.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.proposal.proposalmakercontroller.entity.Proposal;
import com.lic.epgs.proposal.proposalmakercontroller.repository.ProposalMakerRepository;

@Service
public class ProposalMakerService {

	@Autowired
	private ProposalMakerRepository proposalMakerRepository;
	
	public Proposal findByProposalIdAndUserId(Long proposalId, String userId) {
		
		return proposalMakerRepository.findByProposalIdAndUserId(proposalId, userId);
		
	}
	
	public Proposal save(Proposal proposal) {
		
		return proposalMakerRepository.save(proposal);
		
	}
	
	public void deleteByProposalIdAndUserId(Long proposalId, String userId) {
		
		proposalMakerRepository.deleteByProposalIdAndUserId(proposalId, userId);
		
	}
	
	public void updateStatusByProposalIdAndUserId(String status, Long proposalId, String userId) {
		
		proposalMakerRepository.updateStatusByProposalIdAndUserId(status, proposalId, userId);
		
	}
	
	public void updateDocumentByProposalIdAndUserId(String document, Long proposalId, String userId) {
		
		proposalMakerRepository.updateDocumentByProposalIdAndUserId(document, proposalId, userId);
		
	}
	
}