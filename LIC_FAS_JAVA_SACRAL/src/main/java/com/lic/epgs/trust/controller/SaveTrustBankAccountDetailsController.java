package com.lic.epgs.trust.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.trust.entity.BankAccountDetailsTempEntity;
import com.lic.epgs.trust.service.SaveTrustBankAccountDetailsService;

@RestController
@RequestMapping("/trust")
public class SaveTrustBankAccountDetailsController {

	@Autowired
	private SaveTrustBankAccountDetailsService saveTrustBankAccountDetailsService;
	
	@PostMapping("/account-details")
	public BankAccountDetailsTempEntity saveBankAccountDetails(@RequestBody BankAccountDetailsTempEntity bankAccountDetailsTempEntity) {
		Optional<BankAccountDetailsTempEntity> optional = saveTrustBankAccountDetailsService.findByAccountNumberAndIsActiveTrue(bankAccountDetailsTempEntity.getAccountNumber());
		if(optional.isPresent()) {
			BankAccountDetailsTempEntity existingEntity = optional.get();
			existingEntity.setBankName(bankAccountDetailsTempEntity.getBankName());
			existingEntity.setIfscCode(bankAccountDetailsTempEntity.getIfscCode());
			return saveTrustBankAccountDetailsService.save(existingEntity);
		} else {
			return saveTrustBankAccountDetailsService.save(bankAccountDetailsTempEntity);
		}
	}
}