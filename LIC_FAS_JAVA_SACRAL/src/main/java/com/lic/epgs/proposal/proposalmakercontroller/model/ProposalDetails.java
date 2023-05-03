package com.lic.epgs.proposal.proposalmakercontroller.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProposalDetails {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String proposalNumber;
  private String customerName;
  private String channelType;
  private String address;
  private String contactNumber;
  private String bankDetails;
  private String status;
  private String message;

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

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public String getChannelType() {
    return channelType;
  }

  public void setChannelType(String channelType) {
    this.channelType = channelType;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getContactNumber() {
    return contactNumber;
  }

  public void setContactNumber(String contactNumber) {
    this.contactNumber = contactNumber;
  }

  public String getBankDetails() {
    return bankDetails;
  }

  public void setBankDetails(String bankDetails) {
    this.bankDetails = bankDetails;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

}