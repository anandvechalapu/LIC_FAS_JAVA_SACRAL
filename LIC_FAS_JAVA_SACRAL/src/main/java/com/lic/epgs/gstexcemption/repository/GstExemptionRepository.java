The repository should be implemented to persist the data and retrieve the appropriate document details.

@Repository
public interface GstExemptionRepository extends JpaRepository<DocumentDetailsDto, Long> {
    // Get all documents for a given GST exemption
    List<DocumentDetailsDto> findByGstExemptionId(Long gstExemptionId);
    
    // Get a document for a given GST exemption and document ID
    Optional<DocumentDetailsDto> findByGstExemptionIdAndDocumentId(Long gstExemptionId, Long documentId);
    
    // Check if a GST exemption exists
    boolean existsByGstExemptionId(Long gstExemptionId);
    
    // Check if a document exists for a given GST exemption and document ID
    boolean existsByGstExemptionIdAndDocumentId(Long gstExemptionId, Long documentId);
    
    // Check if a document exists with the given document ID
    boolean existsByDocumentId(Long documentId);
    
    // Validate existingCondition1
    List<DocumentDetailsDto> findByGstExemptionIdAndExistingCondition1(Long gstExemptionId, boolean existingCondition1);
    
    // Validate existingCondition2
    List<DocumentDetailsDto> findByGstExemptionIdAndExistingCondition2(Long gstExemptionId, boolean existingCondition2);
}