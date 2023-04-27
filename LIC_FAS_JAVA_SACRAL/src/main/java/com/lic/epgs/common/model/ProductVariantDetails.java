package com.lic.epgs.common.model;

import java.io.Serializable;

public class ProductVariantDetails implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String sourceVariant;
	private String destinationVariant;
	private String destinationVariantDescription;
	
	public ProductVariantDetails() {
		
	}
	
	public ProductVariantDetails(String sourceVariant, String destinationVariant, String destinationVariantDescription) {
		this.sourceVariant = sourceVariant;
		this.destinationVariant = destinationVariant;
		this.destinationVariantDescription = destinationVariantDescription;
	}
	
	public String getSourceVariant() {
		return sourceVariant;
	}
	
	public void setSourceVariant(String sourceVariant) {
		this.sourceVariant = sourceVariant;
	}
	
	public String getDestinationVariant() {
		return destinationVariant;
	}
	
	public void setDestinationVariant(String destinationVariant) {
		this.destinationVariant = destinationVariant;
	}
	
	public String getDestinationVariantDescription() {
		return destinationVariantDescription;
	}
	
	public void setDestinationVariantDescription(String destinationVariantDescription) {
		this.destinationVariantDescription = destinationVariantDescription;
	}
	
	@Override
	public String toString() {
		return "ProductVariantDetails [sourceVariant=" + sourceVariant + ", destinationVariant=" + destinationVariant
				+ ", destinationVariantDescription=" + destinationVariantDescription + "]";
	}
	
}