package com.lic.epgs.lead.service;

import com.lic.epgs.lead.repository.ProposalLeadBasicDetailsLeadRepository;
import com.lic.epgs.lead.model.Lead;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProposalLeadBasicDetailsLeadService {
	
	@Autowired
	private ProposalLeadBasicDetailsLeadRepository repository;
	
	public Lead updateLead(Lead lead) {
		return repository.updateLead(lead);
	}
	
	public Lead updateLead(Long leadId, String PAN, String customerName, Long customerId, String customerCode) {
		return repository.updateLead(leadId, PAN, customerName, customerId, customerCode);
	}
	
	public Lead getUpdatedLeadDetails(Lead lead) {
		return repository.getUpdatedLeadDetails(lead);
	}
	
	public String updateLeadSuccessResponse(Lead lead) {
		return repository.updateLeadSuccessResponse(lead);
	}
	
	public String updateLeadErrorResponse(Long leadId) {
		return repository.updateLeadErrorResponse(leadId);
	}

}