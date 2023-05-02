package com.lic.epgs.group.groupcustomerdetailscontroller.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GroupCustomerBankAccountDetails {

	@Id
	private Long groupCustomerId;
	
	private String bankAccountDetails;

	public Long getGroupCustomerId() {
		return groupCustomerId;
	}

	public void setGroupCustomerId(Long groupCustomerId) {
		this.groupCustomerId = groupCustomerId;
	}

	public String getBankAccountDetails() {
		return bankAccountDetails;
	}

	public void setBankAccountDetails(String bankAccountDetails) {
		this.bankAccountDetails = bankAccountDetails;
	}
	
	
	
}