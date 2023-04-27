package com.lic.epgs.deposittransfer.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="deposit_transfer_notes")
public class DepositTransferNotes {
    
    @Id
    @GeneratedValue
    private Long id;
    
    private String transferId;
    private String fromAccount;
    private String toAccount;
    private String transferAmount;
    private String transactionType;
    private String transferReason;
    private LocalDateTime createdOn;
    private boolean isActive;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTransferId() {
        return transferId;
    }
    public void setTransferId(String transferId) {
        this.transferId = transferId;
    }
    public String getFromAccount() {
        return fromAccount;
    }
    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }
    public String getToAccount() {
        return toAccount;
    }
    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }
    public String getTransferAmount() {
        return transferAmount;
    }
    public void setTransferAmount(String transferAmount) {
        this.transferAmount = transferAmount;
    }
    public String getTransactionType() {
        return transactionType;
    }
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }
    public String getTransferReason() {
        return transferReason;
    }
    public void setTransferReason(String transferReason) {
        this.transferReason = transferReason;
    }
    public LocalDateTime getCreatedOn() {
        return createdOn;
    }
    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }
    public boolean isActive() {
        return isActive;
    }
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
    
    
}