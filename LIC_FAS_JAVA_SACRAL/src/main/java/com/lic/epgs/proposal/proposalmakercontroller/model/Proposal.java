package com.lic.epgs.proposal.proposalmakercontroller.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Proposal {
  @Id
  private int proposalNumber;
  private String proposalName;
  private String proposalDescription;
  private String proposalCategory;
  private int amount;

  public int getProposalNumber() {
    return proposalNumber;
  }

  public void setProposalNumber(int proposalNumber) {
    this.proposalNumber = proposalNumber;
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

  public String getProposalCategory() {
    return proposalCategory;
  }

  public void setProposalCategory(String proposalCategory) {
    this.proposalCategory = proposalCategory;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

}