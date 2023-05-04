package com.lic.epgs.trust.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.trust.dto.CommonTrustDto;
import com.lic.epgs.trust.service.ExistingTrustCodeSearchService;

@RestController
public class ExistingTrustCodeSearchController {

	@Autowired
	private ExistingTrustCodeSearchService existingTrustCodeSearchService;
	
	@GetMapping("/trust/search")
	public ResponseEntity<List<CommonTrustDto>> findByTrustCodeAndUnitCode(@RequestParam String trustCode, @RequestParam String unitCode) {
		return ResponseEntity.ok(existingTrustCodeSearchService.findByTrustCodeAndUnitCode(trustCode, unitCode));
	}
	
	@GetMapping("/trust/search/status")
	public ResponseEntity<List<CommonTrustDto>> findByStatusInAndTrustCodeAndUnitCode(@RequestParam List<String> status, @RequestParam String trustCode, @RequestParam String unitCode) {
		return ResponseEntity.ok(existingTrustCodeSearchService.findByStatusInAndTrustCodeAndUnitCode(status, trustCode, unitCode));
	}
	
	@GetMapping("/trust/search/transaction")
	public ResponseEntity<List<CommonTrustDto>> findByTransactionMessage(@RequestParam String transactionMessage) {
		return ResponseEntity.ok(existingTrustCodeSearchService.findByTransactionMessage(transactionMessage));
	}
	
}