package com.lic.epgs.lead.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lic.epgs.lead.repository.SaveLeadTransfer_LEAD19Repository;
import com.lic.epgs.lead.model.SaveLeadTransfer_LEAD19;

@Service
public class SaveLeadTransfer_LEAD19Service {

    @Autowired
    private SaveLeadTransfer_LEAD19Repository saveLeadTransfer_LEAD19Repository;

    public SaveLeadTransfer_LEAD19 findByLeadChannelIdAndLeadIdAndUnitOfficeId(String leadChannelId, Long leadId, Long unitOfficeId) {
        return saveLeadTransfer_LEAD19Repository.findByLeadChannelIdAndLeadIdAndUnitOfficeId(leadChannelId, leadId, unitOfficeId);
    }

    public SaveLeadTransfer_LEAD19 save(SaveLeadTransfer_LEAD19 saveLeadTransfer_LEAD19) {
        return saveLeadTransfer_LEAD19Repository.save(saveLeadTransfer_LEAD19);
    }
}