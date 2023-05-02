package com.lic.epgs.customer.customercheckercontroller.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.customer.customercheckercontroller.model.CommonResponseDto;
import com.lic.epgs.customer.customercheckercontroller.repository.SendToMaker_CustomerCheckerControllerRepository;

@Service
public class SendToMaker_CustomerCheckerControllerService {
	
	@Autowired
	SendToMaker_CustomerCheckerControllerRepository sendToMaker_CustomerCheckerControllerRepository;
	
	public CommonResponseDto setFlagInactive(Long customerId){
		sendToMaker_CustomerCheckerControllerRepository.setFlagInactive(customerId);
		return new CommonResponseDto("success", "Flag Inactive set successfully");
	}
	
	public CommonResponseDto createNewCustomer(String customerName){
		sendToMaker_CustomerCheckerControllerRepository.createNewCustomer(customerName);
		return new CommonResponseDto("success", "Customer created successfully");
	}
	
	public Optional<CommonResponseDto> getCustomer(Long customerId){
		return sendToMaker_CustomerCheckerControllerRepository.findById(customerId);
	}

}