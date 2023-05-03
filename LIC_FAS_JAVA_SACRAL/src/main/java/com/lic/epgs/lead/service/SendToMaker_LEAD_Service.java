package com.lic.epgs.lead.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.lead.model.Lead;
import com.lic.epgs.lead.repository.SendToMaker_LEAD_Repository;

@Service
public class SendToMaker_LEAD_Service {

    private final SendToMaker_LEAD_Repository sendToMaker_LEAD_Repository;

    @Autowired
    public SendToMaker_LEAD_Service(SendToMaker_LEAD_Repository sendToMaker_LEAD_Repository) {
        this.sendToMaker_LEAD_Repository = sendToMaker_LEAD_Repository;
    }

    public Lead findByLeadId(Long leadId) {
        return sendToMaker_LEAD_Repository.findByLeadId(leadId);
    }

    public Lead save(Lead lead) {
        return sendToMaker_LEAD_Repository.save(lead);
    }

    public void sendToMaker(Lead lead) {
        sendToMaker_LEAD_Repository.sendToMaker(lead);
    }

}