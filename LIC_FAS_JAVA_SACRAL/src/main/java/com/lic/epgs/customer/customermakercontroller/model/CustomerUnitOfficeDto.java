package com.lic.epgs.customer.customermakercontroller.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer_unit_office_dtl")
public class CustomerUnitOfficeDto {
    @Id
    private Long customerUnitOfficeId;
    private Long customerId;
    private String customerName;
    private String customerAddress;
    private String customerPhone;
    private String customerEmail;
    private String customerUnitName;
    private String customerUnitAddress;
    private String customerUnitPhone;
    private String customerUnitEmail;

    public Long getCustomerUnitOfficeId() {
        return customerUnitOfficeId;
    }

    public void setCustomerUnitOfficeId(Long customerUnitOfficeId) {
        this.customerUnitOfficeId = customerUnitOfficeId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerUnitName() {
        return customerUnitName;
    }

    public void setCustomerUnitName(String customerUnitName) {
        this.customerUnitName = customerUnitName;
    }

    public String getCustomerUnitAddress() {
        return customerUnitAddress;
    }

    public void setCustomerUnitAddress(String customerUnitAddress) {
        this.customerUnitAddress = customerUnitAddress;
    }

    public String getCustomerUnitPhone() {
        return customerUnitPhone;
    }

    public void setCustomerUnitPhone(String customerUnitPhone) {
        this.customerUnitPhone = customerUnitPhone;
    }

    public String getCustomerUnitEmail() {
        return customerUnitEmail;
    }

    public void setCustomerUnitEmail(String customerUnitEmail) {
        this.customerUnitEmail = customerUnitEmail;
    }
}