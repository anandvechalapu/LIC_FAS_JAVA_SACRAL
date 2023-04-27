package com.lic.epgs.commission.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "commission")
public class Commission {

  @Id
  private Long commissionId;
  private String status;
  private String role;
  
  public Long getCommissionId() {
    return commissionId;
  }
  
  public void setCommissionId(Long commissionId) {
    this.commissionId = commissionId;
  }
  
  public String getStatus() {
    return status;
  }
  
  public void setStatus(String status) {
    this.status = status;
  }
  
  public String getRole() {
    return role;
  }
  
  public void setRole(String role) {
    this.role = role;
  }

}

package com.lic.epgs.commission.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "commission_temp")
public class CommissionTemp {

  @Id
  private Long commissionId;
  private String status;
  
  public Long getCommissionId() {
    return commissionId;
  }
  
  public void setCommissionId(Long commissionId) {
    this.commissionId = commissionId;
  }
  
  public String getStatus() {
    return status;
  }
  
  public void setStatus(String status) {
    this.status = status;
  }

}

package com.lic.epgs.commission.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "commission_notes")
public class CommissionNotes {

  @Id
  private Long commissionId;
  private String notes;
  
  public Long getCommissionId() {
    return commissionId;
  }
  
  public void setCommissionId(Long commissionId) {
    this.commissionId = commissionId;
  }
  
  public String getNotes() {
    return notes;
  }
  
  public void setNotes(String notes) {
    this.notes = notes;
  }

}

package com.lic.epgs.commission.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "commission_questions")
public class CommissionQuestion {

  @Id
  private Long commissionId;
  private String question;
  
  public Long getCommissionId() {
    return commissionId;
  }
  
  public void setCommissionId(Long commissionId) {
    this.commissionId = commissionId;
  }
  
  public String getQuestion() {
    return question;
  }
  
  public void setQuestion(String question) {
    this.question = question;
  }

}