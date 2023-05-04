package com.lic.epgs.trust.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TrustDetails {
    
    @Id
    private Long id;
    
    private String trustId;
    private String contactPersonId;
    private String role;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getTrustId() {
        return trustId;
    }
    
    public void setTrustId(String trustId) {
        this.trustId = trustId;
    }
    
    public String getContactPersonId() {
        return contactPersonId;
    }
    
    public void setContactPersonId(String contactPersonId) {
        this.contactPersonId = contactPersonId;
    }
    
    public String getRole() {
        return role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }
    
}