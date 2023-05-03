package com.lic.epgs.proposal.proposalcheckercontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.proposal.proposalcheckercontroller.model.ProposalRejection;
import com.lic.epgs.proposal.proposalcheckercontroller.repository.ProposalRejectionRepository;

@Service
public class ProposalRejectionService {
	@Autowired
	private ProposalRejectionRepository proposalRejectionRepository;
	
	public ProposalRejection findByProposalId(Long proposalId) {
		return proposalRejectionRepository.findByProposalId(proposalId);
	}
	
	public List<ProposalRejection> findByStatusAndWorkFlowStatus(String status, String workFlowStatus) {
		return proposalRejectionRepository.findByStatusAndWorkFlowStatus(status, workFlowStatus);
	}
	
	public void updateProposalStatusAndWorkFlowStatus(String status, String workFlowStatus, Long proposalId) {
		proposalRejectionRepository.updateProposalStatusAndWorkFlowStatus(status, workFlowStatus, proposalId);
	}
	
	public void updateProposalRemarks(String remarks, Long proposalId) {
		proposalRejectionRepository.updateProposalRemarks(remarks, proposalId);
	}
	
	public void markProposalInactive(Long proposalId) {
		proposalRejectionRepository.markProposalInactive(proposalId);
	}
	
	public void createNewVersionOfProposal(Long proposalId) {
		proposalRejectionRepository.createNewVersionOfProposal(proposalId);
	}
	
	public void updateRelatedTables(Long proposalId) {
		proposalRejectionRepository.updateRelatedTables(proposalId);
	}
	
	public void copyNotesToNewProposalVersion(Long proposalId) {
		proposalRejectionRepository.copyNotesToNewProposalVersion(proposalId);
	}
	
}