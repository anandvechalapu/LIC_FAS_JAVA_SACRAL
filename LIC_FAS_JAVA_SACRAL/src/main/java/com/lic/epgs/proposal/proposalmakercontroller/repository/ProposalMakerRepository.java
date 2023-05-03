package com.lic.epgs.proposal.proposalmakercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.proposal.proposalmakercontroller.entity.Proposal;

@Repository
public interface ProposalMakerRepository extends JpaRepository<Proposal, Long> {
	
	Proposal findByProposalIdAndUserId(Long proposalId, String userId);
	
	Proposal save(Proposal proposal);
	
	void deleteByProposalIdAndUserId(Long proposalId, String userId);
	
	void updateStatusByProposalIdAndUserId(String status, Long proposalId, String userId);
	
	void updateDocumentByProposalIdAndUserId(String document, Long proposalId, String userId);

}