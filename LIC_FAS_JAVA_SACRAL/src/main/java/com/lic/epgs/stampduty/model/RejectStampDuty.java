package com.lic.epgs.stampduty.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RejectStampDuty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String rejectionReasonCode;
    private String rejectionRemarks;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRejectionReasonCode() {
        return rejectionReasonCode;
    }

    public void setRejectionReasonCode(String rejectionReasonCode) {
        this.rejectionReasonCode = rejectionReasonCode;
    }

    public String getRejectionRemarks() {
        return rejectionRemarks;
    }

    public void setRejectionRemarks(String rejectionRemarks) {
        this.rejectionRemarks = rejectionRemarks;
    }

}