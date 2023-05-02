package com.lic.epgs.group.groupcustomerdetailscontroller.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "group_customer_address_details")
public class GroupCustomerAddressDetails {
    
    @Id
    private Long id;
    private Long groupAddressId;
    private Long groupCustomerId;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String postalCode;
    private String country;
    private String addressType;
    
    public GroupCustomerAddressDetails() {}
    
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public Long getGroupAddressId() {
        return groupAddressId;
    }
 
    public void setGroupAddressId(Long groupAddressId) {
        this.groupAddressId = groupAddressId;
    }
 
    public Long getGroupCustomerId() {
        return groupCustomerId;
    }
 
    public void setGroupCustomerId(Long groupCustomerId) {
        this.groupCustomerId = groupCustomerId;
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
 
    public String getCity() {
        return city;
    }
 
    public void setCity(String city) {
        this.city = city;
    }
 
    public String getState() {
        return state;
    }
 
    public void setState(String state) {
        this.state = state;
    }
 
    public String getPostalCode() {
        return postalCode;
    }
 
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
 
    public String getCountry() {
        return country;
    }
 
    public void setCountry(String country) {
        this.country = country;
    }
 
    public String getAddressType() {
        return addressType;
    }
 
    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }
    
}