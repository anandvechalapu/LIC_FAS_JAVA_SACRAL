package com.lic.epgs.group.groupcustomerdetailscontroller.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GROUP_CUSTOMER_DETAILS_CONTROLLER")
public class GroupCustomerDetailsController implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GROUP_ID")
    private Long groupId;

    @Column(name = "GROUP_NAME")
    private String groupName;

    @Column(name = "GROUP_CODE")
    private String groupCode;

    @Column(name = "GROUP_STATUS")
    private String groupStatus;

    @Column(name = "WORKFLOW_STATUS")
    private String workflowStatus;

    @Column(name = "PAGE_COUNT")
    private Integer pageCount;

    @Column(name = "LIMIT")
    private Integer limit;

    @Column(name = "START_DATE")
    private Date startDate;

    @Column(name = "END_DATE")
    private Date endDate;

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
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

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

}