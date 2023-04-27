package com.lic.epgs.deposittransfer.service;

import com.lic.epgs.deposittransfer.repository.ExistingDepositNotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ExistingDepositNotesService {

    @Autowired
    private ExistingDepositNotesRepository existingDepositNotesRepository;

    public List<ExistingDepositNotes> getExistingDepositNotes_DepositTransfer(String transferId) {
        return existingDepositNotesRepository.getExistingDepositNotes_DepositTransfer(transferId);
    }
}