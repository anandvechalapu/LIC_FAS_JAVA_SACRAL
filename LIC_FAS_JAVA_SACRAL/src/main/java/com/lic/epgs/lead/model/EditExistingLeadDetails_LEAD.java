package com.lic.epgs.lead.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EditExistingLeadDetails_LEAD {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long leadId;

    // Product details
    private String productName;
    private String productDescription;
    private String productCategory;
    private String productType;
    private String productSubType;

    // Channel details
    private String channelName;
    private String channelType;

    // Notes
    private String notes;

    public long getLeadId() {
        return leadId;
    }

    public void setLeadId(long leadId) {
        this.leadId = leadId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductSubType() {
        return productSubType;
    }

    public void setProductSubType(String productSubType) {
        this.productSubType = productSubType;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

}