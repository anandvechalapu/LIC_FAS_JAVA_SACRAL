@Service
public class GetTrustBankAccountDetailsService {
	
	@Autowired
	private GetTrustBankAccountDetailsRepository getTrustBankAccountDetailsRepository;
	
	public List<TrustManagementController22> findByTrustIdAndRole(Long trustId, String role) {
		return getTrustBankAccountDetailsRepository.findByTrustIdAndRole(trustId, role);
	}

}

package com.lic.epgs.trust.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.trust.model.TrustManagementController22;
import com.lic.epgs.trust.service.GetTrustBankAccountDetailsService;
import com.lic.epgs.trust.service.RemoveTrustBankAccountDetailsService;

@RestController
public class TrustManagementController {
	
	@Autowired
	private GetTrustBankAccountDetailsService getTrustBankAccountDetailsService;
	
	@Autowired
	private RemoveTrustBankAccountDetailsService removeTrustBankAccountDetailsService;
	
	@GetMapping("/trust/{trustId}/{role}")
	public List<TrustManagementController22> getTrustBankAccountDetails(@PathVariable Long trustId, @PathVariable String role) {
		return getTrustBankAccountDetailsService.findByTrustIdAndRole(trustId, role);
	}
	
	@DeleteMapping("/trust/{trustId}/{bankAccountId}/{role}")
	public Optional<TrustManagementController22> removeTrustBankAccountDetails(@PathVariable Long trustId, @PathVariable Long bankAccountId, @PathVariable String role) {
		return removeTrustBankAccountDetailsService.findByTrustIdAndBankAccountIdAndRole(trustId, bankAccountId, role);
	}

}