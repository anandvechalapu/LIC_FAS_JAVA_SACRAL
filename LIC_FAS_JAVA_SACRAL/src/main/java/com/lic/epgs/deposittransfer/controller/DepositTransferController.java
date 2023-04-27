package com.lic.epgs.deposittransfer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.deposittransfer.model.DepositTransfer;
import com.lic.epgs.deposittransfer.service.DepositTransferService;

@RestController
@RequestMapping("/api/deposittransfer")
public class DepositTransferController {
	
	@Autowired
	private DepositTransferService depositTransferService;
	
	@PostMapping
	public DepositTransfer saveDepositTransfer(@RequestBody DepositTransfer depositTransfer) {
		return depositTransferService.saveDepositTransfer(depositTransfer);
	}
	
	@GetMapping
	public List<DepositTransfer> getAllDepositTransfers(){
		return depositTransferService.getAllDepositTransfers();
	}
	
	@GetMapping("/{transferId}")
	public DepositTransfer getDepositTransferById(@PathVariable Long transferId) {
		return depositTransferService.getDepositTransferById(transferId);
	}
	
	@GetMapping("/active/{transferId}")
	public DepositTransfer getDepositTransferByTransferIdAndIsActiveTrue(@PathVariable Long transferId) {
		return depositTransferService.getDepositTransferByTransferIdAndIsActiveTrue(transferId);
	}
	
	@PutMapping("/{transferId}")
	public int updateTransferStatus(@PathVariable Long transferId, String transferStatus, String workFlowStatus) {
		return depositTransferService.updateTransferStatus(transferId, transferStatus, workFlowStatus);
	}
	
	@PutMapping("/inactive/{transferId}")
	public int setOldTransferInactive(@PathVariable Long transferId) {
		return depositTransferService.setOldTransferInactive(transferId);
	}
	
	@PutMapping("/notes/inactive/{transferId}")
	public int setOldTransferNotesInactive(@PathVariable Long transferId) {
		return depositTransferService.setOldTransferNotesInactive(transferId);
	}
	
	@PutMapping("/notes/{transferId}")
	public int updateTransferNotes(@PathVariable Long transferId, String transferNotes) {
		return depositTransferService.updateTransferNotes(transferId, transferNotes);
	}

}