package com.lic.epgs.lead.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ViewLeadFromTemp_LEAD {

	@Id
	private Long leadId;
	private Long customerId;
	private String leadName;
	private Long leadNumber;
	private String leadStatus;
	private String leadSubStatus;
	private String workflowStatus;
	private String industryType;
	private String pAN;
	private Long createdOnDate;
	private Long leadContactNumber;
	private String emailId;
	private Long leadExpiryDate;
	private String channelInfo;
	private String productInfo;

	public Long getLeadId() {
		return leadId;
	}

	public void setLeadId(Long leadId) {
		this.leadId = leadId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getLeadName() {
		return leadName;
	}

	public void setLeadName(String leadName) {
		this.leadName = leadName;
	}

	public Long getLeadNumber() {
		return leadNumber;
	}

	public void setLeadNumber(Long leadNumber) {
		this.leadNumber = leadNumber;
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

	public String getIndustryType() {
		return industryType;
	}

	public void setIndustryType(String industryType) {
		this.industryType = industryType;
	}

	public String getpAN() {
		return pAN;
	}

	public void setpAN(String pAN) {
		this.pAN = pAN;
	}

	public Long getCreatedOnDate() {
		return createdOnDate;
	}

	public void setCreatedOnDate(Long createdOnDate) {
		this.createdOnDate = createdOnDate;
	}

	public Long getLeadContactNumber() {
		return leadContactNumber;
	}

	public void setLeadContactNumber(Long leadContactNumber) {
		this.leadContactNumber = leadContactNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Long getLeadExpiryDate() {
		return leadExpiryDate;
	}

	public void setLeadExpiryDate(Long leadExpiryDate) {
		this.leadExpiryDate = leadExpiryDate;
	}

	public String getChannelInfo() {
		return channelInfo;
	}

	public void setChannelInfo(String channelInfo) {
		this.channelInfo = channelInfo;
	}

	public String getProductInfo() {
		return productInfo;
	}

	public void setProductInfo(String productInfo) {
		this.productInfo = productInfo;
	}

}