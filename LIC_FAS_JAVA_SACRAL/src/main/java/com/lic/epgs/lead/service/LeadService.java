package com.lic.epgs.lead.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.lead.model.Lead;
import com.lic.epgs.lead.repository.LeadRepository;

@Service
public class LeadService {
	
	@Autowired
	private LeadRepository leadRepository;
	
	public Lead existingSearchByLeadName_LEAD(String leadName) {
		return leadRepository.existingSearchByLeadName_LEAD(leadName);
	}
	
	public Optional<Lead> getLeadById(Long leadId) {
		return leadRepository.findById(leadId);
	}
	
	public Lead saveLead(Lead lead) {
		return leadRepository.save(lead);
	}
	
	public void deleteLead(Lead lead) {
		leadRepository.delete(lead);
	}

}