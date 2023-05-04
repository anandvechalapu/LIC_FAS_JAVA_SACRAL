package com.lic.epgs.trust.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TrustData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String bankAccountDetails;
	private String contactDetails;
	private String addressDetails;
	private String documentDetails;
	private Boolean inactiveStatus;
	private Boolean pendingForModification;
	private String modifiedByUser;
	private String modifiedOnDate;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBankAccountDetails() {
		return bankAccountDetails;
	}
	public void setBankAccountDetails(String bankAccountDetails) {
		this.bankAccountDetails = bankAccountDetails;
	}
	public String getContactDetails() {
		return contactDetails;
	}
	public void setContactDetails(String contactDetails) {
		this.contactDetails = contactDetails;
	}
	public String getAddressDetails() {
		return addressDetails;
	}
	public void setAddressDetails(String addressDetails) {
		this.addressDetails = addressDetails;
	}
	public String getDocumentDetails() {
		return documentDetails;
	}
	public void setDocumentDetails(String documentDetails) {
		this.documentDetails = documentDetails;
	}
	public Boolean getInactiveStatus() {
		return inactiveStatus;
	}
	public void setInactiveStatus(Boolean inactiveStatus) {
		this.inactiveStatus = inactiveStatus;
	}
	public Boolean getPendingForModification() {
		return pendingForModification;
	}
	public void setPendingForModification(Boolean pendingForModification) {
		this.pendingForModification = pendingForModification;
	}
	public String getModifiedByUser() {
		return modifiedByUser;
	}
	public void setModifiedByUser(String modifiedByUser) {
		this.modifiedByUser = modifiedByUser;
	}
	public String getModifiedOnDate() {
		return modifiedOnDate;
	}
	public void setModifiedOnDate(String modifiedOnDate) {
		this.modifiedOnDate = modifiedOnDate;
	}

}