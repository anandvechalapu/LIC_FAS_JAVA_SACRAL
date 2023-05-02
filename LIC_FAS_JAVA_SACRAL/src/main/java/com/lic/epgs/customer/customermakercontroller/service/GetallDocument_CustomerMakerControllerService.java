package com.lic.epgs.customer.customermakercontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.customer.customermakercontroller.model.Document;
import com.lic.epgs.customer.customermakercontroller.repository.GetallDocument_CustomerMakerControllerRepository;

@Service
public class GetallDocument_CustomerMakerControllerService {
	
	@Autowired
	GetallDocument_CustomerMakerControllerRepository getallDocument_CustomerMakerControllerRepository;
	
	public List<Document> findByCustomerId(Long customerId) {
		return getallDocument_CustomerMakerControllerRepository.findByCustomerId(customerId);
	}

}