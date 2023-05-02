package com.lic.epgs.group.groupcustomerdetailscontroller.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="group_customer_details")
public class GroupCustomerDetails {

    @Id
    private Long groupCustomerId;
    private String unitCode;
    private String name;
    private String description;

    public Long getGroupCustomerId() {
        return groupCustomerId;
    }

    public void setGroupCustomerId(Long groupCustomerId) {
        this.groupCustomerId = groupCustomerId;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}