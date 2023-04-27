package com.lic.epgs.stampduty.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CommonResponseStampDto {
    
    @Id
    private Long stampId;
    
    private String name;
    
    private String propertyType;
    
    private String ownershipType;
    
    private String transactionType;
    
    private String location;
    
    private String amount;
    
    // Getters and Setters
    
    public Long getStampId() {
        return stampId;
    }
    
    public void setStampId(Long stampId) {
        this.stampId = stampId;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getPropertyType() {
        return propertyType;
    }
    
    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }
    
    public String getOwnershipType() {
        return ownershipType;
    }
    
    public void setOwnershipType(String ownershipType) {
        this.ownershipType = ownershipType;
    }
    
    public String getTransactionType() {
        return transactionType;
    }
    
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }
    
    public String getLocation() {
        return location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    
    public String getAmount() {
        return amount;
    }
    
    public void setAmount(String amount) {
        this.amount = amount;
    }
}