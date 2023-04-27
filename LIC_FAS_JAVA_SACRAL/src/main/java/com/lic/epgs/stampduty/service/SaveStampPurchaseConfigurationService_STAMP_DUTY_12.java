package com.lic.epgs.stampduty.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.stampduty.entity.SaveStampPurchaseConfigurationEntity_STAMP_DUTY_12;
import com.lic.epgs.stampduty.repository.SaveStampPurchaseConfigurationRepository_STAMP_DUTY_12;

@Service
public class SaveStampPurchaseConfigurationService_STAMP_DUTY_12 {

	@Autowired
	private SaveStampPurchaseConfigurationRepository_STAMP_DUTY_12 saveStampPurchaseConfigurationRepository_STAMP_DUTY_12;
	
	// Method to save stamp purchase configuration data into the database
	public SaveStampPurchaseConfigurationEntity_STAMP_DUTY_12 save(SaveStampPurchaseConfigurationEntity_STAMP_DUTY_12 saveStampPurchaseConfigurationEntity_STAMP_DUTY_12) {
		return saveStampPurchaseConfigurationRepository_STAMP_DUTY_12.save(saveStampPurchaseConfigurationEntity_STAMP_DUTY_12);
	}
	
	// Method to find the stamp purchase configuration data from the database by purchaser unit code and policy stamp type ID
	public SaveStampPurchaseConfigurationEntity_STAMP_DUTY_12 findByPurchaserUnitCodeAndPolicyStampTypeId(String purchaserUnitCode, Long policyStampTypeId) {
		return saveStampPurchaseConfigurationRepository_STAMP_DUTY_12.findByPurchaserUnitCodeAndPolicyStampTypeId(purchaserUnitCode, policyStampTypeId);
	}
	
	// Method to find the stamp purchase configuration data from the database by alert trigger mobile
	public SaveStampPurchaseConfigurationEntity_STAMP_DUTY_12 findByAlertTriggerMobile(String alertTriggerMobile) {
		return saveStampPurchaseConfigurationRepository_STAMP_DUTY_12.findByAlertTriggerMobile(alertTriggerMobile);
	}
	
	// Method to find the stamp purchase configuration data from the database by alert trigger email
	public SaveStampPurchaseConfigurationEntity_STAMP_DUTY_12 findByAlertTriggerEmail(String alertTriggerEmail) {
		return saveStampPurchaseConfigurationRepository_STAMP_DUTY_12.findByAlertTriggerEmail(alertTriggerEmail);
	}
	
	// Method to find the stamp purchase configuration data from the database by consumer units associated with the stamp purchase
	public SaveStampPurchaseConfigurationEntity_STAMP_DUTY_12 findByConsumerUnits(String consumerUnits) {
		return saveStampPurchaseConfigurationRepository_STAMP_DUTY_12.findByConsumerUnits(consumerUnits);
	}
	
	// Method to find the stamp purchase configuration data from the database by active status of the stamp purchase
	public SaveStampPurchaseConfigurationEntity_STAMP_DUTY_12 findByActiveStatus(String activeStatus) {
		return saveStampPurchaseConfigurationRepository_STAMP_DUTY_12.findByActiveStatus(activeStatus);
	}
	
	// Method to update the stamp purchase configuration data in the database
	public SaveStampPurchaseConfigurationEntity_STAMP_DUTY_12 update(SaveStampPurchaseConfigurationEntity_STAMP_DUTY_12 saveStampPurchaseConfigurationEntity_STAMP_DUTY_12) {
		return saveStampPurchaseConfigurationRepository_STAMP_DUTY_12.update(saveStampPurchaseConfigurationEntity_STAMP_DUTY_12);
	}
	
	// Method to delete the stamp purchase configuration data from the database
	public void delete(SaveStampPurchaseConfigurationEntity_STAMP_DUTY_12 saveStampPurchaseConfigurationEntity_STAMP_DUTY_12) {
		saveStampPurchaseConfigurationRepository_STAMP_DUTY_12.delete(saveStampPurchaseConfigurationEntity_STAMP_DUTY_12);
	}

}