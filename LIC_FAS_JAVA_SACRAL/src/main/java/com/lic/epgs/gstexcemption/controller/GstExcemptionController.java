package com.lic.epgs.gstexcemption.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.gstexcemption.model.GstExcemption;
import com.lic.epgs.gstexcemption.service.GstExcemptionService;

@RestController
@RequestMapping("/gstExcemption")
public class GstExcemptionController {
	
	@Autowired
	GstExcemptionService gstExcemptionService;
	
	@GetMapping("/{loginUser}/{unitCode}")
	public List<GstExcemption> getGstExcemptionStatusForLoginUserAndUnitCode(@PathVariable String loginUser, @PathVariable String unitCode) {
		return gstExcemptionService.findByLoginUserAndUnitCode(loginUser, unitCode);
	}
	
	@GetMapping("/{gstExcemptionStatus}/{unitCode}")
	public List<GstExcemption> getGstExcemptionStatusForGstExcemptionStatusAndUnitCode(@PathVariable String gstExcemptionStatus, @PathVariable String unitCode) {
		return gstExcemptionService.findByGstExcemptionStatusAndUnitCode(gstExcemptionStatus, unitCode);
	}
	
	@GetMapping("/{unitCode}")
	public List<GstExcemption> getGstExcemptionStatusForUnitCode(@PathVariable String unitCode) {
		return gstExcemptionService.findByUnitCode(unitCode);
	}

}