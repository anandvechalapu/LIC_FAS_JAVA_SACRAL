package com.lic.epgs.trust.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TrustDetails {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long trustId;

    private String trustName;

    private String trustType;

    private String trustDescription;

    private String trustStatus;

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

    public String getTrustType() {
        return trustType;
    }

    public void setTrustType(String trustType) {
        this.trustType = trustType;
    }

    public String getTrustDescription() {
        return trustDescription;
    }

    public void setTrustDescription(String trustDescription) {
        this.trustDescription = trustDescription;
    }

    public String getTrustStatus() {
        return trustStatus;
    }

    public void setTrustStatus(String trustStatus) {
        this.trustStatus = trustStatus;
    }

}