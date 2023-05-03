package com.lic.epgs.lead.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.lead.repository.RejectLead;
import com.lic.epgs.lead.repository.RejectLeadRepository;

@Service
public class RejectLeadService {

    @Autowired
    RejectLeadRepository rejectLeadRepository;

    public RejectLead getLeadById(Long leadId) {
        return rejectLeadRepository.findByLeadId(leadId);
    }

    public void saveLead(RejectLead rejectLead) {
        rejectLeadRepository.saveRejectLead(rejectLead);
    }

    public void updateLeadBasicDetails(RejectLead rejectLead) {
        rejectLeadRepository.updateLeadBasicDetails(rejectLead);
    }

    public void updateLeadProductDetails(RejectLead rejectLead) {
        rejectLeadRepository.updateLeadProductDetails(rejectLead);
    }

    public void updateLeadChannelDetails(RejectLead rejectLead) {
        rejectLeadRepository.updateLeadChannelDetails(rejectLead);
    }

    public void updateLeadNotesEntities(RejectLead rejectLead) {
        rejectLeadRepository.updateLeadNotesEntities(rejectLead);
    }
}