package com.lic.epgs.trust.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ContactEntityList {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long trustId;
    private String contactName;
    private String contactEmail;
    private List<String> contactTypes;
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public Long getTrustId() {
        return trustId;
    }
 
    public void setTrustId(Long trustId) {
        this.trustId = trustId;
    }
 
    public String getContactName() {
        return contactName;
    }
 
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }
 
    public String getContactEmail() {
        return contactEmail;
    }
 
    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }
 
    public List<String> getContactTypes() {
        return contactTypes;
    }
 
    public void setContactTypes(List<String> contactTypes) {
        this.contactTypes = contactTypes;
    }
}