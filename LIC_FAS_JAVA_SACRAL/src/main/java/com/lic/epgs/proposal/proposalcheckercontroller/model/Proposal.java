package com.lic.epgs.proposal.proposalcheckercontroller.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Proposal {

    @Id
    private Long proposalId;
    private String proposalName;
    private String proposalDescription;
    private boolean isApproved;
    private String modifiedBy;

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
    public boolean isApproved() {
        return isApproved;
    }
    public void setApproved(boolean isApproved) {
        this.isApproved = isApproved;
    }
    public String getModifiedBy() {
        return modifiedBy;
    }
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }
    
}