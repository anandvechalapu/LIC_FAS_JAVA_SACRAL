import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.proposal.proposalmakercontroller.model.Proposal;

@Repository
public interface ProposalMakerControllerRepository extends JpaRepository<Proposal, Long> { 
 
    Proposal findByProposalIdAndUserModified(Long proposalId, String userModified);
    
    Proposal save(Proposal proposal);
    
    void markProposalInactive(Long proposalId);
    
    void createCopyOfProposal(Long proposalId, String status);
    
    void maintainDocuments(Long proposalId);
    
    void sendResponse(Long proposalId, String status);
}