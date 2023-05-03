@Repository
public interface ProposalCommonSearchForAnnuityRepository extends JpaRepository<ProposalCommonSearchForAnnuity, Long> {
    
    @Query("SELECT leadNumber, proposalNumber, proposalDate, proposalStatus, subStatus, proposalId, proposerName, unitCode FROM ProposalCommonSearchForAnnuity WHERE unitCode = :unitCode AND pageCount = :pageCount AND limit = :limit AND active = true ORDER BY modifiedDate DESC")
    List<ProposalCommonSearchForAnnuity> getAnnuityProposals(String unitCode, Integer pageCount, Integer limit);
}