package com.lic.epgs.trust.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "trust")
public class Trust {

	private String trustId;
	private String unitCode;
	private String trustName;
	private String trustAddress;
	private String trustPhone;
	private String trustEmail;
	private boolean isActive;

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

	public String getTrustName() {
		return trustName;
	}

	public void setTrustName(String trustName) {
		this.trustName = trustName;
	}

	public String getTrustAddress() {
		return trustAddress;
	}

	public void setTrustAddress(String trustAddress) {
		this.trustAddress = trustAddress;
	}

	public String getTrustPhone() {
		return trustPhone;
	}

	public void setTrustPhone(String trustPhone) {
		this.trustPhone = trustPhone;
	}

	public String getTrustEmail() {
		return trustEmail;
	}

	public void setTrustEmail(String trustEmail) {
		this.trustEmail = trustEmail;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

}