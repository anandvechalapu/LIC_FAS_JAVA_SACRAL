package com.lic.epgs.proposal.proposalcheckercontroller.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.proposal.proposalcheckercontroller.model.ProposalRejection;
import com.lic.epgs.proposal.proposalcheckercontroller.repository.ProposalRejectionRepository;

@Service
public class ProposalRejectionService {

	@Autowired
	private ProposalRejectionRepository proposalRejectionRepository;

	public ProposalRejection findByProposalId(String proposalId) {
		Optional<ProposalRejection> proposalRejection = proposalRejectionRepository.findByProposalId(proposalId);
		return proposalRejection.orElse(null);
	}

	public void updateProposalStatusToRejectedAndWorkFlowStatusToRejected(String proposalId) {
		ProposalRejection proposalRejection = proposalRejectionRepository.findByProposalId(proposalId);
		if (proposalRejection != null) {
			proposalRejection.setProposalStatus("Rejected");
			proposalRejection.setWorkFlowStatus("Rejected");
			proposalRejectionRepository.save(proposalRejection);
		}
	}

	public void updateRejectionRemarkForProposal(String rejectionRemark, String proposalId) {
		ProposalRejection proposalRejection = proposalRejectionRepository.findByProposalId(proposalId);
		if (proposalRejection != null) {
			proposalRejection.setRejectionRemark(rejectionRemark);
			proposalRejectionRepository.save(proposalRejection);
		}
	}

	public void markProposalAsInactiveAndCreateNewVersionWithUpdatedStatus(String proposalId) {
		ProposalRejection proposalRejection = proposalRejectionRepository.findByProposalId(proposalId);
		if (proposalRejection != null) {
			proposalRejection.setActive(false);
			proposalRejectionRepository.save(proposalRejection);
			// Create new version
			ProposalRejection newVersionProposalRejection = new ProposalRejection();
			// Set the fields
			newVersionProposalRejection.setProposalId(proposalId);
			newVersionProposalRejection.setProposalStatus("Rejected");
			newVersionProposalRejection.setWorkFlowStatus("Rejected");
			newVersionProposalRejection.setActive(true);
			proposalRejectionRepository.save(newVersionProposalRejection);
		}
	}

	public void updateProposalInAllRelatedTables(String proposalId) {
		// TODO: Implement method to update proposal in all related tables
	}

	public void copyNotesAssociatedWithProposalToNewProposalVersion(String proposalId) {
		// TODO: Implement method to copy notes associated with the proposal to new proposal version
	}

}