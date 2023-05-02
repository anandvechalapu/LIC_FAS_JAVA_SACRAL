package com.lic.epgs.group.groupcustomerdetailscontroller.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "group_customer")
public class GroupCustomer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "group_customer_id")
	private Long groupCustomerId;
	
	@Column(name = "group_id")
	private Long groupId;
	
	@Column(name = "customer_id")
	private Long customerId;
	
	@Column(name = "status_flag")
	private String statusFlag;
	
	@Column(name = "modified_by")
	private Long modifiedBy;
	
	@Column(name = "modified_on")
	private Long modifiedOn;
	
	@Column(name = "defunct_flag")
	private String defunctFlag;
	
	@Column(name = "active_flag")
	private String activeFlag;

	public Long getGroupCustomerId() {
		return groupCustomerId;
	}

	public void setGroupCustomerId(Long groupCustomerId) {
		this.groupCustomerId = groupCustomerId;
	}

	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getStatusFlag() {
		return statusFlag;
	}

	public void setStatusFlag(String statusFlag) {
		this.statusFlag = statusFlag;
	}

	public Long getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(Long modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Long getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Long modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public String getDefunctFlag() {
		return defunctFlag;
	}

	public void setDefunctFlag(String defunctFlag) {
		this.defunctFlag = defunctFlag;
	}

	public String getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}
	
	
}