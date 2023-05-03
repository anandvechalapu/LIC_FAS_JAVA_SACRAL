@Repository
public interface ProductAndChannelDetailsRepository extends CrudRepository<ProductAndChannelDetails, Long> {

    // Method to get all product and channel details associated with a lead
    List<ProductAndChannelDetails> findByLeadId(long leadId);

    // Method to get a product and channel detail associated with a lead
    ProductAndChannelDetails findByLeadIdAndProductIdAndChannelId(long leadId, long productId, long channelId);

}