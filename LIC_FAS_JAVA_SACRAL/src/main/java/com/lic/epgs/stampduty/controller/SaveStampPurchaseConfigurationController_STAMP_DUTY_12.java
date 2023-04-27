package com.lic.epgs.stampduty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.stampduty.entity.SaveStampPurchaseConfigurationEntity_STAMP_DUTY_12;
import com.lic.epgs.stampduty.service.SaveStampPurchaseConfigurationService_STAMP_DUTY_12;

@RestController
@RequestMapping("/stampduty/save")
public class SaveStampPurchaseConfigurationController_STAMP_DUTY_12 {

	@Autowired
	private SaveStampPurchaseConfigurationService_STAMP_DUTY_12 saveStampPurchaseConfigurationService_STAMP_DUTY_12;
	
	// Controller method to save stamp purchase configuration data
	@PostMapping
	public SaveStampPurchaseConfigurationEntity_STAMP_DUTY_12 save(@RequestBody SaveStampPurchaseConfigurationEntity_STAMP_DUTY_12 saveStampPurchaseConfigurationEntity_STAMP_DUTY_12) {
		return saveStampPurchaseConfigurationService_STAMP_DUTY_12.save(saveStampPurchaseConfigurationEntity_STAMP_DUTY_12);
	}
	
	// Controller method to update stamp purchase configuration data
	@PutMapping
	public SaveStampPurchaseConfigurationEntity_STAMP_DUTY_12 update(@RequestBody SaveStampPurchaseConfigurationEntity_STAMP_DUTY_12 saveStampPurchaseConfigurationEntity_STAMP_DUTY_12) {
		return saveStampPurchaseConfigurationService_STAMP_DUTY_12.update(saveStampPurchaseConfigurationEntity_STAMP_DUTY_12);
	}
	
}