package com.lic.epgs.trust.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.trust.model.Trust;
import com.lic.epgs.trust.service.TrustService;

@RestController
public class TrustController {

	@Autowired
	private TrustService trustService;

	@PostMapping("/trust/save")
	public Trust saveAndSendForApproval(@RequestBody Trust trust) {
		return trustService.saveAndSendForApproval(trust);
	}

	@PutMapping("/trust/update")
	public Trust updateAndSendForApproval(@RequestBody Trust trust) {
		return trustService.updateAndSendForApproval(trust);
	}

}