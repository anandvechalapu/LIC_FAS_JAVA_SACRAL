package com.lic.epgs.customer.customermakercontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.customer.customermakercontroller.model.Document;
import com.lic.epgs.customer.customermakercontroller.service.GetallDocument_CustomerMakerControllerService;

@RestController
public class GetallDocument_CustomerMakerController {

	@Autowired
	GetallDocument_CustomerMakerControllerService getallDocument_CustomerMakerControllerService;
	
	@GetMapping("/customer/{customerId}/documents")
	public ResponseEntity<List<Document>> getDocumentsByCustomerId(@PathVariable Long customerId) {
		List<Document> documents = getallDocument_CustomerMakerControllerService.findByCustomerId(customerId);
		if(documents.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(documents, HttpStatus.OK);
	}
	
}