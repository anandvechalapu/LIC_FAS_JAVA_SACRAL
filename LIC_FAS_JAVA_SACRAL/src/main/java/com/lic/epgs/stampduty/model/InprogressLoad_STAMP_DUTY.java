package com.lic.epgs.stampduty.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class InprogressLoad_STAMP_DUTY { 
 
  @Id
  private Long id;
 
  private String role;
 
  private String unitOfficeCode;
 
  private String status;
 
  private String comments;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public String getUnitOfficeCode() {
    return unitOfficeCode;
  }

  public void setUnitOfficeCode(String unitOfficeCode) {
    this.unitOfficeCode = unitOfficeCode;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

}