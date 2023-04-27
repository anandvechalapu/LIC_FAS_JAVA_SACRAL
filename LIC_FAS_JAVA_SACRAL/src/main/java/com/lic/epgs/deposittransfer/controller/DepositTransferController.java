package com.lic.epgs.deposittransfer.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.deposittransfer.dto.ApiResponseDto;
import com.lic.epgs.deposittransfer.dto.DepositTransferDto;
import com.lic.epgs.deposittransfer.entity.DepositTransferNotesTempEntity;
import com.lic.epgs.deposittransfer.service.DepositTransferService;

@RestController
public class DepositTransferController {

	@Autowired
	private DepositTransferService depositTransferService;
	
	@PostMapping("/saveDepositTransfer")
	public ApiResponseDto saveDepositTransfer(@RequestBody DepositTransferDto depositTransferDto) {
		return depositTransferService.saveDepositTransfer(depositTransferDto);
	}
	
	@PostMapping("/updateDepositTransferTempEntity")
	public void updateDepositTransferTempEntity(String referenceNumber, String transferId) {
		depositTransferService.updateDepositTransferTempEntity(referenceNumber, transferId);
	}
	
	@PostMapping("/getDepositSeq")
	public Optional<String> getDepositSeq() {
		return depositTransferService.getDepositSeq();
	}
	
	@PostMapping("/updateDepositTransferStatus")
	public void updateDepositTransferStatus(int transferStatus, int workflowStatus, String transferId) {
		depositTransferService.updateDepositTransferStatus(transferStatus, workflowStatus, transferId);
	}
	
	@PostMapping("/saveDepositTransferNotes")
	public void saveDepositTransferNotes(@RequestBody DepositTransferNotesTempEntity depositTransferNotesTempEntity) {
		depositTransferService.saveDepositTransferNotes(depositTransferNotesTempEntity);
	}
}