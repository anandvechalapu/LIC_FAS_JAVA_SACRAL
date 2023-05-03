package com.lic.epgs.proposal.proposalmakercontroller.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class ProposalBankDetails {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
    private Long proposalId;
    private Long contactPersonId;
    private String uniqueId;
    private String bankName;
    private String bankAccountName;
    private String bankAccountNumber;
    private String iban;
    private String swift;
    private String ifsc;
 
    public ProposalBankDetails() {
    }
 
    public ProposalBankDetails(Long proposalId, Long contactPersonId, String uniqueId, String bankName,
                               String bankAccountName, String bankAccountNumber, String iban, String swift, String ifsc) {
        this.proposalId = proposalId;
        this.contactPersonId = contactPersonId;
        this.uniqueId = uniqueId;
        this.bankName = bankName;
        this.bankAccountName = bankAccountName;
        this.bankAccountNumber = bankAccountNumber;
        this.iban = iban;
        this.swift = swift;
        this.ifsc = ifsc;
    }
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public Long getProposalId() {
        return proposalId;
    }
 
    public void setProposalId(Long proposalId) {
        this.proposalId = proposalId;
    }
 
    public Long getContactPersonId() {
        return contactPersonId;
    }
 
    public void setContactPersonId(Long contactPersonId) {
        this.contactPersonId = contactPersonId;
    }
 
    public String getUniqueId() {
        return uniqueId;
    }
 
    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }
 
    public String getBankName() {
        return bankName;
    }
 
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
 
    public String getBankAccountName() {
        return bankAccountName;
    }
 
    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName;
    }
 
    public String getBankAccountNumber() {
        return bankAccountNumber;
    }
 
    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }
 
    public String getIban() {
        return iban;
    }
 
    public void setIban(String iban) {
        this.iban = iban;
    }
 
    public String getSwift() {
        return swift;
    }
 
    public void setSwift(String swift) {
        this.swift = swift;
    }
 
    public String getIfsc() {
        return ifsc;
    }
 
    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }
}