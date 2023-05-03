@Repository
public interface GetProductAndChannnelDetails_PROPOSALMAKERCONTROLLER9Repository extends JpaRepository<Lead, Long> {

    //Method to find product and channel details associated with a given Lead
    Lead findByLeadId(long leadId);
    
    //Method to save product and channel details associated with a given Lead
    Lead save(Lead lead);
    
    //Method to update product and channel details associated with a given Lead
    Lead update(Lead lead);
    
    //Method to delete product and channel details associated with a given Lead
    void deleteByLeadId(long leadId);
}