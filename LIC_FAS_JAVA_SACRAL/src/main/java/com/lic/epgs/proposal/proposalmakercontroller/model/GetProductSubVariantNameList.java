package com.lic.epgs.proposal.proposalmakercontroller.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GetProductSubVariantNameList {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Long id;
	
	private Long productVariantId;
	private String subVariantName;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getProductVariantId() {
		return productVariantId;
	}
	public void setProductVariantId(Long productVariantId) {
		this.productVariantId = productVariantId;
	}
	public String getSubVariantName() {
		return subVariantName;
	}
	public void setSubVariantName(String subVariantName) {
		this.subVariantName = subVariantName;
	}
	

}