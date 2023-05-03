package com.lic.epgs.lead.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.lead.model.Lead;
import com.lic.epgs.lead.service.ProposalLeadBasicDetailsLeadService;

@RestController
@RequestMapping("/epgs/leads")
public class ProposalLeadBasicDetailsLeadController {

	@Autowired
	private ProposalLeadBasicDetailsLeadService service;
	
	@PutMapping("/{leadId}")
	public Lead updateLead(@PathVariable("leadId") Long leadId, @RequestBody Lead lead) {
		return service.updateLead(leadId, lead.getPAN(), lead.getLeadName(), lead.getCustomerId(), lead.getCustomerCode());
	}
	
}