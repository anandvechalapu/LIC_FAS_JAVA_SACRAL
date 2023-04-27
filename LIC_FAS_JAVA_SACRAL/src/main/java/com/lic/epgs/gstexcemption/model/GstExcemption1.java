package com.lic.epgs.gstexcemption.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GST_EXCEMPTION_1")
public class GstExcemption1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GSTEXCEMPTION_ID")
    private Long gstexcemptionId;

    @Column(name = "GST")
    private String gst;

    @Column(name = "IS_ACTIVE")
    private Boolean isActive;

    public Long getGstexcemptionId() {
        return gstexcemptionId;
    }

    public void setGstexcemptionId(Long gstexcemptionId) {
        this.gstexcemptionId = gstexcemptionId;
    }

    public String getGst() {
        return gst;
    }

    public void setGst(String gst) {
        this.gst = gst;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }
}