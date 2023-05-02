package com.lic.epgs.customer.customercheckercontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.customer.customercheckercontroller.model.CommonResponseDto;
import com.lic.epgs.customer.customercheckercontroller.service.SendToMaker_CustomerCheckerControllerService;

@RestController
@RequestMapping("/customer")
public class SendToMaker_CustomerCheckerController {
	
	@Autowired
	SendToMaker_CustomerCheckerControllerService sendToMaker_CustomerCheckerControllerService;
	
	@GetMapping("/{customerId}")
	public CommonResponseDto getCustomer(@PathVariable Long customerId) {
		return sendToMaker_CustomerCheckerControllerService.getCustomer(customerId).orElse(new CommonResponseDto("failure", "Customer not found"));
	}
	
	@PostMapping("/create")
	public CommonResponseDto createNewCustomer(@RequestBody String customerName) {
		return sendToMaker_CustomerCheckerControllerService.createNewCustomer(customerName);
	}
	
	@PostMapping("/{customerId}/inactive")
	public CommonResponseDto setFlagInactive(@PathVariable Long customerId) {
		return sendToMaker_CustomerCheckerControllerService.setFlagInactive(customerId);
	}

}