package com.lic.epgs.proposal.proposalmakercontroller.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProposalOverallDetailsDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long proposalId;
    private String proposalName;
    private String proposalDescription;
    private String proposalStatus;
    private Boolean isActive;
 
    public Long getProposalId() {
        return proposalId;
    }
 
    public void setProposalId(Long proposalId) {
        this.proposalId = proposalId;
    }
 
    public String getProposalName() {
        return proposalName;
    }
 
    public void setProposalName(String proposalName) {
        this.proposalName = proposalName;
    }
 
    public String getProposalDescription() {
        return proposalDescription;
    }
 
    public void setProposalDescription(String proposalDescription) {
        this.proposalDescription = proposalDescription;
    }
 
    public String getProposalStatus() {
        return proposalStatus;
    }
 
    public void setProposalStatus(String proposalStatus) {
        this.proposalStatus = proposalStatus;
    }
 
    public Boolean getIsActive() {
        return isActive;
    }
 
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }
}