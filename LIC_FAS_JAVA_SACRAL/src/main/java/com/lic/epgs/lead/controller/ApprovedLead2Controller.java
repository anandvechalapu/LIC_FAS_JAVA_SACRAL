package com.lic.epgs.lead.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.lead.model.ApprovedLead2;
import com.lic.epgs.lead.service.ApprovedLead2Service;

@RestController
public class ApprovedLead2Controller {

	@Autowired
    ApprovedLead2Service approvedLead2Service;
	
	@GetMapping("/approved-lead2/{leadId}")
    public ApprovedLead2 findByLeadId(@PathVariable Long leadId) {
        return approvedLead2Service.findByLeadId(leadId);
    }
    
    @GetMapping("/approved-lead2/modifiedBy")
    public List<ApprovedLead2> findAllByModifiedBy(@RequestParam String modifiedBy) {
        return approvedLead2Service.findAllByModifiedBy(modifiedBy);
    }
    
    @GetMapping("/approved-lead2/leadStatus")
    public List<ApprovedLead2> findAllByLeadStatus(@RequestParam String leadStatus) {
        return approvedLead2Service.findAllByLeadStatus(leadStatus);
    }
    
    @GetMapping("/approved-lead2/leadSubStatus")
    public List<ApprovedLead2> findAllByLeadSubStatus(@RequestParam String leadSubStatus) {
        return approvedLead2Service.findAllByLeadSubStatus(leadSubStatus);
    }
    
    @GetMapping("/approved-lead2/workflowStatus")
    public List<ApprovedLead2> findAllByWorkflowStatus(@RequestParam String workflowStatus) {
        return approvedLead2Service.findAllByWorkflowStatus(workflowStatus);
    }
    
    @PutMapping("/approved-lead2/update")
    public void updateApprovedLead2(@RequestParam Long leadId,
    								@RequestParam String leadStatus,
    								@RequestParam String leadSubStatus,
    								@RequestParam String workflowStatus) {
        approvedLead2Service.updateApprovedLead2(leadId, leadStatus, leadSubStatus, workflowStatus);
    }
    
}