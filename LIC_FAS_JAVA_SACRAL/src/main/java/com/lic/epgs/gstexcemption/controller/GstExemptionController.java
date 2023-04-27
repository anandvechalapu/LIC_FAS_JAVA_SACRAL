package com.lic.epgs.gstexcemption.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.gstexcemption.model.DocumentDetailsDto;
import com.lic.epgs.gstexcemption.service.SaveGstDocumentDetails14Service;

@RestController
@RequestMapping("/gstexcemption")
public class GstExemptionController {

	@Autowired
	private SaveGstDocumentDetails14Service saveGstDocumentDetails14Service;

	@GetMapping("/{gstExemptionId}")
	public DocumentDetailsDto findByGstExemptionId(@PathVariable Long gstExemptionId) {
		return saveGstDocumentDetails14Service.findByGstExemptionId(gstExemptionId);
	}

	@PostMapping
	public DocumentDetailsDto save(@RequestBody DocumentDetailsDto documentDetailsDto) {
		return saveGstDocumentDetails14Service.save(documentDetailsDto);
	}

	@DeleteMapping("/{gstExemptionId}")
	public void deleteByGstExemptionId(@PathVariable Long gstExemptionId) {
		saveGstDocumentDetails14Service.deleteByGstExemptionId(gstExemptionId);
	}

}