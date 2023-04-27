package com.lic.epgs.stampduty.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.stampduty.model.StampDutyNoteDetails;
import com.lic.epgs.stampduty.service.StampDutyNoteDetailsService;

@RestController
public class StampDutyNoteDetailsController {
    
    @Autowired
    private StampDutyNoteDetailsService stampDutyNoteDetailsService;
    
    @GetMapping("/stampduty/notedetails/{stampId}")
    public List<StampDutyNoteDetails> getNoteDetailsList_STAMPDUTY(@PathVariable Long stampId){
        return stampDutyNoteDetailsService.getNoteDetailsList_STAMPDUTY(stampId);
    }
}