package com.lic.epgs.customer.customermakercontroller.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer_details")
public class CustomerEntity {
    
    @Id
    private Long id;
    
    private String customerCode;
    private String customerName;
    private String trustName;
    
    public CustomerEntity() {
        
    }
    
    public CustomerEntity(Long id, String customerCode, String customerName, String trustName) {
        this.id = id;
        this.customerCode = customerCode;
        this.customerName = customerName;
        this.trustName = trustName;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getCustomerCode() {
        return customerCode;
    }
    
    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }
    
    public String getCustomerName() {
        return customerName;
    }
    
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    public String getTrustName() {
        return trustName;
    }
    
    public void setTrustName(String trustName) {
        this.trustName = trustName;
    }
    
}