package com.lic.epgs.lead.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.lead.model.SaveLeadTransfer_LEAD19;
import com.lic.epgs.lead.service.SaveLeadTransfer_LEAD19Service;

@RestController
public class SaveLeadTransfer_LEAD19Controller {

    @Autowired
    private SaveLeadTransfer_LEAD19Service saveLeadTransfer_LEAD19Service;
    
    @GetMapping("/lead/transfer")
    public SaveLeadTransfer_LEAD19 getLead(@RequestParam("leadChannelId") String leadChannelId,
                                          @RequestParam("leadId") Long leadId,
                                          @RequestParam("unitOfficeId") Long unitOfficeId){
        return saveLeadTransfer_LEAD19Service.findByLeadChannelIdAndLeadIdAndUnitOfficeId(leadChannelId, leadId, unitOfficeId);
    }
}