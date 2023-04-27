package com.lic.epgs.stampduty.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StampDutyTempModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long stampId;
	
	private Long policyStampTypeId;
	
	private Long mstStampId;
	
	private String challanGrnNo;
	
	private String certificateQueryIdNo;

	public Long getStampId() {
		return stampId;
	}

	public void setStampId(Long stampId) {
		this.stampId = stampId;
	}

	public Long getPolicyStampTypeId() {
		return policyStampTypeId;
	}

	public void setPolicyStampTypeId(Long policyStampTypeId) {
		this.policyStampTypeId = policyStampTypeId;
	}

	public Long getMstStampId() {
		return mstStampId;
	}

	public void setMstStampId(Long mstStampId) {
		this.mstStampId = mstStampId;
	}

	public String getChallanGrnNo() {
		return challanGrnNo;
	}

	public void setChallanGrnNo(String challanGrnNo) {
		this.challanGrnNo = challanGrnNo;
	}

	public String getCertificateQueryIdNo() {
		return certificateQueryIdNo;
	}

	public void setCertificateQueryIdNo(String certificateQueryIdNo) {
		this.certificateQueryIdNo = certificateQueryIdNo;
	}
	
	
	
}