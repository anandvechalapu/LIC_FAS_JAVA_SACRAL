package com.lic.epgs.lead.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.lead.service.SaveLmsLeadBasicDetailsLeadService;

@RestController
@RequestMapping("/save-lms-lead-basic-details-lead")
public class SaveLmsLeadBasicDetailsLeadController {
	
	@Autowired
	SaveLmsLeadBasicDetailsLeadService saveLmsLeadBasicDetailsLeadService;
	
	@PostMapping
	public ResponseEntity<Object> saveLmsLeadBasicDetails(@RequestBody String leadName, String lmsLeadNumber, String leadContactNumber, 
    String pan, String emailId, String customerCode, String customerName, String trustName, String product, 
    String subProduct, String lineOfBusiness, int numberOfLives, int premiumExpected, String unitOfficeId, 
    String moCode, String moName, String intermediaryCode, String intermediaryName, String intermediaryContactNumber, 
    String leadSourceType, String leadSourceName) {
		return saveLmsLeadBasicDetailsLeadService.saveLmsLeadBasicDetails(leadName, lmsLeadNumber, leadContactNumber,
				pan, emailId, customerCode, customerName, trustName, product, subProduct, lineOfBusiness, numberOfLives,
				premiumExpected, unitOfficeId, moCode, moName, intermediaryCode, intermediaryName,
				intermediaryContactNumber, leadSourceType, leadSourceName);
	}

}