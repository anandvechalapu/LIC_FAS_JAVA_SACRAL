@Repository
public interface RemoveDocumentCustomerMakerControllerRepository {
 
    ResponseEntity<?> removeDocument(Long documentId, Long customerId);

}