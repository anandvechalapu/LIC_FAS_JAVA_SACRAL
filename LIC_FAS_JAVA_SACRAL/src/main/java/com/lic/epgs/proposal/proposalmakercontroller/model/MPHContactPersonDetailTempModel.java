package com.lic.epgs.proposal.proposalmakercontroller.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MPHContactPersonDetailTempModel {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long contactPersonId;
    private Long proposalId;
    private String contactPersonName;
    private String contactPersonEmail;
    private String contactPersonPhone;
    private String contactPersonRole;
    private String contactPersonAddress;

    public Long getContactPersonId() {
        return contactPersonId;
    }

    public void setContactPersonId(Long contactPersonId) {
        this.contactPersonId = contactPersonId;
    }

    public Long getProposalId() {
        return proposalId;
    }

    public void setProposalId(Long proposalId) {
        this.proposalId = proposalId;
    }

    public String getContactPersonName() {
        return contactPersonName;
    }

    public void setContactPersonName(String contactPersonName) {
        this.contactPersonName = contactPersonName;
    }

    public String getContactPersonEmail() {
        return contactPersonEmail;
    }

    public void setContactPersonEmail(String contactPersonEmail) {
        this.contactPersonEmail = contactPersonEmail;
    }

    public String getContactPersonPhone() {
        return contactPersonPhone;
    }

    public void setContactPersonPhone(String contactPersonPhone) {
        this.contactPersonPhone = contactPersonPhone;
    }

    public String getContactPersonRole() {
        return contactPersonRole;
    }

    public void setContactPersonRole(String contactPersonRole) {
        this.contactPersonRole = contactPersonRole;
    }

    public String getContactPersonAddress() {
        return contactPersonAddress;
    }

    public void setContactPersonAddress(String contactPersonAddress) {
        this.contactPersonAddress = contactPersonAddress;
    }

}