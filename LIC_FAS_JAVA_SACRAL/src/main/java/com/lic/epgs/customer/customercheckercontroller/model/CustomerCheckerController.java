package com.lic.epgs.customer.customercheckercontroller.model;

import java.util.UUID;

public class CustomerCheckerController {

  private UUID id;
  private String address;
  private String contactDetails;
  private String migrationData;
  private boolean approved;
  private String status;

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getContactDetails() {
    return contactDetails;
  }

  public void setContactDetails(String contactDetails) {
    this.contactDetails = contactDetails;
  }

  public String getMigrationData() {
    return migrationData;
  }

  public void setMigrationData(String migrationData) {
    this.migrationData = migrationData;
  }

  public boolean isApproved() {
    return approved;
  }

  public void setApproved(boolean approved) {
    this.approved = approved;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

}