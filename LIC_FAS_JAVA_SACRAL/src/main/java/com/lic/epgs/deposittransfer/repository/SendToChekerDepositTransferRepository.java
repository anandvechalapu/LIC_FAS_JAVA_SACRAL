package com.lic.epgs.deposittransfer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lic.epgs.deposittransfer.entity.DepositTransfer;

public interface SendToChekerDepositTransferRepository extends JpaRepository<DepositTransfer, Long>{
	
	// API endpoint to send the deposit transfer details to checker
	public void sendToCheker(DepositTransfer depositTransfer);
	
	// API to validate the deposit transfer details
	public boolean validateDetails(DepositTransfer depositTransfer);
	
	// API to update the status of the deposit transfer
	public void updateTransferStatus(DepositTransfer depositTransfer);
	
	// API to create a new deposit transfer record with updated details and a new transfer ID
	public void createNewTransferRecord(DepositTransfer depositTransfer);
	
	// API to create a new deposit transfer notes record for the updated transfer ID
	public void createNewTransferNotesRecord(DepositTransfer depositTransfer);
	
	// API to log any errors that occur during the process
	public void logErrors(DepositTransfer depositTransfer);
	
}