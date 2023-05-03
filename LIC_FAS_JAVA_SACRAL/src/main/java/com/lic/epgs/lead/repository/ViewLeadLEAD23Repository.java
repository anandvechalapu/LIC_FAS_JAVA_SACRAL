import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.lead.dto.CommonLeadDto;

@Repository
public interface ViewLeadLEAD23Repository extends JpaRepository<CommonLeadDto, Long> {

    CommonLeadDto findByLeadId(Long leadId);
    
    CommonLeadDto findByCustomerId(Long customerId);
    
    CommonLeadDto findByLmsLeadNumber(Long lmsLeadNumber);
    
    CommonLeadDto findByLeadName(String leadName);
    
    CommonLeadDto findByLeadNumber(Long leadNumber);
    
    CommonLeadDto findByLeadStatus(String leadStatus);
    
    CommonLeadDto findByLeadSubStatus(String leadSubStatus);
    
    CommonLeadDto findByWorkflowStatus(String workflowStatus);
    
    CommonLeadDto findByIndustryType(String industryType);
    
    CommonLeadDto findByPan(String pan);
    
    CommonLeadDto findByCreationDate(String creationDate);
    
    CommonLeadDto findByLeadContactNumber(String leadContactNumber);
    
    CommonLeadDto findByEmailId(String emailId);
    
    CommonLeadDto findByRejectionRemarks(String rejectionRemarks);
    
    CommonLeadDto findByProductIds(Long productIds);
    
    CommonLeadDto findByProductDescriptions(String productDescriptions);
    
    CommonLeadDto findByProductAmounts(Long productAmounts);
    
    CommonLeadDto findByChannelIds(Long channelIds);
    
    CommonLeadDto findByChannelDescriptions(String channelDescriptions);
    
    CommonLeadDto findByChannelAmounts(Long channelAmounts);
    
    CommonLeadDto findByActivityIds(Long activityIds);
    
    CommonLeadDto findByActivityDescriptions(String activityDescriptions);
    
    CommonLeadDto findByActivityAmounts(Long activityAmounts);
    
    CommonLeadDto findByTransactionStatus(String transactionStatus);
    
    CommonLeadDto findByTransactionMessage(String transactionMessage);
    
}