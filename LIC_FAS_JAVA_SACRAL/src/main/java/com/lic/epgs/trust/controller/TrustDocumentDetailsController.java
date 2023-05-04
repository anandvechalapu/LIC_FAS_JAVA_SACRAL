package com.lic.epgs.trust.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.trust.model.TrustDocumentDetails;
import com.lic.epgs.trust.service.TrustDocumentDetailsService;

@RestController
public class TrustDocumentDetailsController {
	
	@Autowired
	private TrustDocumentDetailsService trustDocumentDetailsService;
	
	@PostMapping("/trust/document/details")
	public TrustDocumentDetails addDocumentDetailsToTrust(@RequestBody TrustDocumentDetails trustDocumentDetails) {
		return trustDocumentDetailsService.addDocumentDetailsToTrust(trustDocumentDetails);
	}
	
	@PostMapping("/trust/document/update/remove")
	public TrustDocumentDetails updateOrRemoveDocumentDetails(@RequestBody TrustDocumentDetails trustDocumentDetails) {
		return trustDocumentDetailsService.updateOrRemoveDocumentDetails(trustDocumentDetails);
	}
	
	@PostMapping("/trust/document/response")
	public TrustDocumentDetails getResponseForDocumentDetailsRequest(@RequestBody TrustDocumentDetails trustDocumentDetails) {
		return trustDocumentDetailsService.getResponseForDocumentDetailsRequest(trustDocumentDetails);
	}
	
	@PostMapping("/trust/document/log")
	public TrustDocumentDetails logDocumentDetailsRequest(@RequestBody TrustDocumentDetails trustDocumentDetails) {
		return trustDocumentDetailsService.logDocumentDetailsRequest(trustDocumentDetails);
	}
}