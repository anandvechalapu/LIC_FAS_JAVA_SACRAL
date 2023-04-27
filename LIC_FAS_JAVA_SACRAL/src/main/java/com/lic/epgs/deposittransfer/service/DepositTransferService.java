package com.lic.epgs.deposittransfer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.deposittransfer.model.DepositTransfer;
import com.lic.epgs.deposittransfer.repository.DepositTransferRepository;

@Service
public class DepositTransferService {
	
	@Autowired
	private DepositTransferRepository depositTransferRepository;
	
	public DepositTransfer saveDepositTransfer(DepositTransfer depositTransfer) {
		return depositTransferRepository.save(depositTransfer);
	}
	
	public List<DepositTransfer> getAllDepositTransfers(){
		return depositTransferRepository.findAll();
	}
	
	public DepositTransfer getDepositTransferById(Long transferId) {
		return depositTransferRepository.findByTransferId(transferId);
	}
	
	public DepositTransfer getDepositTransferByTransferIdAndIsActiveTrue(Long transferId) {
		return depositTransferRepository.findByTransferIdAndIsActiveTrue(transferId);
	}
	
	public int updateTransferStatus(Long transferId, String transferStatus, String workFlowStatus) {
		return depositTransferRepository.updateTransferStatus(transferId, transferStatus, workFlowStatus);
	}
	
	public int setOldTransferInactive(Long transferId) {
		return depositTransferRepository.setOldTransferInactive(transferId);
	}
	
	public int setOldTransferNotesInactive(Long transferId) {
		return depositTransferRepository.setOldTransferNotesInactive(transferId);
	}
	
	public int updateTransferNotes(Long transferId, String transferNotes) {
		return depositTransferRepository.updateTransferNotes(transferId, transferNotes);
	}

}