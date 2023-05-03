import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.proposal.proposalcheckercontroller.dto.ProposalBasicDetailsDto;
import com.lic.epgs.proposal.proposalcheckercontroller.dto.ProposalCommonSearchDto;

@Repository
public interface ExistingProposalCommonSearchRepository extends JpaRepository<ProposalBasicDetailsDto, Long> {
 
    List<ProposalBasicDetailsDto> searchExistingProposal(ProposalCommonSearchDto searchDto);

}