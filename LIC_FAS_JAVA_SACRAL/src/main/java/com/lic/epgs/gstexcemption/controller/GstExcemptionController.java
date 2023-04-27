package com.lic.epgs.gstexcemption.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.gstexcemption.model.GstExcemption;
import com.lic.epgs.gstexcemption.service.GstExcemptionService;

@RestController
@RequestMapping("/gstexcemptions")
public class GstExcemptionController {

	@Autowired
	private GstExcemptionService gstExcemptionService;
	
	@GetMapping
	public List<GstExcemption> getAllGstExcemptions() {
		return gstExcemptionService.getAllGstExcemptions();
	}
	
	@GetMapping("/{gstExcemptionId}")
	public GstExcemption getGstExcemptionById(@PathVariable("gstExcemptionId") Long gstExcemptionId) {
		return gstExcemptionService.getGstExcemptionById(gstExcemptionId);
	}
	
	@PostMapping
	public GstExcemption createGstExcemption(@RequestBody GstExcemption gstExcemption) {
		return gstExcemptionService.createGstExcemption(gstExcemption);
	}
	
	@PutMapping
	public GstExcemption updateGstExcemption(@RequestBody GstExcemption gstExcemption) {
		return gstExcemptionService.updateGstExcemption(gstExcemption);
	}
	
	@DeleteMapping("/{gstExcemptionId}")
	public void deleteGstExcemptionById(@PathVariable("gstExcemptionId") Long gstExcemptionId) {
		gstExcemptionService.deleteGstExcemptionById(gstExcemptionId);
	}
	
	@GetMapping("/modifiedBy/{modifiedBy}")
	public GstExcemption getGstExcemptionByModifiedBy(@PathVariable("modifiedBy") String modifiedBy) {
		return gstExcemptionService.getGstExcemptionByModifiedBy(modifiedBy);
	}
	
	@GetMapping("/gstExcemptionStatus/{gstExcemptionStatus}")
	public GstExcemption getGstExcemptionByGstExcemptionStatus(@PathVariable("gstExcemptionStatus") String gstExcemptionStatus) {
		return gstExcemptionService.getGstExcemptionByGstExcemptionStatus(gstExcemptionStatus);
	}
	
	@GetMapping("/workflowStatus/{workflowStatus}")
	public GstExcemption getGstExcemptionByWorkflowStatus(@PathVariable("workflowStatus") String workflowStatus) {
		return gstExcemptionService.getGstExcemptionByWorkflowStatus(workflowStatus);
	}
}