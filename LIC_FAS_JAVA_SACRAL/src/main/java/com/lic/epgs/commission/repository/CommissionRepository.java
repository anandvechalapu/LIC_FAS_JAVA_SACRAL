@Repository
public interface CommissionRepository extends JpaRepository<Commission, Long> {

    @Query("SELECT c FROM Commission c WHERE c.commissionDetailsId= :commissionDetailsId")
    Optional<Commission> findByCommissionDetailsId(@Param("commissionDetailsId") Long commissionDetailsId);

    @Modifying
    @Query("UPDATE Commission c SET c.commissionStatus = 'draft', c.workflowStatus = 'draft' WHERE c.commissionId = :commissionId")
    int updateCommissionStatusAndWorkflowStatusByCommissionId(@Param("commissionId") Long commissionId);

    @Transactional
    @Modifying
    @Query("DELETE FROM Commission c WHERE c.commissionDetailsId is null")
    int deleteByCommissionDetailsIdIsNull();

    @Query("SELECT cd FROM CommissionDetails cd WHERE cd.commissionDetailsId= :commissionDetailsId")
    Optional<CommissionDetails> findCommissionDetailsByCommissionDetailsId(@Param("commissionDetailsId") Long commissionDetailsId);

    @Query("SELECT cdt FROM CommissionQuestionDetailsTemp cdt WHERE cdt.commissionDetailsId= :commissionDetailsId")
    List<CommissionQuestionDetailsTemp> findCommissionQuestionDetailsTempByCommissionDetailsId(@Param("commissionDetailsId") Long commissionDetailsId);

    @Query("SELECT cnt FROM CommissionNotesTemp cnt WHERE cnt.commissionDetailsId= :commissionDetailsId")
    List<CommissionNotesTemp> findCommissionNotesTempByCommissionDetailsId(@Param("commissionDetailsId") Long commissionDetailsId);
}