@Repository
public interface SendToMaker14CommissionRepository extends JpaRepository<Commission,Long> {
	
	@Modifying
	@Query("UPDATE Commission SET status = :status, workflowStatus = :workflowStatus, modifiedBy = :modifiedBy, modifiedOn = :modifiedOn WHERE commissionId = :commissionId and isActive = :isActive")
	public void sendToMakerForModification(@Param("commissionId") Long commissionId, @Param("status") String status, @Param("workflowStatus") String workflowStatus, @Param("modifiedBy") String modifiedBy, @Param("modifiedOn") Date modifiedOn, @Param("isActive") Boolean isActive);
	
	@Query("SELECT c FROM Commission c WHERE c.commissionId = :commissionId and c.isActive = :isActive")
	public Commission findCommissionById(@Param("commissionId") Long commissionId, @Param("isActive") Boolean isActive);
	
	@Modifying
	@Query("UPDATE Commission SET status = :status, modifiedBy = :modifiedBy, modifiedOn = :modifiedOn WHERE commissionId = :commissionId and isActive = :isActive")
	public void updateCommissionStatus(@Param("commissionId") Long commissionId, @Param("status") String status, @Param("modifiedBy") String modifiedBy, @Param("modifiedOn") Date modifiedOn, @Param("isActive") Boolean isActive);
	
	@Modifying
	@Query("UPDATE Commission SET workflowStatus = :workflowStatus, modifiedBy = :modifiedBy, modifiedOn = :modifiedOn WHERE commissionId = :commissionId and isActive = :isActive")
	public void updateCommissionWorkflowStatus(@Param("commissionId") Long commissionId, @Param("workflowStatus") String workflowStatus, @Param("modifiedBy") String modifiedBy, @Param("modifiedOn") Date modifiedOn, @Param("isActive") Boolean isActive);
	
}