package com.lic.epgs.trust.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.trust.model.TrustDetails;
import com.lic.epgs.trust.repository.UpdateTrustStatusRepository;

@Service
public class UpdateTrustStatusService {

	@Autowired
	private UpdateTrustStatusRepository repository;

	public TrustDetails updateTrustStatus(String trustId, String unitCode, String status, String description) {
		return repository.updateTrustStatus(trustId, unitCode, status, description);
	}

}

package com.lic.epgs.trust.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.trust.model.TrustDetails;
import com.lic.epgs.trust.service.GetInProgressTrustDetailsService;
import com.lic.epgs.trust.service.UpdateTrustStatusService;

@RestController
public class TrustController {

	@Autowired
	private GetInProgressTrustDetailsService getInProgressTrustDetailsService;
	
	@Autowired
	private UpdateTrustStatusService updateTrustStatusService;

	@GetMapping("/getTrustDetails")
	public TrustDetails getTrustDetailsByTrustIdAndUnitCode(@RequestParam String trustId, @RequestParam String unitCode) {
		return getInProgressTrustDetailsService.getTrustDetailsByTrustIdAndUnitCode(trustId, unitCode);
	}

	@PostMapping("/updateTrustStatus")
	public TrustDetails updateTrustStatus(@RequestParam String trustId, @RequestParam String unitCode, @RequestParam String status, @RequestParam String description) {
		return updateTrustStatusService.updateTrustStatus(trustId, unitCode, status, description);
	}

}