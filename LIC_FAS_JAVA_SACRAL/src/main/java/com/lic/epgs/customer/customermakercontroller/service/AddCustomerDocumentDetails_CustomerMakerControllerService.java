package com.lic.epgs.customer.customermakercontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.customer.customermakercontroller.dto.DocumentDetailsDto;
import com.lic.epgs.customer.customermakercontroller.dto.CommonResponseDto;
import com.lic.epgs.customer.customermakercontroller.repository.AddCustomerDocumentDetails_CustomerMakerControllerRepository;

@Service
public class AddCustomerDocumentDetails_CustomerMakerControllerService {
	
	@Autowired
	private AddCustomerDocumentDetails_CustomerMakerControllerRepository addCustomerDocumentDetails_CustomerMakerControllerRepository;
	
	public Long findDocumentIdByCustomerId(Long customerId) {
		return addCustomerDocumentDetails_CustomerMakerControllerRepository.findDocumentIdByCustomerId(customerId);
	}
	
	public void updateDocumentDetailsByDocumentId(String documentName, String documentNumber, String documentType, String documentExpiryDate, Long documentId) {
		addCustomerDocumentDetails_CustomerMakerControllerRepository.updateDocumentDetailsByDocumentId(documentName, documentNumber, documentType, documentExpiryDate, documentId);
	}
	
	public DocumentDetailsDto saveDocumentDetails(DocumentDetailsDto documentDetailsDto) {
		return addCustomerDocumentDetails_CustomerMakerControllerRepository.save(documentDetailsDto);
	}
	
	public CommonResponseDto getDocumentDetails(Long documentId) {
		return addCustomerDocumentDetails_CustomerMakerControllerRepository.getDocumentDetails(documentId);
	}
	
}