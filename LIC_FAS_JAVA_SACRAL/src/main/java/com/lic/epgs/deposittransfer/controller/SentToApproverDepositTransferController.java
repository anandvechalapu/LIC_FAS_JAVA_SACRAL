package com.lic.epgs.deposittransfer.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.deposittransfer.model.DepositTransfer;
import com.lic.epgs.deposittransfer.service.SentToApproverDepositTransferService;

@RestController
@RequestMapping("/deposittransfer")
public class SentToApproverDepositTransferController {
	
	@Autowired
	SentToApproverDepositTransferService sentToApproverDepositTransferService;
	
	@GetMapping("/transfer/{transferId}")
	public ResponseEntity<Optional<DepositTransfer>> findByTransferId(@PathVariable Long transferId) {
		Optional<DepositTransfer> depositTransfer = sentToApproverDepositTransferService.findByTransferId(transferId);
		return new ResponseEntity<Optional<DepositTransfer>>(depositTransfer, HttpStatus.OK);
	}
	
	@PostMapping("/transfer")
	public ResponseEntity<Long> save(@RequestBody DepositTransfer depositTransfer) {
		Long transferId = sentToApproverDepositTransferService.save(depositTransfer);
		return new ResponseEntity<Long>(transferId, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/transfer/{transferId}")
	public ResponseEntity<Void> deleteByTransferId(@PathVariable Long transferId) {
		sentToApproverDepositTransferService.deleteByTransferId(transferId);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@GetMapping("/transfer/status/{transferStatus}/{workFlowStatus}")
	public ResponseEntity<List<DepositTransfer>> findByTransferStatusAndWorkFlowStatus(@PathVariable String transferStatus, @PathVariable String workFlowStatus) {
		List<DepositTransfer> depositTransferList = sentToApproverDepositTransferService.findByTransferStatusAndWorkFlowStatus(transferStatus, workFlowStatus);
		return new ResponseEntity<List<DepositTransfer>>(depositTransferList, HttpStatus.OK);
	}
	
	@GetMapping("/transfer/active/{isActive}")
	public ResponseEntity<List<DepositTransfer>> findAllByIsActive(@PathVariable Boolean isActive) {
		List<DepositTransfer> depositTransferList = sentToApproverDepositTransferService.findAllByIsActive(isActive);
		return new ResponseEntity<List<DepositTransfer>>(depositTransferList, HttpStatus.OK);
	}
	
	@GetMapping("/transfer/modified/{modifiedBy}")
	public ResponseEntity<List<DepositTransfer>> findByModifiedBy(@PathVariable String modifiedBy) {
		List<DepositTransfer> depositTransferList = sentToApproverDepositTransferService.findByModifiedBy(modifiedBy);
		return new ResponseEntity<List<DepositTransfer>>(depositTransferList, HttpStatus.OK);
	}
	
	@PutMapping("/transfer/notes/{transferId}")
	public ResponseEntity<List<DepositTransfer>> updateNotesByTransferId(@PathVariable Long transferId) {
		List<DepositTransfer> depositTransferList = sentToApproverDepositTransferService.updateNotesByTransferId(transferId);
		return new ResponseEntity<List<DepositTransfer>>(depositTransferList,