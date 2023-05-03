package com.lic.epgs.lead.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.lead.repository.CloseLeadLEAD3Repository;
import com.lic.epgs.lead.model.CloseLeadLEAD3;

@Service
public class CloseLeadLEAD3Service {

    @Autowired
    private CloseLeadLEAD3Repository closeLeadLEAD3Repository;

    public CloseLeadLEAD3 findByLeadIdAndModifiedByAndLeadStatus(Integer leadId, String modifiedBy, String leadStatus) {
        return closeLeadLEAD3Repository.findByLeadIdAndModifiedByAndLeadStatus(leadId, modifiedBy, leadStatus);
    }

    public CloseLeadLEAD3 save(CloseLeadLEAD3 closeLeadLEAD3) {
        return closeLeadLEAD3Repository.save(closeLeadLEAD3);
    }
}