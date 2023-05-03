package com.lic.epgs.lead.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.lead.dto.LeadBasicDetailsDTO;
import com.lic.epgs.lead.entity.LeadNotesActiveTempEntity;
import com.lic.epgs.lead.service.GetNotesActivityList_LEAD9Service;

@RestController
@RequestMapping("/api")
public class GetNotesActivityList_LEAD9Controller {
	
	@Autowired
	private GetNotesActivityList_LEAD9Service getNotesActivityList_LEAD9Service;
	
	@GetMapping("/getNotesActivityList")
	public List<LeadNotesActiveTempEntity> getNotesActivityList() {
		return getNotesActivityList_LEAD9Service.getNotesActivityList();
	}
	
	@GetMapping("/getNotesActivityList_LEAD9")
	public List<LeadBasicDetailsDTO> getNotesActivityList_LEAD9() {
		return getNotesActivityList_LEAD9Service.getNotesActivityList_LEAD9();
	}
}