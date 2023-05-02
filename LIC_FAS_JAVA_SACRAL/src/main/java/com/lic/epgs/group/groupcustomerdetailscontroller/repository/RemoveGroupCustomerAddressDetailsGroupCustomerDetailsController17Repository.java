@Repository
public interface RemoveGroupCustomerAddressDetailsGroupCustomerDetailsController17Repository  {
   
    public ResponseEntity<?> removeGroupCustomerAddressDetails(String groupCustomerId, String addressId);
    
    public boolean validateGroupCustomerId(String groupCustomerId);
    
    public boolean validateAddressId(String addressId);
    
    public ResponseEntity<?> generateSuccessResponse();
    
    public ResponseEntity<?> generateFailureResponse();
    
    public ResponseEntity<?> handleExceptions(Exception e);
}