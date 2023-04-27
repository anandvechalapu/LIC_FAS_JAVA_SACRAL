package com.lic.epgs.stampduty.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stamp_duty")
public class StampDuty {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "challan_grn_no")
	private String challanGrnNo;

	@Column(name = "challan_grn_date")
	private String challanGrnDate;

	@Column(name = "role_type")
	private String roleType;

	@Column(name = "stamp_duty_status")
	private String stampDutyStatus;

	@Column(name = "unit_office_code")
	private String unitOfficeCode;

	@Column(name = "active")
	private Boolean active;

	@Column(name = "modified_date")
	private String modifiedDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getChallanGrnNo() {
		return challanGrnNo;
	}

	public void setChallanGrnNo(String challanGrnNo) {
		this.challanGrnNo = challanGrnNo;
	}

	public String getChallanGrnDate() {
		return challanGrnDate;
	}

	public void setChallanGrnDate(String challanGrnDate) {
		this.challanGrnDate = challanGrnDate;
	}

	public String getRoleType() {
		return roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	public String getStampDutyStatus() {
		return stampDutyStatus;
	}

	public void setStampDutyStatus(String stampDutyStatus) {
		this.stampDutyStatus = stampDutyStatus;
	}

	public String getUnitOfficeCode() {
		return unitOfficeCode;
	}

	public void setUnitOfficeCode(String unitOfficeCode) {
		this.unitOfficeCode = unitOfficeCode;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

}