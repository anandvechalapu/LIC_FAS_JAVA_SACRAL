import org.springframework.data.jpa.repository.JpaRepository;

import com.lic.epgs.trust.model.Trust;

public interface SendForApprovalTrustRepository extends JpaRepository<Trust,Long> {
	
	Trust findByTrustId(Long trustId);
	
	Trust save(Trust trust);
	
	void removeByTrustId(Long trustId);
	
	void updateTrustStatus(Long trustId, String status);
	
	void sendTrustToApprover(Long trustId);
	
	void saveTrustDetails(Long trustId, String bankAccountDetails, String contactDetails, String addressDetails, String trustNotes);
	
}