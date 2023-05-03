package com.lic.epgs.proposal.proposalmakercontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.proposal.proposalmakercontroller.entity.ChallanDetails;
import com.lic.epgs.proposal.proposalmakercontroller.service.SaveChallanDetailsService;

@RestController
public class SaveChallanDetailsController {

	@Autowired
	private SaveChallanDetailsService saveChallanDetailsService;
	
	@GetMapping(value = "/getChallanDetails")
	public ChallanDetails getChallanDetails(@RequestParam(name = "createdBy") String createdBy) {
		return saveChallanDetailsService.findByActiveTrueAndCreatedBy(createdBy);
	}
	
	@PostMapping(value = "/saveChallanDetails")
	public ChallanDetails saveChallanDetails(@RequestBody ChallanDetails challanDetails) {
		return saveChallanDetailsService.save(challanDetails);
	}
	
	@DeleteMapping(value = "/deleteChallanDetails")
	public void deleteChallanDetails(@RequestParam(name = "createdBy") String createdBy) {
		saveChallanDetailsService.deleteByActiveTrueAndCreatedBy(createdBy);
	}
}