package com.lic.epgs.gstexcemption.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GstExcemption {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String loginUser;
	private String unitCode;
	private String gstExcemptionStatus;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLoginUser() {
		return loginUser;
	}

	public void setLoginUser(String loginUser) {
		this.loginUser = loginUser;
	}

	public String getUnitCode() {
		return unitCode;
	}

	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}

	public String getGstExcemptionStatus() {
		return gstExcemptionStatus;
	}

	public void setGstExcemptionStatus(String gstExcemptionStatus) {
		this.gstExcemptionStatus = gstExcemptionStatus;
	}

}