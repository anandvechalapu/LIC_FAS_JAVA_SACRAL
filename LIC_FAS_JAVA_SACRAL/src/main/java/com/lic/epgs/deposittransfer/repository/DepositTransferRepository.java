@Repository
public interface DepositTransferRepository extends JpaRepository<DepositTransferTempEntity, Long> {

    ApiResponseDto saveDepositTransfer(DepositTransferDto depositTransferDto);

    @Modifying
    @Transactional
    @Query("update DepositTransferTempEntity d set d.isActive = false, d.referenceNumber = :referenceNumber where d.transferId = :transferId")
    void updateDepositTransferTempEntity(@Param("referenceNumber") String referenceNumber, @Param("transferId") String transferId);

    Optional<String> getDepositSeq();

    @Transactional
    @Modifying
    @Query("update DepositTransferTempEntity d set d.transferStatus = :transferStatus, d.workflowStatus = :workflowStatus where d.transferId = :transferId")
    void updateDepositTransferStatus(@Param("transferStatus") int transferStatus, @Param("workflowStatus") int workflowStatus, @Param("transferId") String transferId);

    @Transactional
    @Modifying
    void saveDepositTransferNotes(DepositTransferNotesTempEntity depositTransferNotesTempEntity);
}