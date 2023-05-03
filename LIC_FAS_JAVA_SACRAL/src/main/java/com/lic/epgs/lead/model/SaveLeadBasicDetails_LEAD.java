package com.lic.epgs.lead.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SaveLeadBasicDetails_LEAD {
    
    @Id
    private Long leadId;
    private String leadName;
    private String lmsLeadNo;
    private String leadContactNo;
    private String pan;
    private String emailId;
    private String leadStatus;
    private String leadSubStatus;
    private String workflowStatus;
    private String createdBy;
    private String createdOn;
    private String leadExpiryDate;
    private String customerId;
    private String customerCode;
    private String unitCode;
    private String leadNumber;

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

    public String getLmsLeadNo() {
        return lmsLeadNo;
    }

    public void setLmsLeadNo(String lmsLeadNo) {
        this.lmsLeadNo = lmsLeadNo;
    }

    public String getLeadContactNo() {
        return leadContactNo;
    }

    public void setLeadContactNo(String leadContactNo) {
        this.leadContactNo = leadContactNo;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getLeadStatus() {
        return leadStatus;
    }

    public void setLeadStatus(String leadStatus) {
        this.leadStatus = leadStatus;
    }

    public String getLeadSubStatus() {
        return leadSubStatus;
    }

    public void setLeadSubStatus(String leadSubStatus) {
        this.leadSubStatus = leadSubStatus;
    }

    public String getWorkflowStatus() {
        return workflowStatus;
    }

    public void setWorkflowStatus(String workflowStatus) {
        this.workflowStatus = workflowStatus;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public String getLeadExpiryDate() {
        return leadExpiryDate;
    }

    public void setLeadExpiryDate(String leadExpiryDate) {
        this.leadExpiryDate = leadExpiryDate;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public String getLeadNumber() {
        return leadNumber;
    }

    public void setLeadNumber(String leadNumber) {
        this.leadNumber = leadNumber;
    }
}