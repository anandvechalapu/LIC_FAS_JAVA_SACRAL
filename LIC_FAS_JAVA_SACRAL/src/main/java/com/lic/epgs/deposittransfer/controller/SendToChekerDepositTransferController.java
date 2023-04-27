package com.lic.epgs.deposittransfer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.deposittransfer.entity.DepositTransfer;
import com.lic.epgs.deposittransfer.service.SendToChekerDepositTransferService;

@RestController
public class SendToChekerDepositTransferController {
	
	@Autowired
	private SendToChekerDepositTransferService sendToChekerDepositTransferService;
	
	// API endpoint to send the deposit transfer details to checker
	@PostMapping("/sendToCheker")
	public ResponseEntity<String> sendToCheker(@RequestBody DepositTransfer depositTransfer){
		sendToChekerDepositTransferService.sendToCheker(depositTransfer);
		return new ResponseEntity<String>("Deposit Transfer sent to checker successfully",HttpStatus.OK);
	}
	
	// API to validate the deposit transfer details
	@PostMapping("/validateDetails")
	public ResponseEntity<Boolean> validateDetails(@RequestBody DepositTransfer depositTransfer){
		boolean isValid = sendToChekerDepositTransferService.validateDetails(depositTransfer);
		return new ResponseEntity<Boolean>(isValid,HttpStatus.OK);
	}
	
	// API to update the status of the deposit transfer
	@PostMapping("/updateTransferStatus")
	public ResponseEntity<String> updateTransferStatus(@RequestBody DepositTransfer depositTransfer){
		sendToChekerDepositTransferService.updateTransferStatus(depositTransfer);
		return new ResponseEntity<String>("DepositTransfer status updated successfully",HttpStatus.OK);
	}
	
	// API to create a new deposit transfer record with updated details and a new transfer ID
	@PostMapping("/createNewTransferRecord")
	public ResponseEntity<String> createNewTransferRecord(@RequestBody DepositTransfer depositTransfer){
		sendToChekerDepositTransferService.createNewTransferRecord(depositTransfer);
		return new ResponseEntity<String>("New DepositTransfer record created successfully",HttpStatus.OK);
	}
	
	// API to create a new deposit transfer notes record for the updated transfer ID
	@PostMapping("/createNewTransferNotesRecord")
	public ResponseEntity<String> createNewTransferNotesRecord(@RequestBody DepositTransfer depositTransfer){
		sendToChekerDepositTransferService.createNewTransferNotesRecord(depositTransfer);
		return new ResponseEntity<String>("New DepositTransfer notes record created successfully",HttpStatus.OK);
	}
	
	// API to log any errors that occur during the process
	@GetMapping("/logErrors")
	public ResponseEntity<List<DepositTransfer>> logErrors(){
		List<DepositTransfer> depositTransfers = sendToChekerDepositTransferService.logErrors();
		return new ResponseEntity<List<DepositTransfer>>(depositTransfers,HttpStatus.OK);
	}
	
}