package com.lic.epgs.trust.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.trust.model.TrustDocumentDetails;
import com.lic.epgs.trust.service.TrustDocumentDetailsService;

@RestController
public class TrustDocumentDetailsController {

	@Autowired
	TrustDocumentDetailsService trustDocumentDetailsService;
	
	@GetMapping("/trustDocuments")
	public List<TrustDocumentDetails> getTrustDocuments(@RequestParam Long trustId) {
		return trustDocumentDetailsService.findByTrustId(trustId);
	}
	
	@PostMapping("/trustDocuments/save")
	public TrustDocumentDetails saveTrustDocument(@RequestBody TrustDocumentDetails trustDocumentDetails) {
		return trustDocumentDetailsService.saveTrustDocumentDetails(trustDocumentDetails);
	}
	
	@DeleteMapping("/trustDocuments/delete")
	public void deleteTrustDocument(@RequestParam Long documentId) {
		trustDocumentDetailsService.deleteTrustDocumentDetails(documentId);
	}
	
}