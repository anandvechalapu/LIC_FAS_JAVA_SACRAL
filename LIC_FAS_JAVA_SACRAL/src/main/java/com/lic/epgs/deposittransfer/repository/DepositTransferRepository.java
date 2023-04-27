package com.lic.epgs.deposittransfer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.lic.epgs.deposittransfer.model.DepositTransfer;

public interface DepositTransferRepository extends JpaRepository<DepositTransfer, Long> {
	
	@Transactional
	@Modifying
	@Query("update DepositTransfer dt set dt.transferStatus = ?2, dt.workFlowStatus = ?3 where dt.transferId = ?1")
	public int updateTransferStatus(Long transferId, String transferStatus, String workFlowStatus);
	
	@Transactional
	@Modifying
	@Query("update DepositTransfer dt set dt.isActive = false where dt.transferId = ?1")
	public int setOldTransferInactive(Long transferId);
	
	@Transactional
	@Modifying
	@Query("update DepositTransferNotes dtn set dtn.isActive = false where dtn.depositTransfer.transferId = ?1")
	public int setOldTransferNotesInactive(Long transferId);
	
	@Transactional
	@Modifying
	@Query("update DepositTransferNotes dtn set dtn.isActive = true, dtn.transferNotes = ?2 where dtn.depositTransfer.transferId = ?1")
	public int updateTransferNotes(Long transferId, String transferNotes);
	
	public DepositTransfer findByTransferId(Long transferId);
	
	public DepositTransfer findByTransferIdAndIsActiveTrue(Long transferId);

}