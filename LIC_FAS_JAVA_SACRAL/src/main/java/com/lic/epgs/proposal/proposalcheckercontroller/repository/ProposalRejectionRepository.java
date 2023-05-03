import org.springframework.data.jpa.repository.JpaRepository;

import com.lic.epgs.proposal.proposalcheckercontroller.model.ProposalRejection;

public interface ProposalRejectionRepository extends JpaRepository<ProposalRejection, Long> {
	 
	ProposalRejection findByProposalId(Long proposalId);
	 
	List<ProposalRejection> findByStatusAndWorkFlowStatus(String status, String workFlowStatus); 
	 
	void updateProposalStatusAndWorkFlowStatus(String status, String workFlowStatus, Long proposalId); 
	 
	void updateProposalRemarks(String remarks, Long proposalId); 
	 
	void markProposalInactive(Long proposalId); 
	 
	void createNewVersionOfProposal(Long proposalId); 
	 
	void updateRelatedTables(Long proposalId); 
	 
	void copyNotesToNewProposalVersion(Long proposalId); 
	 
}