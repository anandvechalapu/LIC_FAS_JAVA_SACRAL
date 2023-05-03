package com.lic.epgs.lead.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.lead.model.Lead;
import com.lic.epgs.lead.repository.ActivateLead_LeadRepository;

@Service
public class ActivateLead_LeadService {
 
    @Autowired
    ActivateLead_LeadRepository activateLead_LeadRepository;
 
    public Lead getLeadById(Long leadId) {
        return activateLead_LeadRepository.findByLeadId(leadId);
    }
 
    public Lead saveLead(Lead lead) {
        return activateLead_LeadRepository.save(lead);
    }
 
    public Lead updateLeadById(Long leadId, String modifiedBy, String leadStatus) {
        return activateLead_LeadRepository.updateLeadById(leadId, modifiedBy, leadStatus);
    }
 
    public String getTransactionStatusAndMessage(Long leadId) {
        return activateLead_LeadRepository.getTransactionStatusAndMessage(leadId);
    }
}