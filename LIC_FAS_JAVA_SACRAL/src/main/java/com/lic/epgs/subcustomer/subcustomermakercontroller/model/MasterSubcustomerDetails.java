package com.lic.epgs.subcustomer.subcustomermakercontroller.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MasterSubcustomerDetails {

    @Id
    private Long id;
    private String subcustomerName;
    private String subcustomerStatus;
    private Boolean isActive;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubcustomerName() {
        return subcustomerName;
    }

    public void setSubcustomerName(String subcustomerName) {
        this.subcustomerName = subcustomerName;
    }

    public String getSubcustomerStatus() {
        return subcustomerStatus;
    }

    public void setSubcustomerStatus(String subcustomerStatus) {
        this.subcustomerStatus = subcustomerStatus;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}