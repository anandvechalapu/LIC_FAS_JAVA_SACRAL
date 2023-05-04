package com.lic.epgs.subcustomer.subcustomermakercontroller.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String name;
  private String info;
  private String latestInfo;
  private String nonUniqueResult;
  private String exception;
  
  public Long getId() {
    return id;
  }
  
  public void setId(Long id) {
    this.id = id;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getInfo() {
    return info;
  }
  
  public void setInfo(String info) {
    this.info = info;
  }
  
  public String getLatestInfo() {
    return latestInfo;
  }
  
  public void setLatestInfo(String latestInfo) {
    this.latestInfo = latestInfo;
  }
  
  public String getNonUniqueResult() {
    return nonUniqueResult;
  }
  
  public void setNonUniqueResult(String nonUniqueResult) {
    this.nonUniqueResult = nonUniqueResult;
  }
  
  public String getException() {
    return exception;
  }
  
  public void setException(String exception) {
    this.exception = exception;
  }
  
}