package com.lic.epgs.stampduty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.stampduty.model.StampDutyTempModel;
import com.lic.epgs.stampduty.service.SaveStampDutyBasicDetailsService;

@RestController
@RequestMapping("/stampduty/")
public class StampDutyController {

	@Autowired
	private SaveStampDutyBasicDetailsService saveStampDutyBasicDetailsService;

	@GetMapping("/stampId/{stampId}")
	public ResponseEntity<StampDutyTempModel> getStampDutyByStampId(@PathVariable Long stampId) {
		StampDutyTempModel stampDutyTempModel = saveStampDutyBasicDetailsService.findByStampId(stampId);
		if (stampDutyTempModel != null) {
			return new ResponseEntity<>(stampDutyTempModel, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/policyStampTypeId/{policyStampTypeId}")
	public ResponseEntity<StampDutyTempModel> getStampDutyByPolicyStampTypeId(@PathVariable Long policyStampTypeId) {
		StampDutyTempModel stampDutyTempModel = saveStampDutyBasicDetailsService.findByPolicyStampTypeId(policyStampTypeId);
		if (stampDutyTempModel != null) {
			return new ResponseEntity<>(stampDutyTempModel, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/mstStampId/{mstStampId}")
	public ResponseEntity<StampDutyTempModel> getStampDutyByMstStampId(@PathVariable Long mstStampId) {
		StampDutyTempModel stampDutyTempModel = saveStampDutyBasicDetailsService.findByMstStampId(mstStampId);
		if (stampDutyTempModel != null) {
			return new ResponseEntity<>(stampDutyTempModel, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/challanGrnNo/{challanGrnNo}")
	public ResponseEntity<StampDutyTempModel> getStampDutyByChallanGrnNo(@PathVariable String challanGrnNo) {
		StampDutyTempModel stampDutyTempModel = saveStampDutyBasicDetailsService.findByChallanGrnNo(challanGrnNo);
		if (stampDutyTempModel != null) {
			return new ResponseEntity<>(stampDutyTempModel, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/certificateQueryIdNo/{certificateQueryIdNo}")
	public ResponseEntity<StampDutyTempModel> getStampDutyByCertificateQueryIdNo(@PathVariable String certificateQueryIdNo) {
		StampDutyTempModel stampDutyTempModel = saveStampDutyBasicDetailsService.findByCertificateQueryIdNo(certificateQueryIdNo);
		if (stampDutyTempModel != null) {
			return new ResponseEntity<>(stampDutyTempModel, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(