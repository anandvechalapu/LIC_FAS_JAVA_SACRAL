package com.lic.epgs.trust.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trust")
public class TrustEntity implements Serializable {
	
	@Id
	private Long id;
	
	private String unitCode;
	
	private List<String> trustStatuses;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getUnitCode() {
		return unitCode;
	}
	
	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}
	
	public List<String> getTrustStatuses() {
		return trustStatuses;
	}
	
	public void setTrustStatuses(List<String> trustStatuses) {
		this.trustStatuses = trustStatuses;
	}
	
}