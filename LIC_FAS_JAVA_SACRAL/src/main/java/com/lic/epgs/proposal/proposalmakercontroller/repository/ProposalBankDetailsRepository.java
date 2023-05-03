@Repository
public interface ProposalBankDetailsRepository extends JpaRepository<ProposalBankDetails, Long> {
 
    void deleteByProposalId(Long proposalId);
 
    List<ProposalBankDetails> findByProposalId(Long proposalId);
 
    List<ProposalBankDetails> findByContactPersonId(Long contactPersonId);
 
    Optional<ProposalBankDetails> findByUniqueId(String uniqueId);
 
    void deleteByUniqueId(String uniqueId);
}