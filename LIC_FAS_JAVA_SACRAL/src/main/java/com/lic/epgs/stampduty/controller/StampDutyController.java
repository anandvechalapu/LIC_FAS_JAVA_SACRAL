package com.lic.epgs.stampduty.controller;

import com.lic.epgs.stampduty.dto.RequestDetails;
import com.lic.epgs.stampduty.dto.Response;
import com.lic.epgs.stampduty.entity.StampDutyConsumerUnit;
import com.lic.epgs.stampduty.service.ApproveStampDutyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stampduty")
public class StampDutyController {

    @Autowired
    private ApproveStampDutyService approveStampDutyService;

    /**
     * Post mapping request body for submitting stamp duty request details
     * @param requestDetails
     */
    @PostMapping("/submitStampDutyRequest")
    public void submitStampDutyRequest(@RequestBody RequestDetails requestDetails){
        approveStampDutyService.submitStampDutyRequest(requestDetails);
    }

    /**
     * Validate stamp duty request ID
     * @param requestId
     * @return true/false
     */
    @GetMapping("/validateStampDutyRequestID")
    public boolean validateStampDutyRequestID(@RequestParam String requestId){
        return approveStampDutyService.validateStampDutyRequestID(requestId);
    }

    /**
     * Update stamp duty status, workflow status, and modified by details
     * @param status
     * @param workflowStatus
     * @param modifiedBy
     */
    @PutMapping("/updateStampDutyStatus")
    public void updateStampDutyStatus(@RequestParam String status, @RequestParam String workflowStatus, @RequestParam String modifiedBy){
        approveStampDutyService.updateStampDutyStatus(status, workflowStatus, modifiedBy);
    }

    /**
     * Copy stamp duty details from temporary table to stamp duty table
     */
    @PostMapping("/copyStampDutyDetails")
    public void copyStampDutyDetails(){
        approveStampDutyService.copyStampDutyDetails();
    }

    /**
     * Create and save list of stamp duty consumer units
     * @param stampDutyConsumerUnits
     */
    @PostMapping("/saveStampDutyConsumerUnits")
    public void saveStampDutyConsumerUnits(@RequestBody List<StampDutyConsumerUnit> stampDutyConsumerUnits){
        approveStampDutyService.saveStampDutyConsumerUnits(stampDutyConsumerUnits);
    }

    /**
     * Generate response with updated stamp duty details
     * @return response
     */
    @GetMapping("/generateResponse")
    public Response generateResponse(){
        return approveStampDutyService.generateResponse();
    }

    /**
     * Generate response message and transaction status
     * @param message
     * @param status
     */
    @PutMapping("/generateResponseMessageAndTransactionStatus")
    public void generateResponseMessageAndTransactionStatus(@RequestParam String message, @RequestParam String status){
        approveStampDutyService.generateResponseMessageAndTransactionStatus(message, status);
    }

    /**
     * Log all errors
     * @param error
     */
    @PostMapping("/logError")
    public void logError(@RequestParam String error){
        approveStampDutyService.logError(error);
    }

}