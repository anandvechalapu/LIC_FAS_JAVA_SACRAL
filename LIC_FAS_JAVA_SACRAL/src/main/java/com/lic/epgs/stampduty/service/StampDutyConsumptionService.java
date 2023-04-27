package com.lic.epgs.stampduty.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.stampduty.dto.StampDutyConsumptionRequestDto;
import com.lic.epgs.stampduty.repository.StampDutyConsumptionRepository;

@Service
public class StampDutyConsumptionService {
	
	@Autowired
	private StampDutyConsumptionRepository stampDutyConsumptionRepository;
	
	// Method to validate the provided Consumer Unit Code
	public boolean validateConsumerUnitCode(String consumerUnitCode) {
		return stampDutyConsumptionRepository.validateConsumerUnitCode(consumerUnitCode);
	}
	
	// Method to check the provided stamp amount against the balance of the Stamp Duty associated with the provided Consumer Unit Code
	public boolean checkStampAmountAgainstBalance(String consumerUnitCode, int stampAmount) {
		return stampDutyConsumptionRepository.checkStampAmountAgainstBalance(consumerUnitCode, stampAmount);
	}
	
	// Method to update the balance of the Stamp Duty associated with the provided Consumer Unit Code
	public void updateStampDutyBalance(String consumerUnitCode, int stampAmount) {
		stampDutyConsumptionRepository.updateStampDutyBalance(consumerUnitCode, stampAmount);
	}
	
	// Method to return the balance of the Stamp Duty associated with the provided Consumer Unit Code
	public int getStampDutyBalance(String consumerUnitCode) {
		return stampDutyConsumptionRepository.getStampDutyBalance(consumerUnitCode);
	}
	
	// Method to return a response of either "Success" or "Failure"
	public String getResponse(boolean isSuccess) {
		return stampDutyConsumptionRepository.getResponse(isSuccess);
	}
}