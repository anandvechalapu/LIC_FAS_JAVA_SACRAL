package com.lic.epgs.stampduty.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.stampduty.model.StampDutyNoteDetails;
import com.lic.epgs.stampduty.repository.StampDutyNoteDetailsRepository;

@Service
public class StampDutyNoteDetailsService {
    
    @Autowired
    private StampDutyNoteDetailsRepository stampDutyNoteDetailsRepository;
    
    public List<StampDutyNoteDetails> getNoteDetailsList_STAMPDUTY(Long stampId){
        return stampDutyNoteDetailsRepository.getNoteDetailsList_STAMPDUTY(stampId);
    }
}