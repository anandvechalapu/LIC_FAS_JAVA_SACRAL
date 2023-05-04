package com.lic.epgs.subcustomer.subcustomermakercontroller.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.subcustomer.subcustomermakercontroller.model.SubCustomerMakerController;
import com.lic.epgs.subcustomer.subcustomermakercontroller.repository.SubCustomerMakerControllerRepository;

@Service
public class SubCustomerMakerControllerService {

	@Autowired
	private SubCustomerMakerControllerRepository subCustomerMakerControllerRepository;

	// method to send sub-customer to checker for approval
	public void sendForApproval_SUB_CUSTOMER_MAKER_CONTROLLER(SubCustomerMakerController subCustomerMakerController) {
		subCustomerMakerControllerRepository.save(subCustomerMakerController);
	}

	// method to provide sub-customer details
	public void provideSubCustomerDetails(Long id, String status, String workflowStatus) {
		Optional<SubCustomerMakerController> subCustomerMakerController = subCustomerMakerControllerRepository
				.findById(id);
		if (subCustomerMakerController.isPresent()) {
			SubCustomerMakerController subCustomerMakerController1 = subCustomerMakerController.get();
			subCustomerMakerController1.setStatus(status);
			subCustomerMakerController1.setWorkflowStatus(workflowStatus);
			subCustomerMakerControllerRepository.save(subCustomerMakerController1);
		}
	}

	// method to update sub-customer mapped details
	public void updateMappedDetails(SubCustomerMakerController subCustomerMakerController) {
		subCustomerMakerControllerRepository.save(subCustomerMakerController);
	}

	// method to provide feedback on success or failure of operation
	public void provideFeedback(Boolean success) {
		if (success) {
			System.out.println("Operation successful");
		} else {
			System.out.println("Operation failed");
		}
	}
}