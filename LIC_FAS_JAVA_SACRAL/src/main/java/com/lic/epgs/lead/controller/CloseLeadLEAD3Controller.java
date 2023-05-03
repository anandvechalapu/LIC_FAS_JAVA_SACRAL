package com.lic.epgs.lead.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.lead.model.CloseLeadLEAD3;
import com.lic.epgs.lead.service.CloseLeadLEAD3Service;

@RestController
@RequestMapping("/lead")
public class CloseLeadLEAD3Controller {
    
    @Autowired
    private CloseLeadLEAD3Service closeLeadLEAD3Service;

    @GetMapping("/closelead3")
    public CloseLeadLEAD3 getCloseLeadLEAD3(@RequestParam Integer leadId, @RequestParam String modifiedBy, @RequestParam String leadStatus) {
        return closeLeadLEAD3Service.findByLeadIdAndModifiedByAndLeadStatus(leadId, modifiedBy, leadStatus);
    }
}