package com.lic.epgs.proposal.proposalcheckercontroller.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PROPOSAL")
public class Proposal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Long id;
    
    @Column(name="PROPOSAL_ID")
    private String proposalId;
    
    @Column(name="STATUS")
    private String status;
    
    @Column(name="WORKFLOW_STATUS")
    private String workflowStatus;
    
    @Column(name="CREATED_DATE")
    private Date createdDate;
    
    @Column(name="UPDATED_DATE")
    private Date updatedDate;
    
    @Column(name="IS_ACTIVE")
    private boolean isActive;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getProposalId() {
        return proposalId;
    }
    
    public void setProposalId(String proposalId) {
        this.proposalId = proposalId;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getWorkflowStatus() {
        return workflowStatus;
    }
    
    public void setWorkflowStatus(String workflowStatus) {
        this.workflowStatus = workflowStatus;
    }
    
    public Date getCreatedDate() {
        return createdDate;
    }
    
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    
    public Date getUpdatedDate() {
        return updatedDate;
    }
    
    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
    
    public boolean isActive() {
        return isActive;
    }
    
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
}