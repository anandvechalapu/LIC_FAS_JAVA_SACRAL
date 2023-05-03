package com.lic.epgs.lead.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.lead.model.Lead;
import com.lic.epgs.lead.service.ActivateLead_LeadService;

@RestController
@RequestMapping("/lead")
public class ActivateLead_LeadController {

	@Autowired
	private ActivateLead_LeadService service;
	
	@GetMapping("/{id}")
	public ResponseEntity<Lead> getLeadById(@PathVariable Long id) {
		Lead lead = service.getLeadById(id);
		return new ResponseEntity<Lead>(lead, HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<Lead> saveLead(@RequestBody Lead lead) {
		Lead savedLead = service.saveLead(lead);
		return new ResponseEntity<Lead>(savedLead, HttpStatus.OK);
	}
	
	@PostMapping("/update/{id}")
	public ResponseEntity<Lead> updateLeadById(@PathVariable Long id, @RequestBody Map<String, String> body) {
		String modifiedBy = body.get("modifiedBy");
		String leadStatus = body.get("leadStatus");
		Lead updatedLead = service.updateLeadById(id, modifiedBy, leadStatus);
		return new ResponseEntity<Lead>(updatedLead, HttpStatus.OK);
	}
	
	@GetMapping("/{id}/transactionStatus")
	public ResponseEntity<String> getTransactionStatusAndMessage(@PathVariable Long id) {
		String transactionStatusAndMessage = service.getTransactionStatusAndMessage(id);
		return new ResponseEntity<String>(transactionStatusAndMessage, HttpStatus.OK);
	}
}