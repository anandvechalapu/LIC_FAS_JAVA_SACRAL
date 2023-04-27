package com.lic.epgs.deposittransfer.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.deposittransfer.entity.DepositTransfer;
import com.lic.epgs.deposittransfer.service.SelectApproveOrReject_DepositTransferService;

@RestController
public class SelectApproveOrReject_DepositTransferController {
	
	@Autowired
	private SelectApproveOrReject_DepositTransferService selectApproveOrReject_DepositTransferService;
	
	@PostMapping("/selectApproveOrReject_DepositTransfer")
	public Optional<DepositTransfer> selectApproveOrReject_DepositTransfer(@RequestBody DepositTransfer depositTransfer){
		Optional<DepositTransfer> selectApproveOrReject_DepositTransfer = selectApproveOrReject_DepositTransferService.
				findByTransferIdAndModifiedByAndTransferStatusAndWorkflowStatus(depositTransfer.getTransferId(), 
						depositTransfer.getModifiedBy(), depositTransfer.getTransferStatus(), depositTransfer.getWorkflowStatus());
		
		if(selectApproveOrReject_DepositTransfer.isPresent()) {
			selectApproveOrReject_DepositTransferService.saveAndFlush(depositTransfer);
			selectApproveOrReject_DepositTransferService.setIsActiveFalseInDepositTransferNotesTempTable(depositTransfer.getTransferId());
		}
		
		return selectApproveOrReject_DepositTransfer;
	}

}