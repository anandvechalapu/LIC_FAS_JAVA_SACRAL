package com.lic.epgs.subcustomer.subcustomermakercontroller.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sub_customer_address_details")
public class SubCustomerAddressDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sub_address_id")
	private Long subAddressId;
	
	@Column(name = "sub_customer_id")
	private Long subCustomerId;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "zip_code")
	private String zipCode;
	
	public Long getSubAddressId() {
		return subAddressId;
	}
	
	public void setSubAddressId(Long subAddressId) {
		this.subAddressId = subAddressId;
	}
	
	public Long getSubCustomerId() {
		return subCustomerId;
	}
	
	public void setSubCustomerId(Long subCustomerId) {
		this.subCustomerId = subCustomerId;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getZipCode() {
		return zipCode;
	}
	
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
}