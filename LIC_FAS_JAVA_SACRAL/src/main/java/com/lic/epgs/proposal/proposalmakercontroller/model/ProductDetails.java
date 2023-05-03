package com.lic.epgs.proposal.proposalmakercontroller.model;

import javax.persistence.*;

@Entity
@Table(name = "product_details")
public class ProductDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lead_product_id")
    private Long leadProductId;

    @Column(name = "product_name")
    private String productName;

    public Long getLeadProductId() {
        return leadProductId;
    }

    public void setLeadProductId(Long leadProductId) {
        this.leadProductId = leadProductId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}