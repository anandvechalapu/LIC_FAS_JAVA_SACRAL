package com.lic.epgs.stampduty.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stamp_duty_consumption")
public class StampDutyConsumptionRequest {
	
	@Id
	private String consumerUnitCode;
	private int stampAmount;
	private int balance;
	
	public String getConsumerUnitCode() {
		return consumerUnitCode;
	}
	
	public void setConsumerUnitCode(String consumerUnitCode) {
		this.consumerUnitCode = consumerUnitCode;
	}
	
	public int getStampAmount() {
		return stampAmount;
	}
	
	public void setStampAmount(int stampAmount) {
		this.stampAmount = stampAmount;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}

}