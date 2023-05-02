package com.lic.epgs.group.groupcustomercheckercontroller.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "group_customer_basic_details")
public class GroupCustomerBasicDetailsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "group_customer_id")
	private Long groupCustomerId;
	
	@Column(name = "group_code")
	private String groupCode;
	
	@Column(name = "group_status")
	private String groupStatus;
	
	@Column(name = "workflow_status")
	private String workflowStatus;
	
	@Column(name = "temp_group_customer_id")
	private Long tempGroupCustomerId;

	public Long getGroupCustomerId() {
		return groupCustomerId;
	}

	public void setGroupCustomerId(Long groupCustomerId) {
		this.groupCustomerId = groupCustomerId;
	}

	public String getGroupCode() {
		return groupCode;
	}

	public void setGroupCode(String groupCode) {
		this.groupCode = groupCode;
	}

	public String getGroupStatus() {
		return groupStatus;
	}

	public void setGroupStatus(String groupStatus) {
		this.groupStatus = groupStatus;
	}

	public String getWorkflowStatus() {
		return workflowStatus;
	}

	public void setWorkflowStatus(String workflowStatus) {
		this.workflowStatus = workflowStatus;
	}

	public Long getTempGroupCustomerId() {
		return tempGroupCustomerId;
	}

	public void setTempGroupCustomerId(Long tempGroupCustomerId) {
		this.tempGroupCustomerId = tempGroupCustomerId;
	}
}