package com.lic.epgs.integration.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.integration.model.AccountingIntegrationRequestDto;
import com.lic.epgs.integration.service.ControllerIntegrationService;

@RestController
@RequestMapping("/api")
public class ControllerIntegrationController {
	
	@Autowired
	ControllerIntegrationService controllerIntegrationService;
	
	@GetMapping("/accountingIntegrationRequestDtos")
	public List<AccountingIntegrationRequestDto> getAllAccountingIntegrationRequestDtos(){
		return controllerIntegrationService.getAllAccountingIntegrationRequestDtos();
	}
	
	@GetMapping("/accountingIntegrationRequestDtos/{commonmasterserviceUnitByCode}")
	public Optional<AccountingIntegrationRequestDto> getAccountingIntegrationRequestDtoByCode(@PathVariable String commonmasterserviceUnitByCode){
		return controllerIntegrationService.getAccountingIntegrationRequestDtoByCode(commonmasterserviceUnitByCode);
	}
	
	@PostMapping("/accountingIntegrationRequestDtos")
	public AccountingIntegrationRequestDto addAccountingIntegrationRequestDto(@RequestBody AccountingIntegrationRequestDto accountingIntegrationRequestDto) {
		return controllerIntegrationService.addAccountingIntegrationRequestDto(accountingIntegrationRequestDto);
	}
	
	@PutMapping("/accountingIntegrationRequestDtos")
	public AccountingIntegrationRequestDto updateAccountingIntegrationRequestDto(@RequestBody AccountingIntegrationRequestDto accountingIntegrationRequestDto) {
		return controllerIntegrationService.updateAccountingIntegrationRequestDto(accountingIntegrationRequestDto);
	}
	
	@DeleteMapping("/accountingIntegrationRequestDtos/{id}")
	public void deleteAccountingIntegrationRequestDto(@PathVariable Long id) {
		controllerIntegrationService.deleteAccountingIntegrationRequestDto(id);
	}

}

getServicingUnitAddress1() {
		return servicingUnitAddress1;
	}
	public void setServicingUnitAddress1(String servicingUnitAddress1) {
		this.servicingUnitAddress1 = servicingUnitAddress1;
	}
	public String getServicingUnitAddress2() {
		return servicingUnitAddress2;
	}
	public void setServicingUnitAddress2(String servicingUnitAddress2) {
		this.servicingUnitAddress2 = servicingUnitAddress2;
	}
	public String getServicingUnitAddress3() {
		return servicingUnitAddress3;
	}
	public void setServicingUnitAddress3(String servicingUnitAddress3) {
		this.servicingUnitAddress3 = servicingUnitAddress3;
	}
	public String getServicingUnitAddress4() {
		return servicingUnitAddress4;
	}
	public void setServicingUnitAddress4(String servicingUnitAddress4) {
		this.servicingUnitAddress4 = servicingUnitAddress4;
	}
	public String getServicingUnitCity() {
		return servicingUnitCity;
	}
	public void setServicingUnitCity(String servicingUnitCity) {
		this.servicingUnitCity = servicingUnitCity;
	}
	public String getServicingUnitPinCode() {
		return servicingUnitPinCode;
	}
	public void setServicingUnitPinCode(String servicingUnitPinCode) {
		this.servicingUnitPinCode = servicingUnit