package com.lic.epgs.lead.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.lead.model.LeadActivityNotes;
import com.lic.epgs.lead.model.LeadNotesActiveTemp;
import com.lic.epgs.lead.service.LeadActivityNotes_LEAD13Service;

@RestController
@RequestMapping("/lead_activity_notes")
public class LeadActivityNotes_LEAD13Controller {
	
	@Autowired
	LeadActivityNotes_LEAD13Service leadActivityNotes_LEAD13Service;

	@PostMapping(value = "/save")
	public int saveLeadActivityNotes(@RequestBody LeadActivityNotes leadActivityNotes) {
		return leadActivityNotes_LEAD13Service.saveLeadActivityNotes(leadActivityNotes.getLeadId(), leadActivityNotes.getActiveBy(), leadActivityNotes.getActiveDate(), 
				leadActivityNotes.getActivityType(), leadActivityNotes.getActivityNoteContent(), leadActivityNotes.getCreatedBy(), leadActivityNotes.getNotesContent(), 
				leadActivityNotes.getCreatedOn());
	}
	
	@GetMapping(value = "/get/{leadId}")
	public List<LeadNotesActiveTemp> getLeadActivityNotes(@PathVariable long leadId) {
		return leadActivityNotes_LEAD13Service.getLeadActivityNotes(leadId);
	}
	
	@PostMapping(value = "/inactive/{leadId}")
	public int setLeadActivityNotesInactive(@PathVariable long leadId) {
		return leadActivityNotes_LEAD13Service.setLeadActivityNotesInactive(leadId);
	}

}