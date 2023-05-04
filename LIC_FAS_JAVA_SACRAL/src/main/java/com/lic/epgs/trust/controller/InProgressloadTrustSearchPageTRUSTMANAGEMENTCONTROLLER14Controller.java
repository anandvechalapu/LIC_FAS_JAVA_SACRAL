package com.lic.epgs.trust.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.trust.model.CommonTrustDto;
import com.lic.epgs.trust.service.InProgressloadTrustSearchPageTRUSTMANAGEMENTCONTROLLER14Service;

@RestController
public class InProgressloadTrustSearchPageTRUSTMANAGEMENTCONTROLLER14Controller {
	
	@Autowired
	InProgressloadTrustSearchPageTRUSTMANAGEMENTCONTROLLER14Service inProgressloadTrustSearchPageTRUSTMANAGEMENTCONTROLLER14Service;
	
	@GetMapping("/findCommonTrustDtoByRoleAndUnitCode")
	public List<CommonTrustDto> findCommonTrustDtoByRoleAndUnitCode(@RequestParam("role") String role, @RequestParam("unitCode") String unitCode) {
		return inProgressloadTrustSearchPageTRUSTMANAGEMENTCONTROLLER14Service.findCommonTrustDtoByRoleAndUnitCode(role, unitCode);
	}
	
	@GetMapping("/findByStatusInProgressMaker")
	public List<CommonTrustDto> findByStatusInProgressMaker() {
		return inProgressloadTrustSearchPageTRUSTMANAGEMENTCONTROLLER14Service.findByStatusInProgressMaker();
	}
	
	@GetMapping("/findByStatusInProgressChecker")
	public List<CommonTrustDto> findByStatusInProgressChecker() {
		return inProgressloadTrustSearchPageTRUSTMANAGEMENTCONTROLLER14Service.findByStatusInProgressChecker();
	}
	
	@GetMapping("/findByRoleAndUnitCode")
	public List<CommonTrustDto> findByRoleAndUnitCode(@RequestParam("role") String role, @RequestParam("unitCode") String unitCode) {
		return inProgressloadTrustSearchPageTRUSTMANAGEMENTCONTROLLER14Service.findByRoleAndUnitCode(role, unitCode);
	}
	
	@GetMapping("/findByRoleAndUnitCodeAndStatusInProgressMaker")
	public List<CommonTrustDto> findByRoleAndUnitCodeAndStatusInProgressMaker(@RequestParam("role") String role, @RequestParam("unitCode") String unitCode) {
		return inProgressloadTrustSearchPageTRUSTMANAGEMENTCONTROLLER14Service.findByRoleAndUnitCodeAndStatusInProgressMaker(role, unitCode);
	}
	
	@GetMapping("/findByRoleAndUnitCodeAndStatusInProgressChecker")
	public List<CommonTrustDto> findByRoleAndUnitCodeAndStatusInProgressChecker(@RequestParam("role") String role, @RequestParam("unitCode") String unitCode) {
		return inProgressloadTrustSearchPageTRUSTMANAGEMENTCONTROLLER14Service.findByRoleAndUnitCodeAndStatusInProgressChecker(role, unitCode);
	}
}