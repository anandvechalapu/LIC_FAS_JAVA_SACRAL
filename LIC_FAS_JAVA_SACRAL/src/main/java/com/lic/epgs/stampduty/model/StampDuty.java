package com.lic.epgs.stampduty.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.Date;

@Entity
@Table(name = "stamp_duty")
public class StampDuty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "role_type")
    private String roleType;

    @Column(name = "unit_office_code")
    private String unitOfficeCode;

    @Column(name = "challan_grn_number")
    private String challanGRNNumber;

    @Column(name = "challan_grn_date")
    private String challanGRNDate;

    @Column(name = "stamp_duty_status")
    private String stampDutyStatus;

    @Column(name = "created_date")
    private Date createdDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    public String getUnitOfficeCode() {
        return unitOfficeCode;
    }

    public void setUnitOfficeCode(String unitOfficeCode) {
        this.unitOfficeCode = unitOfficeCode;
    }

    public String getChallanGRNNumber() {
        return challanGRNNumber;
    }

    public void setChallanGRNNumber(String challanGRNNumber) {
        this.challanGRNNumber = challanGRNNumber;
    }

    public String getChallanGRNDate() {
        return challanGRNDate;
    }

    public void setChallanGRNDate(String challanGRNDate) {
        this.challanGRNDate = challanGRNDate;
    }

    public String getStampDutyStatus() {
        return stampDutyStatus;
    }

    public void setStampDutyStatus(String stampDutyStatus) {
        this.stampDutyStatus = stampDutyStatus;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}