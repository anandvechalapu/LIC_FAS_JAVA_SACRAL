package com.lic.epgs.lead.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.model.Lead;
import com.lic.epgs.lead.service.ExistingSearch_LEADService;

@RestController
public class ExistingSearch_LEADController {

	@Autowired
	ExistingSearch_LEADService existingSearch_LEADService;

	@GetMapping("/getLeadByUnitCodeAndCreatedBy")
	public List<Lead> findLeadByUnitCodeAndCreatedBy(@RequestParam("unitCode") String unitCode,
			@RequestParam("createdBy") String createdBy) {
		return existingSearch_LEADService.findLeadByUnitCodeAndCreatedBy(unitCode, createdBy);
	}

	@GetMapping("/getLeadByUnitCode")
	public List<Lead> findLeadByUnitCode(@RequestParam("unitCode") String unitCode) {
		return existingSearch_LEADService.findLeadByUnitCode(unitCode);
	}

}