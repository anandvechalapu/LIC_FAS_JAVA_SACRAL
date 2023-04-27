package com.lic.epgs.gstexcemption.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "category_gst_non_applicability_20")
public class CategoryGSTNonApplicability20 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "gst_non_applicability_category")
	private String gstNonApplicabilityCategory;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGstNonApplicabilityCategory() {
		return gstNonApplicabilityCategory;
	}

	public void setGstNonApplicabilityCategory(String gstNonApplicabilityCategory) {
		this.gstNonApplicabilityCategory = gstNonApplicabilityCategory;
	}

}