package com.lic.epgs.customer.customermakercontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.customer.customermakercontroller.model.RemoveDocumentCustomerMakerControllerModel;
import com.lic.epgs.customer.customermakercontroller.service.RemoveDocumentCustomerMakerControllerService;

@RestController
public class RemoveDocumentCustomerMakerController {
	
	@Autowired
	RemoveDocumentCustomerMakerControllerService removeDocumentCustomerMakerControllerService;
	
	@RequestMapping(value = "/removeDocumentCustomerMakerController", method = RequestMethod.POST)
	public ResponseEntity<?> removeDocumentCustomerMakerController(@RequestBody RemoveDocumentCustomerMakerControllerModel removeDocumentCustomerMakerControllerModel) {
		return removeDocumentCustomerMakerControllerService.removeDocument(removeDocumentCustomerMakerControllerModel.getDocumentId(), removeDocumentCustomerMakerControllerModel.getCustomerId());
	}

}