package com.lic.epgs.stampduty.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.stampduty.dto.StampDutyConsumptionRequestDto;

@Repository
public interface StampDutyConsumptionRepository extends JpaRepository<StampDutyConsumptionRequestDto, Long> {
	
	// Method to validate the provided Consumer Unit Code
	boolean validateConsumerUnitCode(String consumerUnitCode);
	
	// Method to check the provided stamp amount against the balance of the Stamp Duty associated with the provided Consumer Unit Code
	boolean checkStampAmountAgainstBalance(String consumerUnitCode, int stampAmount);
	
	// Method to update the balance of the Stamp Duty associated with the provided Consumer Unit Code
	void updateStampDutyBalance(String consumerUnitCode, int stampAmount);
	
	// Method to return the balance of the Stamp Duty associated with the provided Consumer Unit Code
	int getStampDutyBalance(String consumerUnitCode);
	
	// Method to return a response of either "Success" or "Failure"
	String getResponse(boolean isSuccess);
}