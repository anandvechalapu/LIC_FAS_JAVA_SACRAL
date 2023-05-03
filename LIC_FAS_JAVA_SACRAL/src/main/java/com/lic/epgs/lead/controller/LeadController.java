//Generated Spring boot Controller class

package com.lic.epgs.lead.controller;

import com.lic.epgs.lead.entity.LeadBasicDetailEntity;
import com.lic.epgs.lead.entity.LeadChannelDetailsEntity;
import com.lic.epgs.lead.entity.LeadNotesActiveEntity;
import com.lic.epgs.lead.entity.LeadProductDetailsEntity;
import com.lic.epgs.lead.model.LeadBasicDetailModel;
import com.lic.epgs.lead.service.LeadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/leads")
public class LeadController {

    @Autowired
    LeadService leadService;

    @PostMapping("/basic")
    public LeadBasicDetailEntity saveLeadBasicDetail(@RequestBody LeadBasicDetailModel leadBasicDetailModel) {
        return leadService.saveLeadBasicDetail(leadBasicDetailModel.getLeadId(), leadBasicDetailModel.getModifiedBy(), leadBasicDetailModel.getLeadStatus(), leadBasicDetailModel.getLeadSubStatus(), leadBasicDetailModel.getWorkflowStatus());
    }

    @PostMapping("/products")
    public LeadProductDetailsEntity saveLeadProductDetails(String leadId, String productName, String productType) {
        return leadService.saveLeadProductDetails(leadId, productName, productType);
    }

    @PostMapping("/channels")
    public LeadChannelDetailsEntity saveLeadChannelDetails(String leadId, String channelName, String channelType) {
        return leadService.saveLeadChannelDetails(leadId, channelName, channelType);
    }

    @PostMapping("/notes")
    public LeadNotesActiveEntity saveLeadNotesActive(String leadId, String note, String createdBy) {
        return leadService.saveLeadNotesActive(leadId, note, createdBy);
    }

    @GetMapping("/{leadId}")
    public LeadBasicDetailEntity getLeadBasicDetail(@PathVariable("leadId") String leadId) {
        return leadService.getLeadBasicDetail(leadId);
    }

    @GetMapping("/products/{leadId}")
    public LeadProductDetailsEntity getLeadProductDetails(@PathVariable("leadId") String leadId, String productName, String productType) {
        return leadService.getLeadProductDetails(leadId, productName, productType);
    }

    @GetMapping("/channels/{leadId}")
    public LeadChannelDetailsEntity getLeadChannelDetails(@PathVariable("leadId") String leadId, String channelName, String channelType) {
        return leadService.getLeadChannelDetails(leadId, channelName, channelType);
    }

    @GetMapping("/notes/{leadId}")
    public LeadNotesActiveEntity getLeadNotesActive(@PathVariable("leadId") String leadId, String note, String createdBy) {
        return leadService.getLeadNotesActive(leadId, note, createdBy);
    }

    @DeleteMapping("/{leadId}")
    public void deleteLead(@PathVariable("leadId") String leadId) {
        leadService.deleteLead(leadId);
    }
}