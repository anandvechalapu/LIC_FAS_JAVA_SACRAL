@Repository
public interface GetAllExitingCustomerDetailsCustomerCheckerControllerRepository {

    // Retrieves all details of an existing customer by customer ID
    Optional<CustomerDetails> getAllExitingCustomerDetails(Integer customerID);

    // Returns an error message if the customer ID is invalid or inactive
    Optional<String> getInvalidInactiveCustomerErrorMessage(Integer customerID);

    // Returns basic details, unit office details, bank account details, contact details, address details, document details, trust details (if any), group customer details (if any) and customer notes (if any)
    Optional<CustomerDetails> getCustomerDetails(Integer customerID);

    // Returns success or failure status along with a message indicating the result of the operation
    Optional<String> getResultStatusMessage(Integer customerID);

}