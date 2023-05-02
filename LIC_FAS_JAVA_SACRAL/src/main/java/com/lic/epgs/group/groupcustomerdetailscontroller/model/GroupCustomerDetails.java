package com.lic.epgs.group.groupcustomerdetailscontroller.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "group_customer_details")
public class GroupCustomerDetails {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "group_customer_id")
  private Long groupCustomerId;

  @Column(name = "customer_id")
  private Long customerId;

  @Column(name = "group_id")
  private Long groupId;

  @Column(name = "is_active")
  private Boolean isActive;

  public Long getGroupCustomerId() {
    return groupCustomerId;
  }

  public void setGroupCustomerId(Long groupCustomerId) {
    this.groupCustomerId = groupCustomerId;
  }

  public Long getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Long customerId) {
    this.customerId = customerId;
  }

  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }
}