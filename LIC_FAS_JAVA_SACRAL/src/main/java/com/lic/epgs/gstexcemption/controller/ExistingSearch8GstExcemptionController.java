package com.lic.epgs.gstexcemption.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.gstexcemption.model.ExistingSearch8GstExcemption;
import com.lic.epgs.gstexcemption.service.ExistingSearch8GstExcemptionService;

@RestController
@RequestMapping("/api")
public class ExistingSearch8GstExcemptionController {
	
	@Autowired
	private ExistingSearch8GstExcemptionService existingSearch8GstExcemptionService;
	
	@GetMapping("/gstexcemption/{unitCode}")
	public ExistingSearch8GstExcemption getExcemptionByUnitCode(@PathVariable String unitCode){
		return existingSearch8GstExcemptionService.findByUnitCode(unitCode);
	}
	
	@GetMapping("/gstexcemption")
	public List<ExistingSearch8GstExcemption> getExcemptions(){
		return existingSearch8GstExcemptionService.findAll();
	}
	
	@PostMapping("/gstexcemption")
	public ExistingSearch8GstExcemption saveExcemption(@RequestBody ExistingSearch8GstExcemption existingSearch8GstExcemption){
		return existingSearch8GstExcemptionService.save(existingSearch8GstExcemption);
	}
	
}