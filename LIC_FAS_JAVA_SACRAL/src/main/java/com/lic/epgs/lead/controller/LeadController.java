package com.lic.epgs.lead.controller;

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
import com.lic.epgs.lead.service.LeadService;

@RestController
@RequestMapping("/lead")
public class LeadController {
	
	@Autowired
	private LeadService leadService;
	
	@GetMapping("/{leadName}")
	public ResponseEntity<Lead> existingSearchByLeadName_LEAD(@PathVariable String leadName) {
		Lead lead = leadService.existingSearchByLeadName_LEAD(leadName);
		return new ResponseEntity<Lead>(lead, HttpStatus.OK);
	}
	
	@GetMapping("/{leadId}")
	public ResponseEntity<Lead> getLeadById(@PathVariable Long leadId) {
		Optional<Lead> lead = leadService.getLeadById(leadId);
		if (lead.isPresent()) {
			return new ResponseEntity<Lead>(lead.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<Lead>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping
	public ResponseEntity<Lead> saveLead(@RequestBody Lead lead) {
		Lead savedLead = leadService.saveLead(lead);
		return new ResponseEntity<Lead>(savedLead, HttpStatus.CREATED);
	}
	
	@PostMapping("/{leadId}")
	public ResponseEntity<Lead> deleteLead(@PathVariable Long leadId) {
		Optional<Lead> lead = leadService.getLeadById(leadId);
		if (lead.isPresent()) {
			leadService.deleteLead(lead.get());
			return new ResponseEntity<Lead>(HttpStatus.OK);
		} else {
			return new ResponseEntity<Lead>(HttpStatus.NOT_FOUND);
		}
	}

}