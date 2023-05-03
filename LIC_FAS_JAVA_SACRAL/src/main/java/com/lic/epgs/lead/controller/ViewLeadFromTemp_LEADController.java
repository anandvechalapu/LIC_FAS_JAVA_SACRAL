package com.lic.epgs.lead.controller; 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.lead.model.ViewLeadFromTemp_LEAD;
import com.lic.epgs.lead.service.ViewLeadFromTemp_LEADService;

@RestController
@RequestMapping("/viewLeadFromTemp")
public class ViewLeadFromTemp_LEADController {
	
	@Autowired
	private ViewLeadFromTemp_LEADService viewLeadFromTempService;
	
	@GetMapping("/byLeadId/{leadId}")
	public ViewLeadFromTemp_LEAD findByLeadId(@PathVariable Long leadId) {
		return viewLeadFromTempService.findByLeadId(leadId);
	}
	
	@GetMapping("/byCustomerId/{customerId}")
	public List<ViewLeadFromTemp_LEAD> findByCustomerId(@PathVariable Long customerId) {
		return viewLeadFromTempService.findByCustomerId(customerId);
	}
	
	@GetMapping("/byLeadName/{leadName}")
	public List<ViewLeadFromTemp_LEAD> findByLeadName(@PathVariable String leadName) {
		return viewLeadFromTempService.findByLeadName(leadName);
	}
	
	@GetMapping("/byLeadNumber/{leadNumber}")
	public List<ViewLeadFromTemp_LEAD> findByLeadNumber(@PathVariable Long leadNumber) {
		return viewLeadFromTempService.findByLeadNumber(leadNumber);
	}
	
	@GetMapping("/byLeadStatus/{leadStatus}")
	public List<ViewLeadFromTemp_LEAD> findByLeadStatus(@PathVariable String leadStatus) {
		return viewLeadFromTempService.findByLeadStatus(leadStatus);
	}
	
	@GetMapping("/byLeadSubStatus/{leadSubStatus}")
	public List<ViewLeadFromTemp_LEAD> findByLeadSubStatus(@PathVariable String leadSubStatus) {
		return viewLeadFromTempService.findByLeadSubStatus(leadSubStatus);
	}
	
	@GetMapping("/byWorkflowStatus/{workflowStatus}")
	public List<ViewLeadFromTemp_LEAD> findByWorkflowStatus(@PathVariable String workflowStatus) {
		return viewLeadFromTempService.findByWorkflowStatus(workflowStatus);
	}
	
	@GetMapping("/byIndustryType/{industryType}")
	public List<ViewLeadFromTemp_LEAD> findByIndustryType(@PathVariable String industryType) {
		return viewLeadFromTempService.findByIndustryType(industryType);
	}
	
	@GetMapping("/byPAN/{pAN}")
	public List<ViewLeadFromTemp_LEAD> findByPAN(@PathVariable String pAN) {
		return viewLeadFromTempService.findByPAN(pAN);
	}
	
	@GetMapping("/byCreatedOnDate/{createdOnDate}")
	public List<ViewLeadFromTemp_LEAD> findByCreatedOnDate(@PathVariable Long createdOnDate) {
		return viewLeadFromTempService.findByCreatedOnDate(createdOnDate);
	}
	
	@GetMapping("/byLeadContactNumber/{leadContactNumber}")
	public List<ViewLeadFromTemp_LEAD> findByLeadContactNumber(@PathVariable Long leadContactNumber) {
		return viewLeadFromTempService.findByLeadContactNumber(leadContactNumber);
	}
	
	@GetMapping("/byEmailId/{emailId}")
	public List<ViewLeadFromTemp_LEAD> findByEmailId(@PathVariable String emailId) {
		return viewLeadFromTempService.findByEmailId