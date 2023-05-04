package com.lic.epgs.trust.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.trust.model.TrustData;
import com.lic.epgs.trust.service.TrustManagementService;

@RestController
@RequestMapping("/trust")
public class TrustManagementController {

	@Autowired
	TrustManagementService trustManagementService;
	
	@GetMapping("/byInactiveStatus")
	public TrustData getTrustDataByInactiveStatus(@RequestParam(value = "inactiveStatus") Boolean inactiveStatus) {
		return trustManagementService.findByInactiveStatus(inactiveStatus);
	}
	
	@GetMapping("/byPendingForModification")
	public TrustData getTrustDataByPendingForModification(@RequestParam(value = "pendingForModification") Boolean pendingForModification) {
		return trustManagementService.findByPendingForModification(pendingForModification);
	}
	
	@GetMapping("/byBankDetailsAndContactDetailsAndAddressDetailsAndDocumentDetails")
	public TrustData getTrustDataByBankDetailsAndContactDetailsAndAddressDetailsAndDocumentDetails(@RequestParam(value = "bankAccountDetails") String bankAccountDetails, 
			@RequestParam(value = "contactDetails") String contactDetails, 
			@RequestParam(value = "addressDetails") String addressDetails,
			@RequestParam(value = "documentDetails") String documentDetails) {
		return trustManagementService.findByBankAccountDetailsAndContactDetailsAndAddressDetailsAndDocumentDetails(bankAccountDetails, contactDetails, addressDetails, documentDetails);
	}
	
	@GetMapping("/byModifiedByUserAndModifiedOnDate")
	public TrustData getTrustDataByModifiedByUserAndModifiedOnDate(@RequestParam(value = "modifiedByUser") String modifiedByUser,
			@RequestParam(value = "modifiedOnDate") String modifiedOnDate) {
		return trustManagementService.findByModifiedByUserAndModifiedOnDate(modifiedByUser, modifiedOnDate);
	}
	
	@GetMapping("/sendToMaker")
	public String sendTrustDataToMaker(TrustData trustData) {
		trustManagementService.sendTrustDataToMaker(trustData);
		return trustManagementService.getSuccessMessage();
	}
	
	@GetMapping("/getAllTrustData")
	public List<TrustData> getAllTrustData() {
		return trustManagementService.getAllTrustData();
	}
}