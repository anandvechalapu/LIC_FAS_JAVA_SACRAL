package com.lic.epgs.subcustomer.subcustomercheckercontroller.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SubCustomerCheckerController {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String subCustomerId;
    private String customerName;
    private String customerAddress;
    private String customerPhoneNumber;

    public SubCustomerCheckerController() {

    }

    public SubCustomerCheckerController(String subCustomerId, String customerName, String customerAddress, String customerPhoneNumber) {
        this.subCustomerId = subCustomerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubCustomerId() {
        return subCustomerId;
    }

    public void setSubCustomerId(String subCustomerId) {
        this.subCustomerId = subCustomerId;
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

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
    
}