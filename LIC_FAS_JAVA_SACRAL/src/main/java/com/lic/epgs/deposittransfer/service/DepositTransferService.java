package com.lic.epgs.deposittransfer.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lic.epgs.deposittransfer.dto.ApiResponseDto;
import com.lic.epgs.deposittransfer.dto.DepositTransferDto;
import com.lic.epgs.deposittransfer.entity.DepositTransferNotesTempEntity;
import com.lic.epgs.deposittransfer.entity.DepositTransferTempEntity;
import com.lic.epgs.deposittransfer.repository.DepositTransferRepository;

@Service
public class DepositTransferService {

    @Autowired
    private DepositTransferRepository depositTransferRepository;

    public ApiResponseDto saveDepositTransfer(DepositTransferDto depositTransferDto) {
        return depositTransferRepository.saveDepositTransfer(depositTransferDto);
    }

    public void updateDepositTransferTempEntity(String referenceNumber, String transferId) {
        depositTransferRepository.updateDepositTransferTempEntity(referenceNumber, transferId);
    }

    public Optional<String> getDepositSeq() {
        return depositTransferRepository.getDepositSeq();
    }

    public void updateDepositTransferStatus(int transferStatus, int workflowStatus, String transferId) {
        depositTransferRepository.updateDepositTransferStatus(transferStatus, workflowStatus, transferId);
    }

    @Transactional
    public void saveDepositTransferNotes(DepositTransferNotesTempEntity depositTransferNotesTempEntity) {
        depositTransferRepository.saveDepositTransferNotes(depositTransferNotesTempEntity);
    }
}