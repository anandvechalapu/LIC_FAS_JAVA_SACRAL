package com.lic.epgs.trust.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BANK_ACCOUNT_DETAILS_TEMP")
public class BankAccountDetailsTempEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "ACCOUNT_NUMBER")
	private String accountNumber;
	
	@Column(name = "BANK_NAME")
	private String bankName;
	
	@Column(name = "IFSC_CODE")
	private String ifscCode;
	
	@Column(name = "IS_ACTIVE")
	private boolean isActive;
	
	public BankAccountDetailsTempEntity() {
		
	}
	
	public BankAccountDetailsTempEntity(String accountNumber, String bankName, String ifscCode, boolean isActive) {
		this.accountNumber = accountNumber;
		this.bankName = bankName;
		this.ifscCode = ifscCode;
		this.isActive = isActive;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public String getBankName() {
		return bankName;
	}
	
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public String getIfscCode() {
		return ifscCode;
	}
	
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	
	public boolean isActive() {
		return isActive;
	}
	
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	@Override
	public String toString() {
		return "BankAccountDetailsTempEntity [id=" + id + ", accountNumber=" + accountNumber + ", bankName=" + bankName
				+ ", ifscCode=" + ifscCode + ", isActive=" + isActive + "]";
	}
	
}