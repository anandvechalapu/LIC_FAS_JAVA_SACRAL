package com.lic.epgs.lead.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.lead.model.Lead;
import com.lic.epgs.lead.service.SendToMaker_LEAD_Service;

@RestController
@RequestMapping("/api/leads")
public class SendToMaker_LEAD_Controller {

    private final SendToMaker_LEAD_Service sendToMaker_LEAD_Service;

    @Autowired
    public SendToMaker_LEAD_Controller(SendToMaker_LEAD_Service sendToMaker_LEAD_Service) {
        this.sendToMaker_LEAD_Service = sendToMaker_LEAD_Service;
    }

    @GetMapping("/{leadId}")
    public Lead findByLeadId(@PathVariable Long leadId) {
        return sendToMaker_LEAD_Service.findByLeadId(leadId);
    }

    @PostMapping
    public Lead save(@RequestBody Lead lead) {
        return sendToMaker_LEAD_Service.save(lead);
    }

    @PostMapping("/sendToMaker")
    public void sendToMaker(@RequestBody Lead lead) {
        sendToMaker_LEAD_Service.sendToMaker(lead);
    }

}