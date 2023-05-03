package com.lic.epgs.lead.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.lead.repository.ViewLeadFromTemp_LEAD;
import com.lic.epgs.lead.repository.ViewLeadFromTemp_LEADRepository;

@Service
public class ViewLeadFromTemp_LEADService {

	@Autowired
	private ViewLeadFromTemp_LEADRepository viewLeadFromTempRepository;
	
	public ViewLeadFromTemp_LEAD findByLeadId(Long leadId) {
		return viewLeadFromTempRepository.findByLeadId(leadId);
	}
	
	public List<ViewLeadFromTemp_LEAD> findByCustomerId(Long customerId) {
		return viewLeadFromTempRepository.findByCustomerId(customerId);
	}
	
	public List<ViewLeadFromTemp_LEAD> findByLeadName(String leadName) {
		return viewLeadFromTempRepository.findByLeadName(leadName);
	}
	
	public List<ViewLeadFromTemp_LEAD> findByLeadNumber(Long leadNumber) {
		return viewLeadFromTempRepository.findByLeadNumber(leadNumber);
	}
	
	public List<ViewLeadFromTemp_LEAD> findByLeadStatus(String leadStatus) {
		return viewLeadFromTempRepository.findByLeadStatus(leadStatus);
	}
	
	public List<ViewLeadFromTemp_LEAD> findByLeadSubStatus(String leadSubStatus) {
		return viewLeadFromTempRepository.findByLeadSubStatus(leadSubStatus);
	}
	
	public List<ViewLeadFromTemp_LEAD> findByWorkflowStatus(String workflowStatus) {
		return viewLeadFromTempRepository.findByWorkflowStatus(workflowStatus);
	}
	
	public List<ViewLeadFromTemp_LEAD> findByIndustryType(String industryType) {
		return viewLeadFromTempRepository.findByIndustryType(industryType);
	}
	
	public List<ViewLeadFromTemp_LEAD> findByPAN(String pAN) {
		return viewLeadFromTempRepository.findByPAN(pAN);
	}
	
	public List<ViewLeadFromTemp_LEAD> findByCreatedOnDate(Long createdOnDate) {
		return viewLeadFromTempRepository.findByCreatedOnDate(createdOnDate);
	}
	
	public List<ViewLeadFromTemp_LEAD> findByLeadContactNumber(Long leadContactNumber) {
		return viewLeadFromTempRepository.findByLeadContactNumber(leadContactNumber);
	}
	
	public List<ViewLeadFromTemp_LEAD> findByEmailId(String emailId) {
		return viewLeadFromTempRepository.findByEmailId(emailId);
	}
	
	public List<ViewLeadFromTemp_LEAD> findByLeadExpiryDate(Long leadExpiryDate) {
		return viewLeadFromTempRepository.findByLeadExpiryDate(leadExpiryDate);
	}
	
	public List<ViewLeadFromTemp_LEAD> findByChannelInfo(String channelInfo) {
		return viewLeadFromTempRepository.findByChannelInfo(channelInfo);
	}
	
	public List<ViewLeadFromTemp_LEAD> findByProductInfo(String productInfo) {
		return viewLeadFromTempRepository.findByProductInfo(productInfo);
	}
	
}