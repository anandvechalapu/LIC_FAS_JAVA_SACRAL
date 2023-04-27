package com.lic.epgs.deposittransfer.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DepositTransfer {
	
	@Id
	private Long transferId;
	private String sourceAccount;
	private String destinationAccount;
	private Double amount;
	private String status;
	private String notes;
	
	public Long getTransferId() {
		return transferId;
	}
	
	public void setTransferId(Long transferId) {
		this.transferId = transferId;
	}
	
	public String getSourceAccount() {
		return sourceAccount;
	}
	
	public void setSourceAccount(String sourceAccount) {
		this.sourceAccount = sourceAccount;
	}
	
	public String getDestinationAccount() {
		return destinationAccount;
	}
	
	public void setDestinationAccount(String destinationAccount) {
		this.destinationAccount = destinationAccount;
	}
	
	public Double getAmount() {
		return amount;
	}
	
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getNotes() {
		return notes;
	}
	
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
}