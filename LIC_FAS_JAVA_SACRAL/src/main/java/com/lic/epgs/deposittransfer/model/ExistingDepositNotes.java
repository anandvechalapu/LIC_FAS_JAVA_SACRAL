package com.lic.epgs.deposittransfer.model;

import javax.persistence.*;

@Entity
@Table(name = "existing_deposit_notes")
public class ExistingDepositNotes {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "existing_deposit_notes_id")
    private Long existingDepositNotesId;
    
    @Column(name = "transfer_id")
    private String transferId;
    
    @Column(name = "is_active")
    private Boolean isActive;
    
    public ExistingDepositNotes() {
    }
    
    public Long getExistingDepositNotesId() {
        return existingDepositNotesId;
    }
    
    public void setExistingDepositNotesId(Long existingDepositNotesId) {
        this.existingDepositNotesId = existingDepositNotesId;
    }
    
    public String getTransferId() {
        return transferId;
    }
    
    public void setTransferId(String transferId) {
        this.transferId = transferId;
    }
    
    public Boolean getIsActive() {
        return isActive;
    }
    
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }
}