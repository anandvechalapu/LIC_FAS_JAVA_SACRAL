import org.springframework.data.jpa.repository.JpaRepository;

public interface SaveStampPurchaseConfigurationRepository_STAMP_DUTY_12 extends JpaRepository<SaveStampPurchaseConfigurationEntity_STAMP_DUTY_12, Long> {

	// Method to save stamp purchase configuration data into the database
	SaveStampPurchaseConfigurationEntity_STAMP_DUTY_12 save(SaveStampPurchaseConfigurationEntity_STAMP_DUTY_12 saveStampPurchaseConfigurationEntity_STAMP_DUTY_12);
	
	// Method to find the stamp purchase configuration data from the database by purchaser unit code and policy stamp type ID
	SaveStampPurchaseConfigurationEntity_STAMP_DUTY_12 findByPurchaserUnitCodeAndPolicyStampTypeId(String purchaserUnitCode, Long policyStampTypeId);
	
	// Method to find the stamp purchase configuration data from the database by alert trigger mobile
	SaveStampPurchaseConfigurationEntity_STAMP_DUTY_12 findByAlertTriggerMobile(String alertTriggerMobile);
	
	// Method to find the stamp purchase configuration data from the database by alert trigger email
	SaveStampPurchaseConfigurationEntity_STAMP_DUTY_12 findByAlertTriggerEmail(String alertTriggerEmail);
	
	// Method to find the stamp purchase configuration data from the database by consumer units associated with the stamp purchase
	SaveStampPurchaseConfigurationEntity_STAMP_DUTY_12 findByConsumerUnits(String consumerUnits);
	
	// Method to find the stamp purchase configuration data from the database by active status of the stamp purchase
	SaveStampPurchaseConfigurationEntity_STAMP_DUTY_12 findByActiveStatus(String activeStatus);
	
	// Method to update the stamp purchase configuration data in the database
	SaveStampPurchaseConfigurationEntity_STAMP_DUTY_12 update(SaveStampPurchaseConfigurationEntity_STAMP_DUTY_12 saveStampPurchaseConfigurationEntity_STAMP_DUTY_12);
	
	// Method to delete the stamp purchase configuration data from the database
	void delete(SaveStampPurchaseConfigurationEntity_STAMP_DUTY_12 saveStampPurchaseConfigurationEntity_STAMP_DUTY_12);

}