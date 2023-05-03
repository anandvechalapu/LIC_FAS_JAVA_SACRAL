package com.lic.epgs.lead.service;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lic.epgs.lead.entity.LeadBasicDetailsTempEntity;
import com.lic.epgs.lead.entity.LeadResponse;
import com.lic.epgs.lead.repository.SendToCheckerLeadRepository;

@Service
public class SendToCheckerLeadService {

	@Autowired
	private SendToCheckerLeadRepository sendToCheckerLeadRepository;
	
	public Optional<LeadBasicDetailsTempEntity> findByLeadId(Long leadId){
		return sendToCheckerLeadRepository.findByLeadId(leadId);
	}
	
	@Transactional
	public int updateLeadBasicDetailsTempEntity(Long leadId, String modifiedBy, String leadStatus, String leadSubStatus, String workflowStatus){
		return sendToCheckerLeadRepository.updateLeadBasicDetailsTempEntity(leadId, modifiedBy, leadStatus, leadSubStatus, workflowStatus);
	}
	
	@Transactional
	public int updateLeadProductDetailsTempEntity(Long leadId, String modifiedBy, String createdBy, Date createdOn){
		return sendToCheckerLeadRepository.updateLeadProductDetailsTempEntity(leadId, modifiedBy, createdBy, createdOn);
	}
	
	@Transactional
	public int updateLeadChannelDetailsTempEntity(Long leadId, String modifiedBy, String createdBy, Date createdOn){
		return sendToCheckerLeadRepository.updateLeadChannelDetailsTempEntity(leadId, modifiedBy, createdBy, createdOn);
	}
	
	@Transactional
	public int updateLeadNotesActiveTempEntity(Long leadId, String modifiedBy, String createdBy, Date createdOn){
		return sendToCheckerLeadRepository.updateLeadNotesActiveTempEntity(leadId, modifiedBy, createdBy, createdOn);
	}
	
	public LeadResponse getLeadResponse(Long leadId){
		return sendToCheckerLeadRepository.getLeadResponse(leadId);
	}
}