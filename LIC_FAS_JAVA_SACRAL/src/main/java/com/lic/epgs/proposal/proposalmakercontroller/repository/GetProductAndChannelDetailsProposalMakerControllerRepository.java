@Repository
public interface GetProductAndChannelDetailsProposalMakerControllerRepository extends CrudRepository<Lead, Long> {
 
    List<Lead> findByLeadId(Long leadId);
 
    Lead save(Lead lead);
 
    List<Lead> findAll();
 
    void deleteById(Long leadId);
 
    Optional<Lead> findById(Long leadId);
 
}