package com.lic.epgs.trust.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="trust_basic_details")
public class TrustBasicDetails {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
    
    @Column(name="trust_code")
    private String trustCode;
    
    @Column(name="trust_name")
    private String trustName;
    
    @Column(name="trust_status")
    private String trustStatus;
    
    @Column(name="workflow_status")
    private String workflowStatus;
    
    @Column(name="is_active")
    private boolean isActive;

    public TrustBasicDetails(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTrustCode() {
        return trustCode;
    }

    public void setTrustCode(String trustCode) {
        this.trustCode = trustCode;
    }

    public String getTrustName() {
        return trustName;
    }

    public void setTrustName(String trustName) {
        this.trustName = trustName;
    }

    public String getTrustStatus() {
        return trustStatus;
    }

    public void setTrustStatus(String trustStatus) {
        this.trustStatus = trustStatus;
    }

    public String getWorkflowStatus() {
        return workflowStatus;
    }

    public void setWorkflowStatus(String workflowStatus) {
        this.workflowStatus = workflowStatus;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

}