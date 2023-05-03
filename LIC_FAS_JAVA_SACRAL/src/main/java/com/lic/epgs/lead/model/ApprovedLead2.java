package com.lic.epgs.lead.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "approved_lead2")
public class ApprovedLead2 implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "lead_id")
    private Long leadId;

    @Column(name = "lead_status")
    private String leadStatus;

    @Column(name = "lead_sub_status")
    private String leadSubStatus;

    @Column(name = "workflow_status")
    private String workflowStatus;

    @Column(name = "modified_by")
    private String modifiedBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLeadId() {
        return leadId;
    }

    public void setLeadId(Long leadId) {
        this.leadId = leadId;
    }

    public String getLeadStatus() {
        return leadStatus;
    }

    public void setLeadStatus(String leadStatus) {
        this.leadStatus = leadStatus;
    }

    public String getLeadSubStatus() {
        return leadSubStatus;
    }

    public void setLeadSubStatus(String leadSubStatus) {
        this.leadSubStatus = leadSubStatus;
    }

    public String getWorkflowStatus() {
        return workflowStatus;
    }

    public void setWorkflowStatus(String workflowStatus) {
        this.workflowStatus = workflowStatus;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }
}