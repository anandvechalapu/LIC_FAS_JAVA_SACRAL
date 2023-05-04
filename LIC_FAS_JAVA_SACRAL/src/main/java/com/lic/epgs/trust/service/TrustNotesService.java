package com.lic.epgs.trust.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.trust.model.TrustNotes;
import com.lic.epgs.trust.repository.SaveTrustNotesRepository;

@Service
public class TrustNotesService {
 
    @Autowired
    private SaveTrustNotesRepository saveTrustNotesRepository;
 
    public Optional<TrustNotes> findByTrustId(Long trustId) {
        return saveTrustNotesRepository.findByTrustId(trustId);
    }
 
    public TrustNotes saveTrustNotes(TrustNotes trustNotes) {
        return saveTrustNotesRepository.saveTrustNotes(trustNotes);
    }
 
    public TrustNotes updateTrustNotes(TrustNotes trustNotes) {
        return saveTrustNotesRepository.updateTrustNotes(trustNotes);
    }
 
    public void deleteTrustNotes(TrustNotes trustNotes) {
        saveTrustNotesRepository.deleteTrustNotes(trustNotes);
    }
}