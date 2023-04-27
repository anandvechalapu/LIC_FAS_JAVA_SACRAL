package com.lic.epgs.gstexcemption.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lic.epgs.gstexcemption.model.GstExcemption;
import com.lic.epgs.gstexcemption.repository.SendToApprove5_GstExcemptionRepository;

@Service
public class SendToApprove5_GstExcemptionService {
	
	@Autowired
	private SendToApprove5_GstExcemptionRepository sendToApprove5_GstExcemptionRepository;
	
	public GstExcemption findByGstExcemptionId(String gstExcemptionId) {
		return sendToApprove5_GstExcemptionRepository.findByGstExcemptionId(gstExcemptionId);
	}
	
	public void save(GstExcemption gstExcemption) {
		sendToApprove5_GstExcemptionRepository.save(gstExcemption);
	}
	
	public void update(GstExcemption gstExcemption) {
		sendToApprove5_GstExcemptionRepository.update(gstExcemption);
	}
	
	public void createNewGstNotesAndDocDetails(GstExcemption gstExcemption) {
		sendToApprove5_GstExcemptionRepository.createNewGstNotesAndDocDetails(gstExcemption);
	}
	
	public String getNewGstExcemptionId() {
		return sendToApprove5_GstExcemptionRepository.getNewGstExcemptionId();
	}

}