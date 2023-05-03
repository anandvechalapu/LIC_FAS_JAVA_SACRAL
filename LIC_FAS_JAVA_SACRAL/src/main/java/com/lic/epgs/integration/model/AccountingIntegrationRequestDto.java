package com.lic.epgs.integration.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="accounting_integration_request_dto")
public class AccountingIntegrationRequestDto {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String schemeName;
	private String mphCode;
	private String mphName;
	private String mphNo;
	private String mphMobileNo;
	private String mphEmail;
	private String mphAddress1;
	private String mphAddress2;
	private String district;
	private String state;
	private String pinCode;
	private String servicingUnitName;
	private String servicingUnitAddress1;
	private String servicingUnitAddress2;
	private String servicingUnitAddress3;
	private String servicingUnitAddress4;
	private String servicingUnitCity;
	private String servicingUnitPinCode;
	private String servicingUnitEmail;
	private String servicingUnitPhoneNo;
	private String operatingUnitType;
	private String unitCode;
	private String iCodeForLob;
	private String iCodeForProductLine;
	private String iCodeForVariant;
	private String iCodeForBusinessType;
	private String iCodeForParticipatingType;
	private String iCodeForBusinessSegment;
	private String iCodeForInvestmentPortfolio;
	private String commonmasterserviceUnitByCode;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSchemeName() {
		return schemeName;
	}
	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}
	public String getMphCode() {
		return mphCode;
	}
	public void setMphCode(String mphCode) {
		this.mphCode = mphCode;
	}
	public String getMphName() {
		return mphName;
	}
	public void setMphName(String mphName) {
		this.mphName = mphName;
	}
	public String getMphNo() {
		return mphNo;
	}
	public void setMphNo(String mphNo) {
		this.mphNo = mphNo;
	}
	public String getMphMobileNo() {
		return mphMobileNo;
	}
	public void setMphMobileNo(String mphMobileNo) {
		this.mphMobileNo = mphMobileNo;
	}
	public String getMphEmail() {
		return mphEmail;
	}
	public void setMphEmail(String mphEmail) {
		this.mphEmail = mphEmail;
	}
	public String getMphAddress1() {
		return mphAddress1;
	}
	public void setMphAddress1(String mphAddress1) {
		this.mphAddress1 = mphAddress1;
	}
	public String getMphAddress2() {
		return mphAddress2;
	}
	public void setMphAddress2(String mphAddress2) {
		this.mphAddress2 = mphAddress2;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getServicingUnitName() {
		return servicingUnitName;
	}
	public void setServicingUnitName(String servicingUnitName) {
		this.servicingUnitName = servicingUnitName;
	}
	public String