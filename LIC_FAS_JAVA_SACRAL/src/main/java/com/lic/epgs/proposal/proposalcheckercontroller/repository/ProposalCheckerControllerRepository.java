import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.lic.epgs.proposal.proposalcheckercontroller.dto.ProposalBasicDetailsDto;
import com.lic.epgs.proposal.proposalcheckercontroller.model.Proposal;

@Repository
public interface ProposalCheckerControllerRepository extends JpaRepository<Proposal, Long> {
    
    ProposalBasicDetailsDto sendToMaker(Proposal proposal);
    
    void markProposalAsInactive(Proposal proposal);
    
    void updateProposalStatusAndWorkflowStatus(Proposal proposal);
    
    Proposal copyExistingProposal(Proposal proposal);
    
    void updateMappedFilesForNewProposal(Proposal proposal);
    
    ProposalBasicDetailsDto getProposalBasicDetails(Proposal proposal);
    
    void returnErrorIfProposalIsInvalid(Proposal proposal);
}