package com.lic.epgs.trust.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BankAccountDetailsDto {
    
    @Id
    private int trustId;
    private String accountNumber;
    private String ifscCode;
    private String bankName;
    private String branchName;

    public int getTrustId() {
        return trustId;
    }

    public void setTrustId(int trustId) {
        this.trustId = trustId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }
}