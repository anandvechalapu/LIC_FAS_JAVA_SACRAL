@Repository
public interface CustomerCheckerControllerRepository {
 
    public ResponseEntity<?> getMasterCustomerDetails(Long customerId) throws Exception;
}