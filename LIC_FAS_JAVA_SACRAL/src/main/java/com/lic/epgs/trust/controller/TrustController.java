package com.lic.epgs.trust.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.trust.model.Trust;
import com.lic.epgs.trust.service.TrustService;

@RestController
@RequestMapping(value = "/trust")
public class TrustController {

	@Autowired
	private TrustService trustService;

	@GetMapping
	public ResponseEntity<List<Trust>> getExistingTrustDetails(@RequestParam String trustId,
			@RequestParam String unitCode) {
		List<Trust> existingTrustDetails = trustService.getExistingTrustDetails(trustId, unitCode);
		if (existingTrustDetails != null) {
			return new ResponseEntity<>(existingTrustDetails, HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}