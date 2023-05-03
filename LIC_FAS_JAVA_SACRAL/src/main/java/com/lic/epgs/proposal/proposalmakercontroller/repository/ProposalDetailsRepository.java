import org.springframework.data.jpa.repository.JpaRepository;

import com.lic.epgs.proposal.proposalmakercontroller.model.ProposalDetails;

public interface ProposalDetailsRepository extends JpaRepository<ProposalDetails, Long> {
    
    List<ProposalDetails> getExistingProposalDetailsList(String role, String unitCode);
    
}