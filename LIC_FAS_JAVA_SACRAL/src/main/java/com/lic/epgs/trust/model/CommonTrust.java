package com.lic.epgs.trust.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "common_trust")
public class CommonTrust {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long trustId;
    private String trustName;
    private String trustDescription;
    
    // Getters and Setters
    
    public Long getTrustId() {
        return trustId;
    }
    
    public void setTrustId(Long trustId) {
        this.trustId = trustId;
    }
    
    public String getTrustName() {
        return trustName;
    }
    
    public void setTrustName(String trustName) {
        this.trustName = trustName;
    }
    
    public String getTrustDescription() {
        return trustDescription;
    }
    
    public void setTrustDescription(String trustDescription) {
        this.trustDescription = trustDescription;
    }
}