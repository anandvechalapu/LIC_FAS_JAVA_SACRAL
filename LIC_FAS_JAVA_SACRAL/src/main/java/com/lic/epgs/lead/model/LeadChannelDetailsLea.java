package com.lic.epgs.lead.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Lead_Channel_Details_Lea")
public class LeadChannelDetailsLea {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String MOcode;
    private String MOname;
    private String intermediaryCode;
    private String intermediaryName;
    private String intermediaryContactNumber;
    private String intermediaryEmailAddress;
    private Boolean active;
    
    public LeadChannelDetailsLea() {}
    
    public LeadChannelDetailsLea(String MOcode, String MOname, String intermediaryCode, String intermediaryName,
                                 String intermediaryContactNumber, String intermediaryEmailAddress, Boolean active) {
        this.MOcode = MOcode;
        this.MOname = MOname;
        this.intermediaryCode = intermediaryCode;
        this.intermediaryName = intermediaryName;
        this.intermediaryContactNumber = intermediaryContactNumber;
        this.intermediaryEmailAddress = intermediaryEmailAddress;
        this.active = active;
    }
    
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getMOcode() {
        return MOcode;
    }
 
    public void setMOcode(String MOcode) {
        this.MOcode = MOcode;
    }
 
    public String getMOname() {
        return MOname;
    }
 
    public void setMOname(String MOname) {
        this.MOname = MOname;
    }
 
    public String getIntermediaryCode() {
        return intermediaryCode;
    }
 
    public void setIntermediaryCode(String intermediaryCode) {
        this.intermediaryCode = intermediaryCode;
    }
 
    public String getIntermediaryName() {
        return intermediaryName;
    }
 
    public void setIntermediaryName(String intermediaryName) {
        this.intermediaryName = intermediaryName;
    }
 
    public String getIntermediaryContactNumber() {
        return intermediaryContactNumber;
    }
 
    public void setIntermediaryContactNumber(String intermediaryContactNumber) {
        this.intermediaryContactNumber = intermediaryContactNumber;
    }
 
    public String getIntermediaryEmailAddress() {
        return intermediaryEmailAddress;
    }
 
    public void setIntermediaryEmailAddress(String intermediaryEmailAddress) {
        this.intermediaryEmailAddress = intermediaryEmailAddress;
    }
 
    public Boolean getActive() {
        return active;
    }
 
    public void setActive(Boolean active) {
        this.active = active;
    }
    
}