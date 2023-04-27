package com.lic.epgs.stampduty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.stampduty.dto.StampDutyConsumptionRequestDto;
import com.lic.epgs.stampduty.model.StampDutyConsumptionRequest;
import com.lic.epgs.stampduty.service.StampDutyConsumptionService;

@RestController
public class StampDutyConsumptionController {
	
	@Autowired
	private StampDutyConsumptionService stampDutyConsumptionService;
	
	@PostMapping("/stampduty")
	public String consumeStampDuty(@RequestBody StampDutyConsumptionRequestDto stampDutyConsumptionRequestDto){
		String consumerUnitCode = stampDutyConsumptionRequestDto.getConsumerUnitCode();
		int stampAmount = stampDutyConsumptionRequestDto.getStampAmount();
		
		boolean isValidConsumerUnitCode = stampDutyConsumptionService.validateConsumerUnitCode(consumerUnitCode);
		
		if(isValidConsumerUnitCode){
			boolean isValidStampAmount = stampDutyConsumptionService.checkStampAmountAgainstBalance(consumerUnitCode, stampAmount);
			
			if(isValidStampAmount){
				stampDutyConsumptionService.updateStampDutyBalance(consumerUnitCode, stampAmount);
				return stampDutyConsumptionService.getResponse(true);
			}
		}
		
		return stampDutyConsumptionService.getResponse(false);
	}
}