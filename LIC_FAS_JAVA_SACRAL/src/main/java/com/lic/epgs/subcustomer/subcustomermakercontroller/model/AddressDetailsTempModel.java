package com.lic.epgs.subcustomer.subcustomermakercontroller.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AddressDetailsTempModel {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private Long subcustomerId;
    private String addressType;
    private String addressTypeName;
    private String country;
    private String state;
    private String district;
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String town;
    private String locality;
    private String pin;
    private String gcFlag;
    private String printFlag;
    private String createdBy;
    private String modifiedBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSubcustomerId() {
        return subcustomerId;
    }

    public void setSubcustomerId(Long subcustomerId) {
        this.subcustomerId = subcustomerId;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public String getAddressTypeName() {
        return addressTypeName;
    }

    public void setAddressTypeName(String addressTypeName) {
        this.addressTypeName = addressTypeName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getAddressLine3() {
        return addressLine3;
    }

    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getGcFlag() {
        return gcFlag;
    }

    public void setGcFlag(String gcFlag) {
        this.gcFlag = gcFlag;
    }

    public String getPrintFlag() {
        return printFlag;
    }

    public void setPrintFlag(String printFlag) {
        this.printFlag = printFlag;
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
}