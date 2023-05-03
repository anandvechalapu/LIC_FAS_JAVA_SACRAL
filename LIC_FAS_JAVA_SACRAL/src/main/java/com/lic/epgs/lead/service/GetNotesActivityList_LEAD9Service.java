package com.lic.epgs.lead.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.lead.dto.LeadBasicDetailsDTO;
import com.lic.epgs.lead.entity.LeadNotesActiveTempEntity;
import com.lic.epgs.lead.repository.GetNotesActivityList_LEAD9Repository;

@Service
public class GetNotesActivityList_LEAD9Service {

	@Autowired
	private GetNotesActivityList_LEAD9Repository getNotesActivityList_LEAD9Repository;
	
	public List<LeadNotesActiveTempEntity> getNotesActivityList() {
		return getNotesActivityList_LEAD9Repository.getNotesActivityList();
	}
	
	public List<LeadBasicDetailsDTO> getNotesActivityList_LEAD9() {
		return getNotesActivityList_LEAD9Repository.getNotesActivityList_LEAD9();
	}

}