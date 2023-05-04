package com.lic.epgs.trust.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.trust.model.Trust;
import com.lic.epgs.trust.repository.SendForApprovalTrustRepository;
import com.lic.epgs.trust.service.SendForApprovalTrustService;

@RestController
@RequestMapping("/trust")
public class SendForApprovalTrustController {

	@Autowired
	SendForApprovalTrustService trustService;
	
	@PostMapping("/findTrustById")
	public Trust findByTrustId(@RequestBody Long trustId) {
		return trustService.findByTrustId(trustId);
	}
	
	@PostMapping("/saveTrust")
	public Trust save(@RequestBody Trust trust) {
		return trustService.save(trust);
	}
	
	@PostMapping("/removeTrustById")
	public void removeByTrustId(@RequestBody Long trustId) {
		trustService.removeByTrustId(trustId);
	}
	
	@PostMapping("/updateTrustStatus")
	public void updateTrustStatus(@RequestBody Long trustId, @RequestBody String status) {
		trustService.updateTrustStatus(trustId, status);
	}
	
	@PostMapping("/sendTrustToApprover")
	public void sendTrustToApprover(@RequestBody Long trustId) {
		trustService.sendTrustToApprover(trustId);
	}
	
	@PostMapping("/saveTrustDetails")
	public void saveTrustDetails(@RequestBody Long trustId, @RequestBody String bankAccountDetails, @RequestBody String contactDetails, 
			@RequestBody String addressDetails, @RequestBody String trustNotes) {
		trustService.saveTrustDetails(trustId, bankAccountDetails, contactDetails, addressDetails, trustNotes);
	}
	
}