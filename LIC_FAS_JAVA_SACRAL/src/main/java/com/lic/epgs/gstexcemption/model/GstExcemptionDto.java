public class GstExcemptionDto {

    @Id
    @GeneratedValue
    private Long gstExcemptionId;

    @Column(name = "gst_number")
    private String gstNumber;

    @Column(name = "business_name")
    private String businessName;

    @Column(name = "business_address")
    private String businessAddress;

    @Column(name = "excemption_category")
    private String excemptionCategory;

    @Column(name = "excemption_amount")
    private Integer excemptionAmount;

    public Long getGstExcemptionId() {
        return gstExcemptionId;
    }

    public void setGstExcemptionId(Long gstExcemptionId) {
        this.gstExcemptionId = gstExcemptionId;
    }

    public String getGstNumber() {
        return gstNumber;
    }

    public void setGstNumber(String gstNumber) {
        this.gstNumber = gstNumber;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessAddress() {
        return businessAddress;
    }

    public void setBusinessAddress(String businessAddress) {
        this.businessAddress = businessAddress;
    }

    public String getExcemptionCategory() {
        return excemptionCategory;
    }

    public void setExcemptionCategory(String excemptionCategory) {
        this.excemptionCategory = excemptionCategory;
    }

    public Integer getExcemptionAmount() {
        return excemptionAmount;
    }

    public void setExcemptionAmount(Integer excemptionAmount) {
        this.excemptionAmount = excemptionAmount;
    }
}

public class GSTResponseDto<T> {

    private T data;

    private String message;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

package com.lic.epgs.gstexcemption.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class GstExcemptionDto {

    @Id
    @GeneratedValue
    private Long gstExcemptionId;

    @Column(name = "gst_number")
    private String gstNumber;

    @Column(name = "business_name")
    private String businessName;

    @Column(name = "business_address")
    private String businessAddress;

    @Column(name = "excemption_category")
    private String excemptionCategory;

    @Column(name = "excemption_amount")
    private Integer excemptionAmount;

    public Long getGstExcemptionId() {
        return gstExcemptionId;
    }

    public void setGstExcemptionId(Long gstExcemptionId) {
        this.gstExcemptionId = gstExcemptionId;
    }

    public String getGstNumber() {
        return gstNumber;
    }

    public void setGstNumber(String gstNumber) {
        this.gstNumber = gstNumber;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessAddress() {
        return businessAddress;
    }

    public void setBusinessAddress(String businessAddress) {
        this.businessAddress = businessAddress;
    }

    public String getExcemptionCategory() {
        return excemptionCategory;
    }

   