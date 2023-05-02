package com.lic.epgs.customer.customermakercontroller.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.lic.epgs.customer.customermakercontroller.repository.RemoveDocumentCustomerMakerControllerRepository;

@Service
public class RemoveDocumentCustomerMakerControllerService {
	
	@Autowired
	private RemoveDocumentCustomerMakerControllerRepository removeDocumentCustomerMakerControllerRepository;
	
	public ResponseEntity<?> removeDocument(Long documentId, Long customerId) {
		Optional<ResponseEntity<?>> responseEntity = Optional.of(removeDocumentCustomerMakerControllerRepository.removeDocument(documentId, customerId));
		return responseEntity.get();
	}
}