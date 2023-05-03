import org.springframework.data.jpa.repository.JpaRepository;
import com.lic.epgs.proposal.proposalmakercontroller.dto.MPHContactPersonDetailsDto;

public interface ProposedContactDetailsRepository extends JpaRepository<MPHContactPersonDetailsDto, Long> { 
  
    List<MPHContactPersonDetailsDto> findByProposalIdAndContactPersonIdOrderByContactPersonIdDesc(Long proposalId, Long contactPersonId); 
  
    List<MPHContactPersonDetailsDto> findByProposalIdAndActiveOrderByContactPersonIdDesc(Long proposalId, Boolean active); 
  
}