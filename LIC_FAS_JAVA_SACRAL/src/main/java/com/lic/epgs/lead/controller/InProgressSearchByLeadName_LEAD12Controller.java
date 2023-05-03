package com.lic.epgs.lead.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.lead.model.Lead;
import com.lic.epgs.lead.service.InProgressSearchByLeadName_LEAD12Service;

@RestController
public class InProgressSearchByLeadName_LEAD12Controller {
	
	@Autowired
	private InProgressSearchByLeadName_LEAD12Service inProgressSearchByLeadName_LEAD12Service;
	
	@GetMapping("/lead/search/name/{name}/createdBy/{createdBy}")
	public Lead findByNameAndCreatedBy(@PathVariable String name, @PathVariable String createdBy) {
		return inProgressSearchByLeadName_LEAD12Service.findByNameAndCreatedBy(name, createdBy);
	}
	
	@GetMapping("/lead/search/name/{name}")
	public Lead findByName(@PathVariable String name) {
		return inProgressSearchByLeadName_LEAD12Service.findByName(name);
	}
	
	@GetMapping("/lead/search/createdBy/{createdBy}")
	public Lead findByCreatedBy(@PathVariable String createdBy) {
		return inProgressSearchByLeadName_LEAD12Service.findByCreatedBy(createdBy);
	}
	
	@GetMapping("/lead/search/channel/{channel}")
	public Lead findByChannel(@PathVariable String channel) {
		return inProgressSearchByLeadName_LEAD12Service.findByChannel(channel);
	}
	
	@DeleteMapping("/lead/delete/name/{name}")
	public void deleteByName(@PathVariable String name) {
		inProgressSearchByLeadName_LEAD12Service.deleteByName(name);
	}
	
	@DeleteMapping("/lead/delete/createdBy/{createdBy}")
	public void deleteByCreatedBy(@PathVariable String createdBy) {
		inProgressSearchByLeadName_LEAD12Service.deleteByCreatedBy(createdBy);
	}
	
	@DeleteMapping("/lead/delete/channel/{channel}")
	public void deleteByChannel(@PathVariable String channel) {
		inProgressSearchByLeadName_LEAD12Service.deleteByChannel(channel);
	}

}