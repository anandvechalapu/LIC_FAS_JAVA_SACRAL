package com.lic.epgs.customer.customermakercontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.customer.customermakercontroller.dto.CommonResponseDto;
import com.lic.epgs.customer.customermakercontroller.dto.DocumentDetailsDto;
import com.lic.epgs.customer.customermakercontroller.service.AddCustomerDocumentDetails_CustomerMakerControllerService;

@RestController
@RequestMapping("/customerMakerController/documentDetails")
public class AddCustomerDocumentDetails_CustomerMakerController {

	@Autowired
	private AddCustomerDocumentDetails_CustomerMakerControllerService addCustomerDocumentDetails_CustomerMakerControllerService;

	@GetMapping("/{customerId}")
	public Long findDocumentIdByCustomerId(@PathVariable("customerId") Long customerId) {
		return addCustomerDocumentDetails_CustomerMakerControllerService.findDocumentIdByCustomerId(customerId);
	}

	@PostMapping("/updateDocumentDetails")
	public void updateDocumentDetailsByDocumentId(@RequestBody DocumentDetailsDto documentDetailsDto) {
		addCustomerDocumentDetails_CustomerMakerControllerService.updateDocumentDetailsByDocumentId(documentDetailsDto.getDocumentName(),
				documentDetailsDto.getDocumentNumber(), documentDetailsDto.getDocumentType(), documentDetailsDto.getDocumentExpiryDate(),
				documentDetailsDto.getDocumentId());
	}

	@PostMapping("/saveDocumentDetails")
	public DocumentDetailsDto saveDocumentDetails(@RequestBody DocumentDetailsDto documentDetailsDto) {
		return addCustomerDocumentDetails_CustomerMakerControllerService.saveDocumentDetails(documentDetailsDto);
	}

	@GetMapping("/getDocumentDetails/{documentId}")
	public CommonResponseDto getDocumentDetails(@PathVariable("documentId") Long documentId) {
		return addCustomerDocumentDetails_CustomerMakerControllerService.getDocumentDetails(documentId);
	}

}