@Repository
public interface ApprovedLead2Repository extends JpaRepository<ApprovedLead2, Long> {
 
    ApprovedLead2 findByLeadId(Long leadId);
    
    List<ApprovedLead2> findAllByModifiedBy(String modifiedBy);
    
    List<ApprovedLead2> findAllByLeadStatus(String leadStatus);
    
    List<ApprovedLead2> findAllByLeadSubStatus(String leadSubStatus);
    
    List<ApprovedLead2> findAllByWorkflowStatus(String workflowStatus);
    
    @Modifying
    @Transactional
    @Query("update ApprovedLead2 set leadStatus=:leadStatus, leadSubStatus=:leadSubStatus, workflowStatus=:workflowStatus where leadId=:leadId")
    void updateApprovedLead2(@Param("leadId") Long leadId, @Param("leadStatus") String leadStatus, @Param("leadSubStatus") String leadSubStatus, @Param("workflowStatus") String workflowStatus);
    
}