package com.lic.epgs.lead.service;

import com.lic.epgs.lead.entity.LeadBasicDetailEntity;
import com.lic.epgs.lead.entity.LeadChannelDetailsEntity;
import com.lic.epgs.lead.entity.LeadNotesActiveEntity;
import com.lic.epgs.lead.entity.LeadProductDetailsEntity;
import com.lic.epgs.lead.repository.LeadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LeadService {

    @Autowired
    LeadRepository leadRepository;

    public LeadBasicDetailEntity saveLeadBasicDetail(String leadId, String modifiedBy, String leadStatus, String leadSubStatus, String workflowStatus) {
        return leadRepository.save(leadId, modifiedBy, leadStatus, leadSubStatus, workflowStatus);
    }

    public LeadProductDetailsEntity saveLeadProductDetails(String leadId, String productName, String productType) {
        return leadRepository.save(leadId, productName, productType);
    }

    public LeadChannelDetailsEntity saveLeadChannelDetails(String leadId, String channelName, String channelType) {
        return leadRepository.save(leadId, channelName, channelType);
    }

    public LeadNotesActiveEntity saveLeadNotesActive(String leadId, String note, String createdBy) {
        return leadRepository.save(leadId, note, createdBy);
    }

    public LeadBasicDetailEntity getLeadBasicDetail(String leadId) {
        return leadRepository.findByLeadId(leadId);
    }

    public LeadProductDetailsEntity getLeadProductDetails(String leadId, String productName, String productType) {
        return leadRepository.findByLeadIdAndProductNameAndProductType(leadId, productName, productType);
    }

    public LeadChannelDetailsEntity getLeadChannelDetails(String leadId, String channelName, String channelType) {
        return leadRepository.findByLeadIdAndChannelNameAndChannelType(leadId, channelName, channelType);
    }

    public LeadNotesActiveEntity getLeadNotesActive(String leadId, String note, String createdBy) {
        return leadRepository.findByLeadIdAndNoteAndCreatedBy(leadId, note, createdBy);
    }

    public void deleteLead(String leadId) {
        leadRepository.deleteByLeadId(leadId);
    }
}