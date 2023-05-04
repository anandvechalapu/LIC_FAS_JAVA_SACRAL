package com.lic.epgs.trust.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.trust.dto.TrustDto;
import com.lic.epgs.trust.model.TrustEntity;
import com.lic.epgs.trust.service.ExistingLoadTrustSearchPageTrustManagementService;

@RestController
@RequestMapping("/trust")
public class ExistingLoadTrustSearchPageController {

	@Autowired
	private ExistingLoadTrustSearchPageTrustManagementService existingLoadTrustSearchPageTrustManagementService;
	
	@GetMapping("/{unitCode}")
	public ResponseEntity<List<TrustDto>> getTrustsByUnitCodeAndTrustStatuses(@PathVariable("unitCode") String unitCode, 
			@Valid @RequestBody List<String> trustStatuses){
		List<TrustDto> trustDtos = existingLoadTrustSearchPageTrustManagementService.findTrustsByUnitCodeAndTrustStatuses(unitCode, trustStatuses);
		return new ResponseEntity<>(trustDtos, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<TrustDto> saveTrust(@RequestBody TrustEntity trustEntity){
		TrustDto trustDto = existingLoadTrustSearchPageTrustManagementService.save(trustEntity);
		return new ResponseEntity<>(trustDto, HttpStatus.OK);
	}
	
	@GetMapping("/count/{unitCode}")
	public ResponseEntity<Long> countTrustsByUnitCodeAndTrustStatuses(@PathVariable("unitCode") String unitCode, 
			@Valid @RequestBody List<String> trustStatuses){
		Long count = existingLoadTrustSearchPageTrustManagementService.countByUnitCodeAndTrustStatusIn(unitCode, trustStatuses);
		return new ResponseEntity<>(count, HttpStatus.OK);
	}

}