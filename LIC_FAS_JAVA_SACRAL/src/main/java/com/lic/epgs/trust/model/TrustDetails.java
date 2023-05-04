package com.lic.epgs.trust.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TrustDetails {

	@Id
	private Long id;
	private String trustId;
	private String unitCode;
	private String status;
	private String description;
	
	// Getters and Setters
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTrustId() {
		return trustId;
	}
	public void setTrustId(String trustId) {
		this.trustId = trustId;
	}
	public String getUnitCode() {
		return unitCode;
	}
	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}	
}