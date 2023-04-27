@Service
public class SendToChecker4GstExcemptionService {
    
    private SendToChecker4GstExcemptionRepository sendToChecker4GstExcemptionRepository;
    
    public SendToChecker4GstExcemptionService(SendToChecker4GstExcemptionRepository sendToChecker4GstExcemptionRepository) {
        this.sendToChecker4GstExcemptionRepository = sendToChecker4GstExcemptionRepository;
    }
    
    public int updateGstExcemption(Long id, String status, String workflowStatus) {
        return sendToChecker4GstExcemptionRepository.updateGstExcemption(id, status, workflowStatus);
    }
    
    public Optional<GstExcemption> findById(Long id) {
        return sendToChecker4GstExcemptionRepository.findById(id);
    }
}