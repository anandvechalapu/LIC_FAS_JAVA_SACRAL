import org.springframework.data.jpa.repository.JpaRepository;

import com.lic.epgs.proposal.proposalmakercontroller.model.ProductAndChannelDetails;

public interface ProductAndChannelDetailsRepository extends JpaRepository<ProductAndChannelDetails, Long> {

	public ProductAndChannelDetails getProductAndChannelDetailsByLeadId(Long leadId);
	
	public List<ProductAndChannelDetails> getProductAndChannelDetailsByLeadIds(List<Long> leadIds);
	
	public List<ProductAndChannelDetails> findAllByLeadId(Long leadId);
}