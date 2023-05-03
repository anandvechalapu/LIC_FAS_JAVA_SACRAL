@Repository
public interface SendToCheckerLeadRepository extends JpaRepository<LeadBasicDetailsTempEntity, Long>{
	
	Optional<LeadBasicDetailsTempEntity> findByLeadId(Long leadId);
	
	@Transactional
	@Modifying
	@Query("update LeadBasicDetailsTempEntity set modifiedBy = :modifiedBy, leadStatus = :leadStatus, leadSubStatus = :leadSubStatus, workflowStatus = :workflowStatus, modifiedOn = null where leadId = :leadId")
	int updateLeadBasicDetailsTempEntity(Long leadId, String modifiedBy, String leadStatus, String leadSubStatus, String workflowStatus);
	
	@Transactional
	@Modifying
	@Query("update LeadProductDetailsTempEntity set leadId = :leadId, modifiedBy = :modifiedBy, createdBy = :createdBy, createdOn = :createdOn, modifiedOn = null where leadId = :leadId")
	int updateLeadProductDetailsTempEntity(Long leadId, String modifiedBy, String createdBy, Date createdOn);
	
	@Transactional
	@Modifying
	@Query("update LeadChannelDetailsTempEntity set leadId = :leadId, modifiedBy = :modifiedBy, createdBy = :createdBy, createdOn = :createdOn, modifiedOn = null where leadId = :leadId")
	int updateLeadChannelDetailsTempEntity(Long leadId, String modifiedBy, String createdBy, Date createdOn);
	
	@Transactional
	@Modifying
	@Query("update LeadNotesActiveTempEntity set leadId = :leadId, modifiedBy = :modifiedBy, createdBy = :createdBy, createdOn = :createdOn, modifiedOn = null where leadId = :leadId")
	int updateLeadNotesActiveTempEntity(Long leadId, String modifiedBy, String createdBy, Date createdOn);
	
	@Query("select l.leadId, l.leadNumber, tr.transactionStatus, tr.transactionMessage from LeadBasicDetailsTempEntity l join TransactionResponse tr on l.leadId = tr.leadId where l.leadId = :leadId")
	LeadResponse getLeadResponse(Long leadId);
	
}