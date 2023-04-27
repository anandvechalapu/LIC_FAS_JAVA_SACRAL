package com.lic.epgs.stampduty.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StampDuty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String role;
    private String unitOfficeCode;

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
}