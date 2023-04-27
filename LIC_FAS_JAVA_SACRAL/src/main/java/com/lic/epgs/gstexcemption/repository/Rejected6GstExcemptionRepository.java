@Repository
public interface Rejected6GstExcemptionRepository extends JpaRepository<GstExcemption, Long> {
 
    // Method to reject a GST exemption request
    @Modifying
    @Transactional
    @Query("UPDATE GstExcemption gstExcemption SET gstExcemption.gstExcemptionStatus = :gstExcemptionStatus,"
            + "gstExcemption.rejectionRemarks = :rejectionRemarks, gstExcemption.modifiedBy = :modifiedBy, "
            + "gstExcemption.workFlowStatus = :workFlowStatus WHERE gstExcemption.gstExcemptionId = :gstExcemptionId")
    public int rejectGstExcemption(@Param("gstExcemptionId") Long gstExcemptionId,
            @Param("gstExcemptionStatus") String gstExcemptionStatus,
            @Param("rejectionRemarks") String rejectionRemarks,
            @Param("modifiedBy") Long modifiedBy, @Param("workFlowStatus") String workFlowStatus);
 
    // Method to save a rejected request as a new entry in the GST Excemption Entity
    @Transactional
    public GstExcemption saveRejectedGstExcemption(GstExcemption gstExcemption);
 
    // Method to save all the related notes and documents as a new entry in the respective entity
    @Transactional
    public void saveRejectedNotesAndDocuments(GstExcemption gstExcemption);
 
    // Method to check if the gstExcemptionId exists
    public boolean existsByGstExcemptionId(Long gstExcemptionId);
}