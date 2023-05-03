//Generated Model Class
package com.lic.epgs.lead.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lead_basic_detail")
public class LeadBasicDetailModel {
    @Id
    @Column(name = "lead_id")
    private String leadId;

    @Column(name = "modified_by")
    private String modifiedBy;

    @Column(name = "lead_status")
    private String leadStatus;

    @Column(name = "lead_sub_status")
    private String leadSubStatus;

    @Column(name = "workflow_status")
    private String workflowStatus;

    public LeadBasicDetailModel() {
    }

    public LeadBasicDetailModel(String leadId, String modifiedBy, String leadStatus, String leadSubStatus, String workflowStatus) {
        this.leadId = leadId;
        this.modifiedBy = modifiedBy;
        this.leadStatus = leadStatus;
        this.leadSubStatus = leadSubStatus;
        this.workflowStatus = workflowStatus;
    }

    public String getLeadId() {
        return leadId;
    }

    public void setLeadId(String leadId) {
        this.leadId = leadId;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
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
}