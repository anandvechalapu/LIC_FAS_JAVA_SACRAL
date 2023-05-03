@Repository
package com.lic.epgs.proposal.proposalcheckercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.proposal.proposalcheckercontroller.model.ProposalRejection;

@Repository
public interface ProposalRejectionRepository extends JpaRepository<ProposalRejection, Long> {
    
	// Find proposal by proposal ID
    ProposalRejection findByProposalId(String proposalId);
    
	// Update proposal status to Rejected and Work Flow Status to Rejected
    void updateProposalStatusToRejectedAndWorkFlowStatusToRejected(String proposalId);
    
	// Update rejection remark and/or remarks for the proposal
    void updateRejectionRemarkForProposal(String rejectionRemark, String proposalId);
    
	// Mark proposal as inactive and create new version with updated status
    void markProposalAsInactiveAndCreateNewVersionWithUpdatedStatus(String proposalId);
    
	// Update proposal in all related tables 
    void updateProposalInAllRelatedTables(String proposalId);
    
	// Copy notes associated with the proposal to new proposal version
    void copyNotesAssociatedWithProposalToNewProposalVersion(String proposalId);
}