@Service
public class Rejected6GstExcemptionService {

    @Autowired
    private Rejected6GstExcemptionRepository rejected6GstExcemptionRepository;

    // Method to reject a GST exemption request
    public int rejectGstExcemption(Long gstExcemptionId, String gstExcemptionStatus, String rejectionRemarks, Long modifiedBy, String workFlowStatus) {
        return rejected6GstExcemptionRepository.rejectGstExcemption(gstExcemptionId, gstExcemptionStatus, rejectionRemarks, modifiedBy, workFlowStatus);
    }

    // Method to save a rejected request as a new entry in the GST Excemption Entity
    public GstExcemption saveRejectedGstExcemption(GstExcemption gstExcemption) {
        return rejected6GstExcemptionRepository.saveRejectedGstExcemption(gstExcemption);
    }

    // Method to save all the related notes and documents as a new entry in the respective entity
    public void saveRejectedNotesAndDocuments(GstExcemption gstExcemption) {
        rejected6GstExcemptionRepository.saveRejectedNotesAndDocuments(gstExcemption);
    }

    // Method to check if the gstExcemptionId exists
    public boolean existsByGstExcemptionId(Long gstExcemptionId) {
        return rejected6GstExcemptionRepository.existsByGstExcemptionId(gstExcemptionId);
    }
}