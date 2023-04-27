package com.lic.epgs.gstexcemption.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.gstexcemption.model.GstExcemption;
import com.lic.epgs.gstexcemption.repository.GstExcemptionRepository;

@Service
public class GstExcemptionService {

	@Autowired
	private GstExcemptionRepository gstExcemptionRepository;
	
	public List<GstExcemption> getAllGstExcemptions() {
		return gstExcemptionRepository.findAll();
	}
	
	public GstExcemption getGstExcemptionById(Long gstExcemptionId) {
		return gstExcemptionRepository.findByGstExcemptionId(gstExcemptionId);
	}
	
	public GstExcemption createGstExcemption(GstExcemption gstExcemption) {
		return gstExcemptionRepository.save(gstExcemption);
	}
	
	public GstExcemption updateGstExcemption(GstExcemption gstExcemption) {
		return gstExcemptionRepository.save(gstExcemption);
	}
	
	public void deleteGstExcemptionById(Long gstExcemptionId) {
		gstExcemptionRepository.deleteByGstExcemptionId(gstExcemptionId);
	}
	
	public GstExcemption getGstExcemptionByModifiedBy(String modifiedBy) {
		return gstExcemptionRepository.findByModifiedBy(modifiedBy);
	}
	
	public GstExcemption getGstExcemptionByGstExcemptionStatus(String gstExcemptionStatus) {
		return gstExcemptionRepository.findByGstExcemptionStatus(gstExcemptionStatus);
	}
	
	public GstExcemption getGstExcemptionByWorkflowStatus(String workflowStatus) {
		return gstExcemptionRepository.findByWorkflowStatus(workflowStatus);
	}
}