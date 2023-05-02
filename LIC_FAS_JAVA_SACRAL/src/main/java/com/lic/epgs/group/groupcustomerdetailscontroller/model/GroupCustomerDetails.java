package com.lic.epgs.group.groupcustomerdetailscontroller.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GroupCustomerDetails")
public class GroupCustomerDetails {
	
	@Id
	private Long groupCustomerId;
	
	private String basicDetailsName;
	private String type;
	
	private String contactDetailsPrimaryContactName;
	private String contactDetailsPrimaryContactNumber;
	
	private String addressDetailsAddressLine;
	private String addressDetailsCity;
	
	private Long groupCustomerDetailsCustomerId;
	private String groupCustomerDetailsCustomerName;
	
	private String notes;
	
	private String bankAccountDetailsAccountNumber;
	private String bankAccountDetailsBankName;
	
	public Long getGroupCustomerId() {
		return groupCustomerId;
	}
	public void setGroupCustomerId(Long groupCustomerId) {
		this.groupCustomerId = groupCustomerId;
	}
	public String getBasicDetailsName() {
		return basicDetailsName;
	}
	public void setBasicDetailsName(String basicDetailsName) {
		this.basicDetailsName = basicDetailsName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getContactDetailsPrimaryContactName() {
		return contactDetailsPrimaryContactName;
	}
	public void setContactDetailsPrimaryContactName(String contactDetailsPrimaryContactName) {
		this.contactDetailsPrimaryContactName = contactDetailsPrimaryContactName;
	}
	public String getContactDetailsPrimaryContactNumber() {
		return contactDetailsPrimaryContactNumber;
	}
	public void setContactDetailsPrimaryContactNumber(String contactDetailsPrimaryContactNumber) {
		this.contactDetailsPrimaryContactNumber = contactDetailsPrimaryContactNumber;
	}
	public String getAddressDetailsAddressLine() {
		return addressDetailsAddressLine;
	}
	public void setAddressDetailsAddressLine(String addressDetailsAddressLine) {
		this.addressDetailsAddressLine = addressDetailsAddressLine;
	}
	public String getAddressDetailsCity() {
		return addressDetailsCity;
	}
	public void setAddressDetailsCity(String addressDetailsCity) {
		this.addressDetailsCity = addressDetailsCity;
	}
	public Long getGroupCustomerDetailsCustomerId() {
		return groupCustomerDetailsCustomerId;
	}
	public void setGroupCustomerDetailsCustomerId(Long groupCustomerDetailsCustomerId) {
		this.groupCustomerDetailsCustomerId = groupCustomerDetailsCustomerId;
	}
	public String getGroupCustomerDetailsCustomerName() {
		return groupCustomerDetailsCustomerName;
	}
	public void setGroupCustomerDetailsCustomerName(String groupCustomerDetailsCustomerName) {
		this.groupCustomerDetailsCustomerName = groupCustomerDetailsCustomerName;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getBankAccountDetailsAccountNumber() {
		return bankAccountDetailsAccountNumber;
	}
	public void setBankAccountDetailsAccountNumber(String bankAccountDetailsAccountNumber) {
		this.bankAccountDetailsAccountNumber = bankAccountDetailsAccountNumber;
	}
	public String getBankAccountDetailsBankName() {
		return bankAccountDetailsBankName;
	}
	public void setBankAccountDetailsBankName(String bankAccountDetailsBankName) {
		this.bankAccountDetailsBankName = bankAccountDetailsBankName;
	}
	
	
	

}