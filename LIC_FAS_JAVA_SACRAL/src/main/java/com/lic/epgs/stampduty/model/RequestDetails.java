package com.lic.epgs.stampduty.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RequestDetails {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String requestId;
    private String status;
    private String workflowStatus;
    private String modifiedBy;
    private List<StampDutyConsumerUnit> stampDutyConsumerUnits;
    private Response response;
    private String message;
    private String transactionStatus;
    private String error;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getRequestId() {
        return requestId;
    }
    
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getWorkflowStatus() {
        return workflowStatus;
    }
    
    public void setWorkflowStatus(String workflowStatus) {
        this.workflowStatus = workflowStatus;
    }
    
    public String getModifiedBy() {
        return modifiedBy;
    }
    
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }
    
    public List<StampDutyConsumerUnit> getStampDutyConsumerUnits() {
        return stampDutyConsumerUnits;
    }
    
    public void setStampDutyConsumerUnits(List<StampDutyConsumerUnit> stampDutyConsumerUnits) {
        this.stampDutyConsumerUnits = stampDutyConsumerUnits;
    }
    
    public Response getResponse() {
        return response;
    }
    
    public void setResponse(Response response) {
        this.response = response;
    }
    
    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    
    public String getTransactionStatus() {
        return transactionStatus;
    }
    
    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }
    
    public String getError() {
        return error;
    }
    
    public void setError(String error) {
        this.error = error;
    }
    
}