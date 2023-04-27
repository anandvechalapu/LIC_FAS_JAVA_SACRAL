@Service
public class GstExemptionService {
    
    private GstExemptionRepository gstExemptionRepository;
 
    @Autowired
    public GstExemptionService(GstExemptionRepository gstExemptionRepository) {
        this.gstExemptionRepository = gstExemptionRepository;
    }
    
    // Get all documents for a given GST exemption
    public List<DocumentDetailsDto> getDocumentsByGstExemptionId(Long gstExemptionId) {
        return gstExemptionRepository.findByGstExemptionId(gstExemptionId);
    }
    
    // Get a document for a given GST exemption and document ID
    public Optional<DocumentDetailsDto> getDocumentByGstExemptionIdAndDocumentId(Long gstExemptionId, Long documentId) {
        return gstExemptionRepository.findByGstExemptionIdAndDocumentId(gstExemptionId, documentId);
    }
    
    // Check if a GST exemption exists
    public boolean isGstExemptionExists(Long gstExemptionId) {
        return gstExemptionRepository.existsByGstExemptionId(gstExemptionId);
    }
    
    // Check if a document exists for a given GST exemption and document ID
    public boolean isDocumentExistsForGstExemptionIdAndDocumentId(Long gstExemptionId, Long documentId) {
        return gstExemptionRepository.existsByGstExemptionIdAndDocumentId(gstExemptionId, documentId);
    }
    
    // Check if a document exists with the given document ID
    public boolean isDocumentExistsByDocumentId(Long documentId) {
        return gstExemptionRepository.existsByDocumentId(documentId);
    }
    
    // Validate existingCondition1
    public List<DocumentDetailsDto> validateExistingCondition1(Long gstExemptionId, boolean existingCondition1) {
        return gstExemptionRepository.findByGstExemptionIdAndExistingCondition1(gstExemptionId, existingCondition1);
    }
    
    // Validate existingCondition2
    public List<DocumentDetailsDto> validateExistingCondition2(Long gstExemptionId, boolean existingCondition2) {
        return gstExemptionRepository.findByGstExemptionIdAndExistingCondition2(gstExemptionId, existingCondition2);
    }
}