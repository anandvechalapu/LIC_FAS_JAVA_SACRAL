package com.lic.epgs.group.groupcustomercheckercontroller.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "group_customer_basic_details")
public class GroupCustomerBasicDetails {

    @Id
    private Long id;
    private String groupCustomerId;
    private String groupCustomerName;
    private String groupCustomerStatus;
    private boolean isActive;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGroupCustomerId() {
        return groupCustomerId;
    }

    public void setGroupCustomerId(String groupCustomerId) {
        this.groupCustomerId = groupCustomerId;
    }

    public String getGroupCustomerName() {
        return groupCustomerName;
    }

    public void setGroupCustomerName(String groupCustomerName) {
        this.groupCustomerName = groupCustomerName;
    }

    public String getGroupCustomerStatus() {
        return groupCustomerStatus;
    }

    public void setGroupCustomerStatus(String groupCustomerStatus) {
        this.groupCustomerStatus = groupCustomerStatus;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}