package com.lic.epgs.subcustomer.subcustomermakercontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.subcustomer.subcustomermakercontroller.model.SubCustomerMakerController;
import com.lic.epgs.subcustomer.subcustomermakercontroller.service.SubCustomerMakerControllerService;

@RestController
@RequestMapping("/sub-customer-maker-controller")
public class SubCustomerMakerControllerController {

	@Autowired
	private SubCustomerMakerControllerService subCustomerMakerControllerService;
	
	@PostMapping("/sendForApproval")
	public void sendForApproval(@RequestBody SubCustomerMakerController subCustomerMakerController) {
		subCustomerMakerControllerService.sendForApproval_SUB_CUSTOMER_MAKER_CONTROLLER(subCustomerMakerController);
	}
	
	@PostMapping("/provideSubCustomerDetails")
	public void provideSubCustomerDetails(Long id, String status, String workflowStatus) {
		subCustomerMakerControllerService.provideSubCustomerDetails(id, status, workflowStatus);
	}
	
	@PostMapping("/updateMappedDetails")
	public void updateMappedDetails(@RequestBody SubCustomerMakerController subCustomerMakerController) {
		subCustomerMakerControllerService.updateMappedDetails(subCustomerMakerController);
	}
	
	@PostMapping("/provideFeedback")
	public void provideFeedback(Boolean success) {
		subCustomerMakerControllerService.provideFeedback(success);
	}
	
}