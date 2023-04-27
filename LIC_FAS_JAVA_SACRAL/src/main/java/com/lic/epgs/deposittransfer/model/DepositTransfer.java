package com.lic.epgs.deposittransfer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "deposit_transfer")
public class DepositTransfer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "transfer_id")
	private Long transferId;
	
	@Column(name = "from_cust_id")
	private Long fromCustId;
	
	@Column(name = "to_cust_id")
	private Long toCustId;
	
	@Column(name = "transfer_amount")
	private Long transferAmount;
	
	@Column(name = "transfer_status")
	private String transferStatus;
	
	@Column(name = "work_flow_status")
	private String workFlowStatus;
	
	@Column(name = "is_active")
	private Boolean isActive;

	public Long getTransferId() {
		return transferId;
	}

	public void setTransferId(Long transferId) {
		this.transferId = transferId;
	}

	public Long getFromCustId() {
		return fromCustId;
	}

	public void setFromCustId(Long fromCustId) {
		this.fromCustId = fromCustId;
	}

	public Long getToCustId() {
		return toCustId;
	}

	public void setToCustId(Long toCustId) {
		this.toCustId = toCustId;
	}

	public Long getTransferAmount() {
		return transferAmount;
	}

	public void setTransferAmount(Long transferAmount) {
		this.transferAmount = transferAmount;
	}

	public String getTransferStatus() {
		return transferStatus;
	}

	public void setTransferStatus(String transferStatus) {
		this.transferStatus = transferStatus;
	}

	public String getWorkFlowStatus() {
		return workFlowStatus;
	}

	public void setWorkFlowStatus(String workFlowStatus) {
		this.workFlowStatus = workFlowStatus;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	
	

}