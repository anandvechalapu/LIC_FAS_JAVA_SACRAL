@Repository
public interface ApproveStampDutyRepository {
    
    /**
     * Post mapping request body for submitting stamp duty request details
     * @param requestDetails
     */
    @PostMapping
    void submitStampDutyRequest(RequestDetails requestDetails);
    
    /**
     * Validate stamp duty request ID
     * @param requestId
     * @return true/false
     */
    boolean validateStampDutyRequestID(String requestId);
    
    /**
     * Update stamp duty status, workflow status, and modified by details
     * @param status
     * @param workflowStatus
     * @param modifiedBy
     */
    void updateStampDutyStatus(String status, String workflowStatus, String modifiedBy);
    
    /**
     * Copy stamp duty details from temporary table to stamp duty table
     */
    void copyStampDutyDetails();
    
    /**
     * Create and save list of stamp duty consumer units
     * @param stampDutyConsumerUnits
     */
    void saveStampDutyConsumerUnits(List<StampDutyConsumerUnit> stampDutyConsumerUnits);
    
    /**
     * Generate response with updated stamp duty details
     * @return response
     */
    Response generateResponse();
    
    /**
     * Generate response message and transaction status
     * @param message
     * @param status
     */
    void generateResponseMessageAndTransactionStatus(String message, String status);
    
    /**
     * Log all errors
     * @param error
     */
    void logError(String error);
}