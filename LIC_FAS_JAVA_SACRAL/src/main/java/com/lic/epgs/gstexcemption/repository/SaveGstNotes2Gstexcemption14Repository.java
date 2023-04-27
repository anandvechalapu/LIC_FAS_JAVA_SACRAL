@Repository
public interface SaveGstNotes2Gstexcemption14Repository extends JpaRepository<SaveGstNotes2Gstexcemption14, Long> {
    Optional<SaveGstNotes2Gstexcemption14> findByGstExemptionIdAndIsActiveTrue(String gstExemptionId);
    SaveGstNotes2Gstexcemption14 save(SaveGstNotes2Gstexcemption14 saveGstNotes2Gstexcemption14);
    void deleteByGstExemptionId(String gstExemptionId);
}