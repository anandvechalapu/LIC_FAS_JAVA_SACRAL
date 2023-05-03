package com.lic.epgs.lead.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lead")
public class Lead {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long leadId;
 
    private String leadName;
 
    private String leadStatus;
 
    private String modifiedBy;
 
    private String transactionStatus;
 
    private String transactionMessage;
 
    public Lead() {
    }
 
    public Lead(Long leadId, String leadName, String leadStatus, String modifiedBy, String transactionStatus,
                String transactionMessage) {
        this.leadId = leadId;
        this.leadName = leadName;
        this.leadStatus = leadStatus;
        this.modifiedBy = modifiedBy;
        this.transactionStatus = transactionStatus;
        this.transactionMessage = transactionMessage;
    }
 
    public Long getLeadId() {
        return leadId;
    }
 
    public void setLeadId(Long leadId) {
        this.leadId = leadId;
    }
 
    public String getLeadName() {
        return leadName;
    }
 
    public void setLeadName(String leadName) {
        this.leadName = leadName;
    }
 
    public String getLeadStatus() {
        return leadStatus;
    }
 
    public void setLeadStatus(String leadStatus) {
        this.leadStatus = leadStatus;
    }
 
    public String getModifiedBy() {
        return modifiedBy;
    }
 
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }
 
    public String getTransactionStatus() {
        return transactionStatus;
    }
 
    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }
 
    public String getTransactionMessage() {
        return transactionMessage;
    }
 
    public void setTransactionMessage(String transactionMessage) {
        this.transactionMessage = transactionMessage;
    }
}