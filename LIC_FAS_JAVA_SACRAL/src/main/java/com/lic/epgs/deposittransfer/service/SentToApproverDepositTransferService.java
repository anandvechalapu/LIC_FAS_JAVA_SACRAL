package com.lic.epgs.deposittransfer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.deposittransfer.model.DepositTransfer;
import com.lic.epgs.deposittransfer.repository.SentToApproverDepositTransferRepository;

@Service
public class SentToApproverDepositTransferService {

	@Autowired
	SentToApproverDepositTransferRepository sentToApproverDepositTransferRepository;
	
	public Optional<DepositTransfer> findByTransferId(Long transferId) {
		return sentToApproverDepositTransferRepository.findByTransferId(transferId);
	}
	
	public Long save(DepositTransfer depositTransfer) {
		return sentToApproverDepositTransferRepository.save(depositTransfer);
	}
	
	public void deleteByTransferId(Long transferId) {
		sentToApproverDepositTransferRepository.deleteByTransferId(transferId);
	}
	
	public List<DepositTransfer> findByTransferStatusAndWorkFlowStatus(String transferStatus, String workFlowStatus) {
		return sentToApproverDepositTransferRepository.findByTransferStatusAndWorkFlowStatus(transferStatus, workFlowStatus);
	}
	
	public List<DepositTransfer> findAllByIsActive(Boolean isActive) {
		return sentToApproverDepositTransferRepository.findAllByIsActive(isActive);
	}
	
	public List<DepositTransfer> findByModifiedBy(String modifiedBy) {
		return sentToApproverDepositTransferRepository.findByModifiedBy(modifiedBy);
	}
	
	public List<DepositTransfer> updateNotesByTransferId(Long transferId) {
		return sentToApproverDepositTransferRepository.updateNotesByTransferId(transferId);
	}

}