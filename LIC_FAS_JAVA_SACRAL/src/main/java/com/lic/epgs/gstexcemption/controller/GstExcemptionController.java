package com.lic.epgs.gstexcemption.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.gstexcemption.model.GstExcemption;
import com.lic.epgs.gstexcemption.service.SendToApprove5_GstExcemptionService;

@RestController
@RequestMapping("/gstexcemption")
public class GstExcemptionController {
	
	@Autowired
	private SendToApprove5_GstExcemptionService sendToApprove5_GstExcemptionService;
	
	@GetMapping("/{gstExcemptionId}")
	public GstExcemption getGstExcemptionById(@PathVariable String gstExcemptionId) {
		return sendToApprove5_GstExcemptionService.findByGstExcemptionId(gstExcemptionId);
	}
	
	@PostMapping("/save")
	public void saveGstExcemption(@RequestBody GstExcemption gstExcemption) {
		sendToApprove5_GstExcemptionService.save(gstExcemption);
	}
	
	@PostMapping("/update")
	public void updateGstExcemption(@RequestBody GstExcemption gstExcemption) {
		sendToApprove5_GstExcemptionService.update(gstExcemption);
	}
	
	@PostMapping("/create/gstExcemption")
	public void createNewGstNotesAndDocDetails(@RequestBody GstExcemption gstExcemption) {
		sendToApprove5_GstExcemptionService.createNewGstNotesAndDocDetails(gstExcemption);
	}
	
	@GetMapping("/get/gstExcemptionId")
	public String getNewGstExcemptionId() {
		return sendToApprove5_GstExcemptionService.getNewGstExcemptionId();
	}

}