package com.lic.epgs.lead.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Lead {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long leadId;
	private String leadName;
	private String lmsLeadNo;
	private String leadContactNo;
	private String PAN;
	private String emailId;
	private Long customerId;
	private String customerCode;
	private String leadStatus;
	private String leadSubStatus;
	private String workflowStatus;
	private String unitCode;
	private String createdBy;
	private Date createdOn;
	private Date leadExpiryDate;
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

	public String getPAN() {
		return PAN;
	}

	public void setPAN(String pAN) {
		PAN = pAN;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
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

	public String getUnitCode() {
		return unitCode;
	}

	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Date getLeadExpiryDate() {
		return leadExpiryDate;
	}

	public void setLeadExpiryDate(Date leadExpiryDate) {
		this.leadExpiryDate = leadExpiryDate;
	}

	public String getLeadNumber() {
		return leadNumber;
	}

	public void setLeadNumber(String leadNumber) {
		this.leadNumber = leadNumber;
	}

}