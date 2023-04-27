package com.lic.epgs.stampduty.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "StampDuty")
public class StampDutyEntity {
    @Id
    private Long id;
    @OneToMany
    private List<StampDutyConsumerUnit> consumerUnits;
    @OneToMany
    private List<StampDutyNote> notes;
    private String noteContent;
    private String createdBy;
    private String modifiedBy;
    private Date createdOn;
    private Date modifiedOn;
    private Boolean active;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public List<StampDutyConsumerUnit> getConsumerUnits() {
        return consumerUnits;
    }
    
    public void setConsumerUnits(List<StampDutyConsumerUnit> consumerUnits) {
        this.consumerUnits = consumerUnits;
    }
    
    public List<StampDutyNote> getNotes() {
        return notes;
    }
    
    public void setNotes(List<StampDutyNote> notes) {
        this.notes = notes;
    }
    
    public String getNoteContent() {
        return noteContent;
    }
    
    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }
    
    public String getCreatedBy() {
        return createdBy;
    }
    
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    
    public String getModifiedBy() {
        return modifiedBy;
    }
    
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }
    
    public Date getCreatedOn() {
        return createdOn;
    }
    
    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
    
    public Date getModifiedOn() {
        return modifiedOn;
    }
    
    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }
    
    public Boolean getActive() {
        return active;
    }
    
    public void setActive(Boolean active) {
        this.active = active;
    }
}