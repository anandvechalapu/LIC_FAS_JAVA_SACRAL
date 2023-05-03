package com.lic.epgs.lead.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.lead.model.EditExistingLeadDetails_LEAD;
import com.lic.epgs.lead.service.EditExistingLeadDetails_LEADService;

@RestController
@RequestMapping("/lead")
public class EditExistingLeadDetails_LEADController {

    @Autowired
    private EditExistingLeadDetails_LEADService service;

    @GetMapping("/details")
    public EditExistingLeadDetails_LEAD fetchLeadDetails(long leadId) {
        return service.fetchLeadDetails(leadId);
    }

    @PutMapping("/update")
    public EditExistingLeadDetails_LEAD updateLeadDetails(@RequestBody EditExistingLeadDetails_LEAD lead) {
        return service.updateLeadDetails(lead);
    }

    @GetMapping("/generateId")
    public Long generateLeadId() {
        return service.generateLeadId();
    }

    @PutMapping("/saveProductDetails")
    public EditExistingLeadDetails_LEAD saveProductDetails(@RequestBody EditExistingLeadDetails_LEAD lead) {
        return service.saveProductDetails(lead);
    }

    @PutMapping("/saveChannelDetails")
    public EditExistingLeadDetails_LEAD saveChannelDetails(@RequestBody EditExistingLeadDetails_LEAD lead) {
        return service.saveChannelDetails(lead);
    }

    @PutMapping("/saveNotes")
    public EditExistingLeadDetails_LEAD saveNotes(@RequestBody EditExistingLeadDetails_LEAD lead) {
        return service.saveNotes(lead);
    }

    @PutMapping("/logError")
    public void logError(String message) {
        service.logError(message);
    }

}