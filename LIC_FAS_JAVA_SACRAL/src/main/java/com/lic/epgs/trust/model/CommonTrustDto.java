package com.lic.epgs.trust.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
@Table(name = "CommonTrustDto")
public class CommonTrustDto {
	
	@Id
	@Column(name = "id")
	private Long id;
	
	@Column(name = "role")
	private String role;
	
	@Column(name = "unitCode")
	private String unitCode;
	
	@Column(name = "status")
	private String status;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
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
}