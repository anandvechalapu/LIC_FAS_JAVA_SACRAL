package com.lic.epgs.lead.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SaveLeadTransfer_LEAD19 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String leadChannelId;
    private Long leadId;
    private Long unitOfficeId;
    
    //getters and setters  
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getLeadChannelId() {
        return leadChannelId;
    }
    public void setLeadChannelId(String leadChannelId) {
        this.leadChannelId = leadChannelId;
    }
    public Long getLeadId() {
        return leadId;
    }
    public void setLeadId(Long leadId) {
        this.leadId = leadId;
    }
    public Long getUnitOfficeId() {
        return unitOfficeId;
    }
    public void setUnitOfficeId(Long unitOfficeId) {
        this.unitOfficeId = unitOfficeId;
    }
}