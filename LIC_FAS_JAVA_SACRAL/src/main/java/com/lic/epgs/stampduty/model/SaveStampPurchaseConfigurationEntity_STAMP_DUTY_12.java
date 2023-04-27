package com.lic.epgs.stampduty.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SaveStampPurchaseConfigurationEntity_STAMP_DUTY_12 {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String purchaserUnitCode;
	private Long policyStampTypeId;
	private String alertTriggerMobile;
	private String alertTriggerEmail;
	private String consumerUnits;
	private String activeStatus;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPurchaserUnitCode() {
		return purchaserUnitCode;
	}
	public void setPurchaserUnitCode(String purchaserUnitCode) {
		this.purchaserUnitCode = purchaserUnitCode;
	}
	public Long getPolicyStampTypeId() {
		return policyStampTypeId;
	}
	public void setPolicyStampTypeId(Long policyStampTypeId) {
		this.policyStampTypeId = policyStampTypeId;
	}
	public String getAlertTriggerMobile() {
		return alertTriggerMobile;
	}
	public void setAlertTriggerMobile(String alertTriggerMobile) {
		this.alertTriggerMobile = alertTriggerMobile;
	}
	public String getAlertTriggerEmail() {
		return alertTriggerEmail;
	}
	public void setAlertTriggerEmail(String alertTriggerEmail) {
		this.alertTriggerEmail = alertTriggerEmail;
	}
	public String getConsumerUnits() {
		return consumerUnits;
	}
	public void setConsumerUnits(String consumerUnits) {
		this.consumerUnits = consumerUnits;
	}
	public String getActiveStatus() {
		return activeStatus;
	}
	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}
	
	
	
}