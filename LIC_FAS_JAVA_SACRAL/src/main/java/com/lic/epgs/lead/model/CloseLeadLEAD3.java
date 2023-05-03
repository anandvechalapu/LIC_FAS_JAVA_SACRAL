package com.lic.epgs.lead.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CloseLeadLEAD3 {
    
    @Id
    private Integer leadId;
    private String modifiedBy;
    private String leadStatus;
    
    public CloseLeadLEAD3() {
        
    }

    public Integer getLeadId() {
        return leadId;
    }

    public void setLeadId(Integer leadId) {
        this.leadId = leadId;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public String getLeadStatus() {
        return leadStatus;
    }

    public void setLeadStatus(String leadStatus) {
        this.leadStatus = leadStatus;
    }
    
}