package com.lic.epgs.commission.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.commission.entity.Commission;
import com.lic.epgs.commission.service.SendToMaker14CommissionService;

@RestController
@RequestMapping("/api/commission")
public class SendToMaker14CommissionController {

	@Autowired
	private SendToMaker14CommissionService sendToMaker14CommissionService;
	
	@PostMapping("/sendToMaker/{commissionId}/{status}/{workflowStatus}/{modifiedBy}/{modifiedOn}/{isActive}")
	public void sendToMakerForModification(@PathVariable Long commissionId, @PathVariable String status, @PathVariable String workflowStatus, 
			@PathVariable String modifiedBy, @PathVariable Date modifiedOn, @PathVariable Boolean isActive) {
		sendToMaker14CommissionService.sendToMakerForModification(commissionId, status, workflowStatus, modifiedBy, modifiedOn, isActive);
	}
	
	@PutMapping("/status/{commissionId}/{status}/{modifiedBy}/{modifiedOn}/{isActive}")
	public void updateCommissionStatus(@PathVariable Long commissionId, @PathVariable String status, @PathVariable String modifiedBy,
			@PathVariable Date modifiedOn, @PathVariable Boolean isActive) {
		sendToMaker14CommissionService.updateCommissionStatus(commissionId, status, modifiedBy, modifiedOn, isActive);
	}
	
	@PutMapping("/workflowStatus/{commissionId}/{workflowStatus}/{modifiedBy}/{modifiedOn}/{isActive}")
	public void updateCommissionWorkflowStatus(@PathVariable Long commissionId, @PathVariable String workflowStatus, @PathVariable String modifiedBy,
			@PathVariable Date modifiedOn, @PathVariable Boolean isActive) {
		sendToMaker14CommissionService.updateCommissionWorkflowStatus(commissionId, workflowStatus, modifiedBy, modifiedOn, isActive);
	}
	
	@GetMapping("/{commissionId}/{isActive}")
	public Commission findCommissionById(@PathVariable Long commissionId, @PathVariable Boolean isActive) {
		return sendToMaker14CommissionService.findCommissionById(commissionId, isActive);
	}
	
}