package com.lic.epgs.proposal.proposalmakercontroller.model;
 
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "product_variants")
public class ProductVariant implements Serializable {
 
    private static final long serialVersionUID = 1L;
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
    private Long productId;
 
    private String variantName;
 
    private String variantValue;
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public Long getProductId() {
        return productId;
    }
 
    public void setProductId(Long productId) {
        this.productId = productId;
    }
 
    public String getVariantName() {
        return variantName;
    }
 
    public void setVariantName(String variantName) {
        this.variantName = variantName;
    }
 
    public String getVariantValue() {
        return variantValue;
    }
 
    public void setVariantValue(String variantValue) {
        this.variantValue = variantValue;
    }
 
}