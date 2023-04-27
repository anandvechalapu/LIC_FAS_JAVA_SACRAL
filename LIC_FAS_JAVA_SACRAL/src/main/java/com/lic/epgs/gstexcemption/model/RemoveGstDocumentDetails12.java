package com.lic.epgs.gstexcemption.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "remove_gst_document_details_12")
public class RemoveGstDocumentDetails12 {
    
    @Id
    @Column(name = "gst_exemption_id")
    private String gstExemptionId;
    
    @Column(name = "document_id")
    private String documentId;
    
    @Column(name = "document_type")
    private String documentType;
    
    @Column(name = "document_name")
    private String documentName;
    
    @Column(name = "document_url")
    private String documentUrl;
    
    @Column(name = "created_by")
    private String createdBy;
    
    @Column(name = "created_at")
    private Date createdAt;
    
    @Column(name = "updated_by")
    private String updatedBy;
    
    @Column(name = "updated_at")
    private Date updatedAt;
    
    @Column(name = "active_flag")
    private String activeFlag;
    
    public String getGstExemptionId() {
        return gstExemptionId;
    }
    
    public void setGstExemptionId(String gstExemptionId) {
        this.gstExemptionId = gstExemptionId;
    }
    
    public String getDocumentId() {
        return documentId;
    }
    
    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }
    
    public String getDocumentType() {
        return documentType;
    }
    
    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }
    
    public String getDocumentName() {
        return documentName;
    }
    
    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }
    
    public String getDocumentUrl() {
        return documentUrl;
    }
    
    public void setDocumentUrl(String documentUrl) {
        this.documentUrl = documentUrl;
    }
    
    public String getCreatedBy() {
        return createdBy;
    }
    
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    
    public Date getCreatedAt() {
        return createdAt;
    }
    
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    
    public String getUpdatedBy() {
        return updatedBy;
    }
    
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
    
    public Date getUpdatedAt() {
        return updatedAt;
    }
    
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
    
    public String getActiveFlag() {
        return activeFlag;
    }
    
    public void setActiveFlag(String activeFlag) {
        this.activeFlag = activeFlag;
    }
}