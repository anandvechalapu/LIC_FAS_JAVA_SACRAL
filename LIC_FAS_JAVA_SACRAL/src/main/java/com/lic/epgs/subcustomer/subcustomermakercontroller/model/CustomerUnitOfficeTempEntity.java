package com.lic.epgs.subcustomer.subcustomermakercontroller.model;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerUnitOfficeTempEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long customerId;
    private Long subCustomerId;
    private String sourceUnitId;
    private String channelColorCode;
    private String channelUserId;
    private LocalDateTime fromDate;
    private LocalDateTime toDate;
    private String createdBy;
    private String modifiedBy;
    private Boolean activeState;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getSubCustomerId() {
        return subCustomerId;
    }

    public void setSubCustomerId(Long subCustomerId) {
        this.subCustomerId = subCustomerId;
    }

    public String getSourceUnitId() {
        return sourceUnitId;
    }

    public void setSourceUnitId(String sourceUnitId) {
        this.sourceUnitId = sourceUnitId;
    }

    public String getChannelColorCode() {
        return channelColorCode;
    }

    public void setChannelColorCode(String channelColorCode) {
        this.channelColorCode = channelColorCode;
    }

    public String getChannelUserId() {
        return channelUserId;
    }

    public void setChannelUserId(String channelUserId) {
        this.channelUserId = channelUserId;
    }

    public LocalDateTime getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDateTime getToDate() {
        return toDate;
    }

    public void setToDate(LocalDateTime toDate) {
        this.toDate = toDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Boolean getActiveState() {
        return activeState;
    }

    public void setActiveState(Boolean activeState) {
        this.activeState = activeState;
    }
}