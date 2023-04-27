package com.lic.epgs.stampduty.service;

import com.lic.epgs.stampduty.dto.RequestDetails;
import com.lic.epgs.stampduty.dto.Response;
import com.lic.epgs.stampduty.entity.StampDutyConsumerUnit;
import com.lic.epgs.stampduty.repository.ApproveStampDutyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class ApproveStampDutyService {

    @Autowired
    private ApproveStampDutyRepository approveStampDutyRepository;

    /**
     * Post mapping request body for submitting stamp duty request details
     * @param requestDetails
     */
    public void submitStampDutyRequest(RequestDetails requestDetails){
        approveStampDutyRepository.submitStampDutyRequest(requestDetails);
    }

    /**
     * Validate stamp duty request ID
     * @param requestId
     * @return true/false
     */
    public boolean validateStampDutyRequestID(String requestId){
        return approveStampDutyRepository.validateStampDutyRequestID(requestId);
    }

    /**
     * Update stamp duty status, workflow status, and modified by details
     * @param status
     * @param workflowStatus
     * @param modifiedBy
     */
    public void updateStampDutyStatus(String status, String workflowStatus, String modifiedBy){
        approveStampDutyRepository.updateStampDutyStatus(status, workflowStatus, modifiedBy);
    }

    /**
     * Copy stamp duty details from temporary table to stamp duty table
     */
    public void copyStampDutyDetails(){
        approveStampDutyRepository.copyStampDutyDetails();
    }

    /**
     * Create and save list of stamp duty consumer units
     * @param stampDutyConsumerUnits
     */
    public void saveStampDutyConsumerUnits(List<StampDutyConsumerUnit> stampDutyConsumerUnits){
        approveStampDutyRepository.saveStampDutyConsumerUnits(stampDutyConsumerUnits);
    }

    /**
     * Generate response with updated stamp duty details
     * @return response
     */
    public Response generateResponse(){
        return approveStampDutyRepository.generateResponse();
    }

    /**
     * Generate response message and transaction status
     * @param message
     * @param status
     */
    public void generateResponseMessageAndTransactionStatus(String message, String status){
        approveStampDutyRepository.generateResponseMessageAndTransactionStatus(message, status);
    }

    /**
     * Log all errors
     * @param error
     */
    public void logError(String error){
        approveStampDutyRepository.logError(error);
    }

}