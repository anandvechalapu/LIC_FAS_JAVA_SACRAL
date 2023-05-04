package com.lic.epgs.subcustomer.subcustomermakercontroller.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subcustomers")
public class Subcustomer {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long subcustomerId;
    private String firstName;
    private String lastName;
    private Long bankAccountId;
    private Boolean active;
    
    public Subcustomer() {
    }
    
    public Subcustomer(String firstName, String lastName, Long bankAccountId, Boolean active) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bankAccountId = bankAccountId;
        this.active = active;
    }
    
    public Long getSubcustomerId() {
        return subcustomerId;
    }
    
    public void setSubcustomerId(Long subcustomerId) {
        this.subcustomerId = subcustomerId;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public Long getBankAccountId() {
        return bankAccountId;
    }
    
    public void setBankAccountId(Long bankAccountId) {
        this.bankAccountId = bankAccountId;
    }
    
    public Boolean isActive() {
        return active;
    }
    
    public void setActive(Boolean active) {
        this.active = active;
    }
}