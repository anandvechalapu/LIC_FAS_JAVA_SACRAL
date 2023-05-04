package com.lic.epgs.trust.service;

import com.lic.epgs.trust.model.ApprovalNotes;
import com.lic.epgs.trust.repository.GetApprovalNotesTrustManagementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GetApprovalNotesTrustManagementService {
    @Autowired
    private GetApprovalNotesTrustManagementRepository repository;

    public Optional<ApprovalNotes> findByTrustId(String trustId) {
        return repository.findByTrustId(trustId);
    }

    public List<ApprovalNotes> findAllByTrustId(String trustId) {
        return repository.findAllByTrustId(trustId);
    }

    public List<ApprovalNotes> findAll() {
        return repository.findAll();
    }

    public void deleteByTrustId(String trustId) {
        repository.deleteByTrustId(trustId);
    }
}