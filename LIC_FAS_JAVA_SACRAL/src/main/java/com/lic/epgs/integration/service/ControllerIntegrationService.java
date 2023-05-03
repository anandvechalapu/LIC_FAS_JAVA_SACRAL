package com.lic.epgs.integration.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.integration.model.AccountingIntegrationRequestDto;
import com.lic.epgs.integration.repository.ControllerIntegrationRepository;

@Service
public class ControllerIntegrationService {
	
	@Autowired
	ControllerIntegrationRepository controllerIntegrationRepository;
	
	public List<AccountingIntegrationRequestDto> getAllAccountingIntegrationRequestDtos(){
		return controllerIntegrationRepository.findAll();
	}
	
	public Optional<AccountingIntegrationRequestDto> getAccountingIntegrationRequestDtoByCode(String commonmasterserviceUnitByCode){
		return controllerIntegrationRepository.getProposalDetails(commonmasterserviceUnitByCode);
	}
	
	public AccountingIntegrationRequestDto addAccountingIntegrationRequestDto(AccountingIntegrationRequestDto accountingIntegrationRequestDto) {
		return controllerIntegrationRepository.save(accountingIntegrationRequestDto);
	}
	
	public AccountingIntegrationRequestDto updateAccountingIntegrationRequestDto(AccountingIntegrationRequestDto accountingIntegrationRequestDto) {
		return controllerIntegrationRepository.save(accountingIntegrationRequestDto);
	}
	
	public void deleteAccountingIntegrationRequestDto(Long id) {
		controllerIntegrationRepository.deleteById(id);
	}

}