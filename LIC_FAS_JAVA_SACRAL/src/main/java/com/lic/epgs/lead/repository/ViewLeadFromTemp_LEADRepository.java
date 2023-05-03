import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lic.epgs.lead.repository.ViewLeadFromTemp_LEAD;

public interface ViewLeadFromTemp_LEADRepository extends JpaRepository<ViewLeadFromTemp_LEAD, Long> {

	@Query("SELECT l FROM ViewLeadFromTemp_LEAD l WHERE l.leadId = ?1")
	ViewLeadFromTemp_LEAD findByLeadId(Long leadId);

	@Query("SELECT l FROM ViewLeadFromTemp_LEAD l WHERE l.customerId = ?1")
	List<ViewLeadFromTemp_LEAD> findByCustomerId(Long customerId);

	@Query("SELECT l FROM ViewLeadFromTemp_LEAD l WHERE l.leadName = ?1")
	List<ViewLeadFromTemp_LEAD> findByLeadName(String leadName);

	@Query("SELECT l FROM ViewLeadFromTemp_LEAD l WHERE l.leadNumber = ?1")
	List<ViewLeadFromTemp_LEAD> findByLeadNumber(Long leadNumber);

	@Query("SELECT l FROM ViewLeadFromTemp_LEAD l WHERE l.leadStatus = ?1")
	List<ViewLeadFromTemp_LEAD> findByLeadStatus(String leadStatus);

	@Query("SELECT l FROM ViewLeadFromTemp_LEAD l WHERE l.leadSubStatus = ?1")
	List<ViewLeadFromTemp_LEAD> findByLeadSubStatus(String leadSubStatus);

	@Query("SELECT l FROM ViewLeadFromTemp_LEAD l WHERE l.workflowStatus = ?1")
	List<ViewLeadFromTemp_LEAD> findByWorkflowStatus(String workflowStatus);

	@Query("SELECT l FROM ViewLeadFromTemp_LEAD l WHERE l.industryType = ?1")
	List<ViewLeadFromTemp_LEAD> findByIndustryType(String industryType);

	@Query("SELECT l FROM ViewLeadFromTemp_LEAD l WHERE l.pAN = ?1")
	List<ViewLeadFromTemp_LEAD> findByPAN(String pAN);

	@Query("SELECT l FROM ViewLeadFromTemp_LEAD l WHERE l.createdOnDate = ?1")
	List<ViewLeadFromTemp_LEAD> findByCreatedOnDate(Long createdOnDate);

	@Query("SELECT l FROM ViewLeadFromTemp_LEAD l WHERE l.leadContactNumber = ?1")
	List<ViewLeadFromTemp_LEAD> findByLeadContactNumber(Long leadContactNumber);

	@Query("SELECT l FROM ViewLeadFromTemp_LEAD l WHERE l.emailId = ?1")
	List<ViewLeadFromTemp_LEAD> findByEmailId(String emailId);

	@Query("SELECT l FROM ViewLeadFromTemp_LEAD l WHERE l.leadExpiryDate = ?1")
	List<ViewLeadFromTemp_LEAD> findByLeadExpiryDate(Long leadExpiryDate);

	@Query("SELECT l FROM ViewLeadFromTemp_LEAD l WHERE l.channelInfo = ?1")
	List<ViewLeadFromTemp_LEAD> findByChannelInfo(String channelInfo);

	@Query("SELECT l FROM ViewLeadFromTemp_LEAD l WHERE l.productInfo = ?1")
	List<ViewLeadFromTemp_LEAD> findByProductInfo(String productInfo);

}