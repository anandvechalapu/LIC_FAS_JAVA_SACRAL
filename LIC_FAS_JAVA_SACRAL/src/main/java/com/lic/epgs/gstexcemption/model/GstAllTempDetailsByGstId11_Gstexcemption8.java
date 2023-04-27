package com.lic.epgs.gstexcemption.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GstAllTempDetailsByGstId11_Gstexcemption8 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long gstExemptionId;
    private String gstType;
    private String gstTin;
    private String gstPeriodStartDate;
    private String gstPeriodEndDate;
    private String gstExcemptionType;
    private double gstExcemptionAmount;
    private String gstExcemptionTaxType;
    private String gstExcemptionStartDate;
    private String gstExcemptionEndDate;

    public Long getGstExemptionId() {
        return gstExemptionId;
    }

    public void setGstExemptionId(Long gstExemptionId) {
        this.gstExemptionId = gstExemptionId;
    }

    public String getGstType() {
        return gstType;
    }

    public void setGstType(String gstType) {
        this.gstType = gstType;
    }

    public String getGstTin() {
        return gstTin;
    }

    public void setGstTin(String gstTin) {
        this.gstTin = gstTin;
    }

    public String getGstPeriodStartDate() {
        return gstPeriodStartDate;
    }

    public void setGstPeriodStartDate(String gstPeriodStartDate) {
        this.gstPeriodStartDate = gstPeriodStartDate;
    }

    public String getGstPeriodEndDate() {
        return gstPeriodEndDate;
    }

    public void setGstPeriodEndDate(String gstPeriodEndDate) {
        this.gstPeriodEndDate = gstPeriodEndDate;
    }

    public String getGstExcemptionType() {
        return gstExcemptionType;
    }

    public void setGstExcemptionType(String gstExcemptionType) {
        this.gstExcemptionType = gstExcemptionType;
    }

    public double getGstExcemptionAmount() {
        return gstExcemptionAmount;
    }

    public void setGstExcemptionAmount(double gstExcemptionAmount) {
        this.gstExcemptionAmount = gstExcemptionAmount;
    }

    public String getGstExcemptionTaxType() {
        return gstExcemptionTaxType;
    }

    public void setGstExcemptionTaxType(String gstExcemptionTaxType) {
        this.gstExcemptionTaxType = gstExcemptionTaxType;
    }

    public String getGstExcemptionStartDate() {
        return gstExcemptionStartDate;
    }

    public void setGstExcemptionStartDate(String gstExcemptionStartDate) {
        this.gstExcemptionStartDate = gstExcemptionStartDate;
    }

    public String getGstExcemptionEndDate() {
        return gstExcemptionEndDate;
    }

    public void setGstExcemptionEndDate(String gstExcemptionEndDate) {
        this.gstExcemptionEndDate = gstExcemptionEndDate;
    }
}