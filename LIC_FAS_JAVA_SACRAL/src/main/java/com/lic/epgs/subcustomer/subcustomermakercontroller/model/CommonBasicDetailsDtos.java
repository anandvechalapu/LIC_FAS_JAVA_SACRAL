package com.lic.epgs.subcustomer.subcustomermakercontroller.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CommonBasicDetailsDtos {
    
    @Id
    private Long subCustomerId;
    private Long contactPersonId;
    private String contactPersonName;
    private String contactPersonEmail;
    private String contactPersonMobile;
    private String contactPersonTelephone;
    
    public CommonBasicDetailsDtos() {
    }
    
    public Long getSubCustomerId() {
        return subCustomerId;
    }
    
    public void setSubCustomerId(Long subCustomerId) {
        this.subCustomerId = subCustomerId;
    }
    
    public Long getContactPersonId() {
        return contactPersonId;
    }
    
    public void setContactPersonId(Long contactPersonId) {
        this.contactPersonId = contactPersonId;
    }
    
    public String getContactPersonName() {
        return contactPersonName;
    }
    
    public void setContactPersonName(String contactPersonName) {
        this.contactPersonName = contactPersonName;
    }
    
    public String getContactPersonEmail() {
        return contactPersonEmail;
    }
    
    public void setContactPersonEmail(String contactPersonEmail) {
        this.contactPersonEmail = contactPersonEmail;
    }
    
    public String getContactPersonMobile() {
        return contactPersonMobile;
    }
    
    public void setContactPersonMobile(String contactPersonMobile) {
        this.contactPersonMobile = contactPersonMobile;
    }
    
    public String getContactPersonTelephone() {
        return contactPersonTelephone;
    }
    
    public void setContactPersonTelephone(String contactPersonTelephone) {
        this.contactPersonTelephone = contactPersonTelephone;
    }
}