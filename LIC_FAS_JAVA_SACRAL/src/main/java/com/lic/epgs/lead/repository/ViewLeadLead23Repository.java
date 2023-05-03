@Repository
public interface ViewLeadLead23Repository {
    
    /**
     * Retrieves the lead's basic details from the database.
     *
     * @return a CommonLeadDto containing the lead's basic details
     */
    CommonLeadDto getLeadBasicDetails();
    
    /**
     * Retrieves the product details from the database.
     *
     * @return a List of ProductDetailsDto containing the product details
     */
    List<ProductDetailsDto> getProductDetails();
    
    /**
     * Retrieves the channel details from the database.
     *
     * @return a List of ChannelDetailsDto containing the channel details
     */
    List<ChannelDetailsDto> getChannelDetails();
    
    /**
     * Retrieves the activities from the database.
     *
     * @return a List of ActivityDetailsDto containing the activities
     */
    List<ActivityDetailsDto> getActivityDetails();
    
    /**
     * Updates the lead's rejection remarks in the database.
     *
     * @param remarks the rejection remarks
     * @return true if the update is successful, false otherwise
     */
    boolean updateRejectionRemarks(String remarks);
}