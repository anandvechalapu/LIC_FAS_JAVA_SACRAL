package com.lic.epgs.lead.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.lead.model.RejectLead;
import com.lic.epgs.lead.service.RejectLeadService;

@RestController
@RequestMapping("/lead")
public class RejectLeadController {

    @Autowired
    RejectLeadService rejectLeadService;

    @GetMapping("/{leadId}")
    public RejectLead getLeadById(@PathVariable Long leadId) {
        return rejectLeadService.getLeadById(leadId);
    }

    @PostMapping
    public void saveLead(@RequestBody RejectLead rejectLead) {
        rejectLeadService.saveLead(rejectLead);
    }

    @PutMapping("/basic-details")
    public void updateLeadBasicDetails(@RequestBody RejectLead rejectLead) {
        rejectLeadService.updateLeadBasicDetails(rejectLead);
    }

    @PutMapping("/product-details")
    public void updateLeadProductDetails(@RequestBody RejectLead rejectLead) {
        rejectLeadService.updateLeadProductDetails(rejectLead);
    }

    @PutMapping("/channel-details")
    public void updateLeadChannelDetails(@RequestBody RejectLead rejectLead) {
        rejectLeadService.updateLeadChannelDetails(rejectLead);
    }

    @PutMapping("/notes-entities")
    public void updateLeadNotesEntities(@RequestBody RejectLead rejectLead) {
        rejectLeadService.updateLeadNotesEntities(rejectLead);
    }
}