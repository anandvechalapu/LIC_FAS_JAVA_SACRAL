package com.lic.epgs.lead.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="lead_product_details_temp")
public class LeadProductDetailsTempEntity {

    private Long id;
    private String productName;
    private String productCode;
    private String productType;
    private String productStatus;
    private String productDescription;
    private String leadId;
    private String productId;

    public LeadProductDetailsTempEntity() {
    }

    public LeadProductDetailsTempEntity(Long id, String productName, String productCode, String productType, String productStatus, String productDescription, String leadId, String productId) {
        this.id = id;
        this.productName = productName;
        this.productCode = productCode;
        this.productType = productType;
        this.productStatus = productStatus;
        this.productDescription = productDescription;
        this.leadId = leadId;
        this.productId = productId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getLeadId() {
        return leadId;
    }

    public void setLeadId(String leadId) {
        this.leadId = leadId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
}