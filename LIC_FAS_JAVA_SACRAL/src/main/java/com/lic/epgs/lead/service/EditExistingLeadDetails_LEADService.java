package com.lic.epgs.lead.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.lead.model.EditExistingLeadDetails_LEAD;
import com.lic.epgs.lead.repository.EditExistingLeadDetails_LEADRepository;

@Service
public class EditExistingLeadDetails_LEADService {

    @Autowired
    private EditExistingLeadDetails_LEADRepository repository;

    // Fetch existing lead details
    public EditExistingLeadDetails_LEAD fetchLeadDetails(long leadId) {
        return repository.findByLeadId(leadId);
    }

    // Update existing lead details in the database
    public EditExistingLeadDetails_LEAD updateLeadDetails(EditExistingLeadDetails_LEAD lead) {
        return repository.save(lead);
    }

    // Generate a lead ID for updated lead details
    public Long generateLeadId() {
        return repository.generateLeadId();
    }

    // Save updated lead's product details in the database
    public EditExistingLeadDetails_LEAD saveProductDetails(EditExistingLeadDetails_LEAD lead) {
        return repository.saveProductDetails(lead);
    }

    // Save updated lead's channel details in the database
    public EditExistingLeadDetails_LEAD saveChannelDetails(EditExistingLeadDetails_LEAD lead) {
        return repository.saveChannelDetails(lead);
    }

    // Save updated lead's notes in the database
    public EditExistingLeadDetails_LEAD saveNotes(EditExistingLeadDetails_LEAD lead) {
        return repository.saveNotes(lead);
    }

    // Log any errors encountered during the process
    public void logError(String message) {
        repository.logError(message);
    }

}