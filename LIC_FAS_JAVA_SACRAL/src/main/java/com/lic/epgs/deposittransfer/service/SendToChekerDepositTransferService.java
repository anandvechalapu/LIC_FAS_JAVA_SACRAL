package com.lic.epgs.deposittransfer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.deposittransfer.entity.DepositTransfer;
import com.lic.epgs.deposittransfer.repository.SendToChekerDepositTransferRepository;

@Service
public class SendToChekerDepositTransferService {
	
	@Autowired
	private SendToChekerDepositTransferRepository sendToChekerDepositTransferRepository;
	
	// API endpoint to send the deposit transfer details to checker
	public void sendToCheker(DepositTransfer depositTransfer){
		sendToChekerDepositTransferRepository.sendToCheker(depositTransfer);
	}
	
	// API to validate the deposit transfer details
	public boolean validateDetails(DepositTransfer depositTransfer){
		return sendToChekerDepositTransferRepository.validateDetails(depositTransfer);
	}
	
	// API to update the status of the deposit transfer
	public void updateTransferStatus(DepositTransfer depositTransfer){
		sendToChekerDepositTransferRepository.updateTransferStatus(depositTransfer);
	}
	
	// API to create a new deposit transfer record with updated details and a new transfer ID
	public void createNewTransferRecord(DepositTransfer depositTransfer){
	  sendToChekerDepositTransferRepository.createNewTransferRecord(depositTransfer);
	}
	
	// API to create a new deposit transfer notes record for the updated transfer ID
	public void createNewTransferNotesRecord(DepositTransfer depositTransfer){
		sendToChekerDepositTransferRepository.createNewTransferNotesRecord(depositTransfer);
	}
	
	// API to log any errors that occur during the process
	public void logErrors(DepositTransfer depositTransfer){
		sendToChekerDepositTransferRepository.logErrors(depositTransfer);
	}
	
}