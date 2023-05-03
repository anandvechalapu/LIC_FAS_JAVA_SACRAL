@Repository
package com.lic.epgs.lead.repository;

import com.lic.epgs.lead.entity.LeadBasicDetailEntity;
import com.lic.epgs.lead.entity.LeadChannelDetailsEntity;
import com.lic.epgs.lead.entity.LeadNotesActiveEntity;
import com.lic.epgs.lead.entity.LeadProductDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeadRepository extends JpaRepository<LeadBasicDetailEntity, String> {

    LeadBasicDetailEntity save(String leadId, String modifiedBy, String leadStatus, String leadSubStatus, String workflowStatus);

    LeadProductDetailsEntity save(String leadId, String productName, String productType);

    LeadChannelDetailsEntity save(String leadId, String channelName, String channelType);

    LeadNotesActiveEntity save(String leadId, String note, String createdBy);

    LeadBasicDetailEntity findByLeadId(String leadId);

    LeadProductDetailsEntity findByLeadIdAndProductNameAndProductType(String leadId, String productName, String productType);

    LeadChannelDetailsEntity findByLeadIdAndChannelNameAndChannelType(String leadId, String channelName, String channelType);

    LeadNotesActiveEntity findByLeadIdAndNoteAndCreatedBy(String leadId, String note, String createdBy);

    void deleteByLeadId(String leadId);
}