package com.lic.epgs.group.groupcustomerdetailscontroller.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GroupCustomerDetailsController {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String groupName;
	
	private String customerName;
	
	private String customerNumber;
	
	public GroupCustomerDetailsController() {
		
	}
	
	public GroupCustomerDetailsController(String groupName, String customerName, String customerNumber) {
		this.groupName = groupName;
		this.customerName = customerName;
		this.customerNumber = customerNumber;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	
	
}