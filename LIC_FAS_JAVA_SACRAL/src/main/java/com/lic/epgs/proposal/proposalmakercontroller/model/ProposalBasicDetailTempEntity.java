package com.lic.epgs.proposal.proposalmakercontroller.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "proposal_basic_details_temp")
public class ProposalBasicDetailTempEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long proposalId;

    @Column(name = "proposal_number")
    private String proposalNumber;

    @Column(name = "proposal_date")
    private String proposalDate;

    @Column(name = "customer_id")
    private long customerId;

    @Column(name = "is_active")
    private boolean isActive;

    public long getProposalId() {
        return proposalId;
    }

    public void setProposalId(long proposalId) {
        this.proposalId = proposalId;
    }

    public String getProposalNumber() {
        return proposalNumber;
    }

    public void setProposalNumber(String proposalNumber) {
        this.proposalNumber = proposalNumber;
    }

    public String getProposalDate() {
        return proposalDate;
    }

    public void setProposalDate(String proposalDate) {
        this.proposalDate = proposalDate;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
}