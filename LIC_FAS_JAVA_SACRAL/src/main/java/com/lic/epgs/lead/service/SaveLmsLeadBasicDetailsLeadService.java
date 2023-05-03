package com.lic.epgs.lead.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.lic.epgs.lead.repository.SaveLmsLeadBasicDetailsLeadRepository;

@Service
public class SaveLmsLeadBasicDetailsLeadService {
	
	@Autowired
	SaveLmsLeadBasicDetailsLeadRepository saveLmsLeadBasicDetailsLeadRepository;
	
	public ResponseEntity<Object> saveLmsLeadBasicDetails(String leadName, String lmsLeadNumber, String leadContactNumber, 
    String pan, String emailId, String customerCode, String customerName, String trustName, String product, 
    String subProduct, String lineOfBusiness, int numberOfLives, int premiumExpected, String unitOfficeId, 
    String moCode, String moName, String intermediaryCode, String intermediaryName, String intermediaryContactNumber, 
    String leadSourceType, String leadSourceName) {
		return saveLmsLeadBasicDetailsLeadRepository.saveLmsLeadBasicDetails(leadName, lmsLeadNumber, leadContactNumber,
				pan, emailId, customerCode, customerName, trustName, product, subProduct, lineOfBusiness, numberOfLives,
				premiumExpected, unitOfficeId, moCode, moName, intermediaryCode, intermediaryName,
				intermediaryContactNumber, leadSourceType, leadSourceName);
	}

}