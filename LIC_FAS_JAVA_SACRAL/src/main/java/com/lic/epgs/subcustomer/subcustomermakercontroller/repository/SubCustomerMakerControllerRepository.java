import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.subcustomer.subcustomermakercontroller.model.SubCustomerMakerController;

@Repository
public interface SubCustomerMakerControllerRepository extends JpaRepository<SubCustomerMakerController, Long> {
	
	// method to send sub-customer to checker for approval
	void sendforApproval_SUB_CUSTOMER_MAKER_CONTROLLER(SubCustomerMakerController subCustomerMakerController);
	
	// method to provide sub-customer details
	void provideSubCustomerDetails(Long id, String status, String workflowStatus);
	
	// method to update sub-customer mapped details
	void updateMappedDetails(SubCustomerMakerController subCustomerMakerController);
	
	// method to provide feedback on success or failure of operation
	void provideFeedback(Boolean success);
	
}