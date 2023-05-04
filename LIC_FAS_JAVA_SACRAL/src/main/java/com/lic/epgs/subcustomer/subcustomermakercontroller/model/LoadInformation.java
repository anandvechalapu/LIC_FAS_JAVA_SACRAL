package com.lic.epgs.subcustomer.subcustomermakercontroller.model;

import javax.persistence.*;

@Entity
@Table(name = "LOAD_INFORMATION")
public class LoadInformation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
 
	@Column(name = "ROLE_TYPE")
	private String roleType;
	
	@Column(name = "UNIT_CODE")
	private String unitCode;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CUSTOMER_ID")
	private CustomerInformation customerInformation;
	
	//Getters and Setters
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRoleType() {
		return roleType;
	}
	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}
	public String getUnitCode() {
		return unitCode;
	}
	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}
	public CustomerInformation getCustomerInformation() {
		return customerInformation;
	}
	public void setCustomerInformation(CustomerInformation customerInformation) {
		this.customerInformation = customerInformation;
	}
	
}