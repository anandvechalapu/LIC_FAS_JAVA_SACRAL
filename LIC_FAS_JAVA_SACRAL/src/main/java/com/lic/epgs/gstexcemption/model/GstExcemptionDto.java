package com.lic.epgs.gstexcemption.model;

public class GstExcemptionDto {
	
	private String transactionMessage;
	private String transactionStatus;
	
	public String getTransactionMessage() {
		return transactionMessage;
	}
	
	public void setTransactionMessage(String transactionMessage) {
		this.transactionMessage = transactionMessage;
	}
	
	public String getTransactionStatus() {
		return transactionStatus;
	}
	
	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}
}