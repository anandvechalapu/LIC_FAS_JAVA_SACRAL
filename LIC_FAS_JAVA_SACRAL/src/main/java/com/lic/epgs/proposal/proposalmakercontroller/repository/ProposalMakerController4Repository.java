@Repository
public interface ProposalMakerController4Repository extends JpaRepository<ProposalOverallDetailsDto, Long>{
 
    Optional<ProposalOverallDetailsDto> findByProposalId(Long proposalId);
    
    ProposalOverallDetailsDto save(ProposalOverallDetailsDto proposalOverallDetailsDto);
 
    void deleteByProposalId(Long proposalId);
    
    List<ProposalOverallDetailsDto> findAll();
}