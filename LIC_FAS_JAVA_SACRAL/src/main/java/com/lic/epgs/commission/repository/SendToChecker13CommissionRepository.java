@Repository
public interface SendToChecker13CommissionRepository extends JpaRepository<Commission, Long> {
    
    @Transactional
    @Modifying
    @Query("UPDATE Commission c SET c.status = :status, c.workflowStatus = :workflowStatus, c.modifiedBy = :modifiedBy, c.modifiedOn = :modifiedOn WHERE c.id = :id")
    int sendToChecker(@Param("status") String status, @Param("workflowStatus") String workflowStatus, @Param("modifiedBy") String modifiedBy, @Param("modifiedOn") LocalDateTime modifiedOn, @Param("id") Long id);
    
}