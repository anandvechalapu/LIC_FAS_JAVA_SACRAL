package com.lic.epgs.deposittransfer.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.deposittransfer.entity.DepositTransfer;
import com.lic.epgs.deposittransfer.repository.SelectApproveOrReject_DepositTransferRepository;

@Service
public class SelectApproveOrReject_DepositTransferService {

	@Autowired
	private SelectApproveOrReject_DepositTransferRepository selectApproveOrReject_DepositTransferRepository;

	public Optional<DepositTransfer> findByTransferIdAndModifiedByAndTransferStatusAndWorkflowStatus(Long transferId,
			Long modifiedBy, String transferStatus, String workflowStatus) {
		return selectApproveOrReject_DepositTransferRepository
				.findByTransferIdAndModifiedByAndTransferStatusAndWorkflowStatus(transferId, modifiedBy, transferStatus,
						workflowStatus);
	}

	public void saveAndFlush(DepositTransfer depositTransfer) {
		selectApproveOrReject_DepositTransferRepository.saveAndFlush(depositTransfer);
	}

	public void setIsActiveFalseInDepositTransferNotesTempTable(Long transferId) {
		selectApproveOrReject_DepositTransferRepository.setIsActiveFalseInDepositTransferNotesTempTable(transferId);
	}

}