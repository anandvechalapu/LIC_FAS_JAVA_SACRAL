package com.lic.epgs.commission.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="commission_notes_11_commissions")
public class CommissionNotes11Commission {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long commissionId;
    
    private String commissionNotes;
    
    private boolean active;
    
    private LocalDateTime createdDate;
    
    private Long createdUser;
    
    private LocalDateTime modifiedDate;
    
    private Long modifiedUser;
    
    public Long getCommissionId() {
        return commissionId;
    }
    
    public void setCommissionId(Long commissionId) {
        this.commissionId = commissionId;
    }
    
    public String getCommissionNotes() {
        return commissionNotes;
    }
    
    public void setCommissionNotes(String commissionNotes) {
        this.commissionNotes = commissionNotes;
    }
    
    public boolean isActive() {
        return active;
    }
    
    public void setActive(boolean active) {
        this.active = active;
    }
    
    public LocalDateTime getCreatedDate() {
        return createdDate;
    }
    
    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }
    
    public Long getCreatedUser() {
        return createdUser;
    }
    
    public void setCreatedUser(Long createdUser) {
        this.createdUser = createdUser;
    }
    
    public LocalDateTime getModifiedDate() {
        return modifiedDate;
    }
    
    public void setModifiedDate(LocalDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
    
    public Long getModifiedUser() {
        return modifiedUser;
    }
    
    public void setModifiedUser(Long modifiedUser) {
        this.modifiedUser = modifiedUser;
    }
}