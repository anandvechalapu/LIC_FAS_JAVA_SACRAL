package com.lic.epgs.group.groupcustomerdetailscontroller.model;

public class GroupCustomerBank {
    private String groupCustomerId;
    private String bankAccountId;

    public GroupCustomerBank(){

    }

    public GroupCustomerBank(String groupCustomerId, String bankAccountId){
        this.groupCustomerId = groupCustomerId;
        this.bankAccountId = bankAccountId;
    }

    public String getGroupCustomerId() {
        return groupCustomerId;
    }

    public void setGroupCustomerId(String groupCustomerId) {
        this.groupCustomerId = groupCustomerId;
    }

    public String getBankAccountId() {
        return bankAccountId;
    }

    public void setBankAccountId(String bankAccountId) {
        this.bankAccountId = bankAccountId;
    }
}