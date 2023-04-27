@Repository
public interface SendToChecker4GstExcemptionRepository extends JpaRepository<GstExcemption, Long> {
    
    @Modifying
    @Query("UPDATE GstExcemption g SET g.status = :status, g.workflowStatus = :workflowStatus WHERE g.id = :id")
    int updateGstExcemption(@Param("id") Long id, @Param("status")String status, @Param("workflowStatus")String workflowStatus);
    
    Optional<GstExcemption> findById(Long id);
}