package com.lic.epgs.commission.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.commission.dto.CommissionDto;
import com.lic.epgs.commission.entity.CommissionEntity;
import com.lic.epgs.commission.entity.CommissionNotesEntity;
import com.lic.epgs.commission.entity.CommissionQuestionDetailsEntity;
import com.lic.epgs.commission.entity.CommissionTempEntity;
import com.lic.epgs.commission.service.CommissionManagementService;

@RestController
@RequestMapping(value = "/commission")
public class CommissionController {

	@Autowired
	private CommissionManagementService commissionManagementService;
	
	@GetMapping("/findCommission")
	public ResponseEntity<CommissionTempEntity> findByCommissionIdAndIsActive(Long commissionId, Boolean isActive) {
		CommissionTempEntity commissionTempEntity = commissionManagementService.findByCommissionIdAndIsActive(commissionId, isActive);
		return new ResponseEntity<>(commissionTempEntity, HttpStatus.OK);
	}
	
	@PostMapping("/saveCommission")
	public ResponseEntity<CommissionEntity> saveCommission(@Valid @RequestBody CommissionEntity commissionEntity) {
		CommissionEntity commissionEntityResponse = commissionManagementService.saveCommission(commissionEntity);
		return new ResponseEntity<>(commissionEntityResponse, HttpStatus.CREATED);
	}
	
	@GetMapping("/getCommission")
	public ResponseEntity<CommissionDto> findByCommissionId(Long commissionId) {
		CommissionDto commissionDtoResponse = commissionManagementService.findByCommissionId(commissionId);
		return new ResponseEntity<>(commissionDtoResponse, HttpStatus.OK);
	}
	
	@PostMapping("/saveCommissionQuestionDetails")
	public ResponseEntity<CommissionQuestionDetailsEntity> saveCommissionQuestionDetails(@Valid @RequestBody CommissionQuestionDetailsEntity commissionQuestionDetailsEntity) {
		CommissionQuestionDetailsEntity commissionQuestionDetailsEntityResponse = commissionManagementService.saveCommissionQuestionDetails(commissionQuestionDetailsEntity);
		return new ResponseEntity<>(commissionQuestionDetailsEntityResponse, HttpStatus.CREATED);
	}
	
	@GetMapping("/findCommissionQuestionDetails")
	public ResponseEntity<List<CommissionQuestionDetailsEntity>> findByCommissionIdAndIsActive(Long commissionId, Boolean isActive) {
		List<CommissionQuestionDetailsEntity> commissionQuestionDetailsEntityList = commissionManagementService.findByCommissionIdAndIsActive(commissionId, isActive);
		return new ResponseEntity<>(commissionQuestionDetailsEntityList, HttpStatus.OK);
	}
	
	@PostMapping("/saveCommissionNotes")
	public ResponseEntity<CommissionNotesEntity> saveCommissionNotes(@Valid @RequestBody CommissionNotesEntity commissionNotesEntity) {
		CommissionNotesEntity commissionNotesEntityResponse = commissionManagementService.saveCommissionNotes(commissionNotesEntity);
		return new ResponseEntity<>(commissionNotesEntityResponse, HttpStatus.CREATED);
	}
	
	@GetMapping("/findCommissionNotes")
	public ResponseEntity<List<CommissionNotesEntity>> findByCommissionIdAndIsActive(Long commissionId, Boolean isActive) {
		List<CommissionNotesEntity> commissionNotesEntityList = commissionManagementService.findByCommissionIdAndIsActive(commissionId, isActive);
		return new ResponseEntity<>(commissionNotesEntityList, HttpStatus.OK);
	}
	
	@PutMapping("/updateCommissionStatus")
	public ResponseEntity<String> updateCommissionStatus(Long commissionId, Boolean isActive) {
		String response =