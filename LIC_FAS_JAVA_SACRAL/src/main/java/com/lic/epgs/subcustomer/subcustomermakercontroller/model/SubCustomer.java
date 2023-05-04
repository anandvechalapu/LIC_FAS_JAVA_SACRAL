package com.lic.epgs.subcustomer.subcustomermakercontroller.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subcustomer")
public class SubCustomer {
    @Id
    private Long id;
    private String name;
    private String code;
    private String mappedDetails;
    
    public SubCustomer() {}
    
    public SubCustomer(Long id, String name, String code, String mappedDetails) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.mappedDetails = mappedDetails;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getCode() {
        return code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    
    public String getMappedDetails() {
        return mappedDetails;
    }
    
    public void setMappedDetails(String mappedDetails) {
        this.mappedDetails = mappedDetails;
    }
}