package com.lic.epgs.proposal.proposalmakercontroller.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProposalDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String proposalNumber;
    private String intermediaryCode;
    private String proposalDetails;
    
    // Getters and Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getProposalNumber() {
        return proposalNumber;
    }
    public void setProposalNumber(String proposalNumber) {
        this.proposalNumber = proposalNumber;
    }
    
    public String getIntermediaryCode() {
        return intermediaryCode;
    }
    public void setIntermediaryCode(String intermediaryCode) {
        this.intermediaryCode = intermediaryCode;
    }
    
    public String getProposalDetails() {
        return proposalDetails;
    }
    public void setProposalDetails(String proposalDetails) {
        this.proposalDetails = proposalDetails;
    }
}