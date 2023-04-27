package com.lic.epgs.gstexcemption.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ExistingSearch8GstExcemption {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	
	private String unitCode;
	
	private String unitName;
	
	private String excemptionType;
	
	private String excemptionStartDate;
	
	private String excemptionEndDate;
	
	private String excemptionCreatedDate;
	
	public ExistingSearch8GstExcemption(){
		
	}
	
	public ExistingSearch8GstExcemption(Long id, String unitCode, String unitName, String excemptionType,
			String excemptionStartDate, String excemptionEndDate, String excemptionCreatedDate) {
		super();
		Id = id;
		this.unitCode = unitCode;
		this.unitName = unitName;
		this.excemptionType = excemptionType;
		this.excemptionStartDate = excemptionStartDate;
		this.excemptionEndDate = excemptionEndDate;
		this.excemptionCreatedDate = excemptionCreatedDate;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getUnitCode() {
		return unitCode;
	}

	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public String getExcemptionType() {
		return excemptionType;
	}

	public void setExcemptionType(String excemptionType) {
		this.excemptionType = excemptionType;
	}

	public String getExcemptionStartDate() {
		return excemptionStartDate;
	}

	public void setExcemptionStartDate(String excemptionStartDate) {
		this.excemptionStartDate = excemptionStartDate;
	}

	public String getExcemptionEndDate() {
		return excemptionEndDate;
	}

	public void setExcemptionEndDate(String excemptionEndDate) {
		this.excemptionEndDate = excemptionEndDate;
	}

	public String getExcemptionCreatedDate() {
		return excemptionCreatedDate;
	}

	public void setExcemptionCreatedDate(String excemptionCreatedDate) {
		this.excemptionCreatedDate = excemptionCreatedDate;
	}
	
	
	
}