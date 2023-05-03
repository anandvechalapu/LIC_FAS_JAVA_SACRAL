package com.lic.epgs.lead.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.lead.model.Lead;
import com.lic.epgs.lead.repository.InProgressSearchByLeadName_LEAD12Repository;

@Service
public class InProgressSearchByLeadName_LEAD12Service {
	
	@Autowired
	private InProgressSearchByLeadName_LEAD12Repository inProgressSearchByLeadName_LEAD12Repository;
	
	public Lead findByNameAndCreatedBy(String name, String createdBy) {
		return inProgressSearchByLeadName_LEAD12Repository.findByNameAndCreatedBy(name, createdBy);
	}
	
	public Lead findByName(String name) {
		return inProgressSearchByLeadName_LEAD12Repository.findByName(name);
	}
	
	public Lead findByCreatedBy(String createdBy) {
		return inProgressSearchByLeadName_LEAD12Repository.findByCreatedBy(createdBy);
	}
	
	public Lead findByChannel(String channel) {
		return inProgressSearchByLeadName_LEAD12Repository.findByChannel(channel);
	}
	
	public void deleteByName(String name) {
		inProgressSearchByLeadName_LEAD12Repository.deleteByName(name);
	}
	
	public void deleteByCreatedBy(String createdBy) {
		inProgressSearchByLeadName_LEAD12Repository.deleteByCreatedBy(createdBy);
	}
	
	public void deleteByChannel(String channel) {
		inProgressSearchByLeadName_LEAD12Repository.deleteByChannel(channel);
	}

}