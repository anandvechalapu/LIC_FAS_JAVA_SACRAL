@Repository
public interface ProposalLeadBasicDetailsLeadRepository {
	
	// Updates the basic details of a lead
	public Lead updateLead(Lead lead);
	
	// Accepts leadId, PAN, customerName, customerId, and customerCode as input parameters
	public Lead updateLead(Long leadId, String PAN, String customerName, Long customerId, String customerCode);
	
	// Returns the updated lead details such as leadId, leadName, lmsLeadNo, leadContactNo, PAN, emailId, customerId, customerCode, leadStatus, leadSubStatus, workflowStatus, unitCode, createdBy, createdOn, leadExpiryDate, and leadNumber
	public Lead getUpdatedLeadDetails(Lead lead);
	
	// Returns a successful response when the lead is updated
	public String updateLeadSuccessResponse(Lead lead);
	
	// Returns an error response when an invalid leadId is provided
	public String updateLeadErrorResponse(Long leadId);

}