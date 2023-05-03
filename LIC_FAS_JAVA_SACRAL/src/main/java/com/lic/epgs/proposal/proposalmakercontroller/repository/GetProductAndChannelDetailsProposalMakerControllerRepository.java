@Repository
public interface GetProductAndChannelDetailsProposalMakerControllerRepository {
 
    /**
     * Retrieve the product and channel details associated with a given lead 
     * from the database and return them in an organized manner.
     * 
     * @param leadId the id of the lead to retrieve product and channel details for
     * @return the product and channel details associated with the lead
     * @throws Exception if an error or exception occurs during the retrieval process
     */
    public List<ProductAndChannelDetails> getProductAndChannelDetails(String leadId) throws Exception;
}