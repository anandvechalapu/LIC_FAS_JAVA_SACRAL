package com.lic.epgs.lead.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.lead.dto.LeadChannelDetailsLeaDto;
import com.lic.epgs.lead.entity.LeadChannelDetailsLea;
import com.lic.epgs.lead.service.LeadChannelDetailsLeaService;

@RestController
@RequestMapping("/leadChannelDetailsLea")
public class LeadChannelDetailsLeaController {
    
    @Autowired
    LeadChannelDetailsLeaService leadChannelDetailsLeaService;
    
    @PostMapping
    public LeadChannelDetailsLea save(@RequestBody LeadChannelDetailsLea leadChannelDetailsLea) {
        return leadChannelDetailsLeaService.save(leadChannelDetailsLea);
    }
    
    @GetMapping("/{MOcode}/{MOname}/{intermediaryCode}/{intermediaryName}/{intermediaryContactNumber}/{intermediaryEmailAddress}")
    public LeadChannelDetailsLeaDto findByMOcodeAndMOnameAndIntermediaryCodeAndIntermediaryNameAndIntermediaryContactNumberAndIntermediaryEmailAddress(@PathVariable String MOcode, @PathVariable String MOname,
                                                                                                                                               @PathVariable String intermediaryCode, @PathVariable String intermediaryName,
                                                                                                                                               @PathVariable String intermediaryContactNumber, @PathVariable String intermediaryEmailAddress) {
        return leadChannelDetailsLeaService.findByMOcodeAndMOnameAndIntermediaryCodeAndIntermediaryNameAndIntermediaryContactNumberAndIntermediaryEmailAddress(MOcode, MOname, intermediaryCode, intermediaryName, intermediaryContactNumber, intermediaryEmailAddress);
    }
    
    @GetMapping("/{id}")
    public LeadChannelDetailsLea findByIdAndActiveTrue(@PathVariable Long id) {
        return leadChannelDetailsLeaService.findByIdAndActiveTrue(id);
    }
    
    @GetMapping
    public List<LeadChannelDetailsLea> findAllByActiveTrue() {
        return leadChannelDetailsLeaService.findAllByActiveTrue();
    }
    
    @PutMapping("/activate/{id}")
    public LeadChannelDetailsLea markAsActive(@PathVariable Long id) {
        return leadChannelDetailsLeaService.markAsActive(id);
    }
    
    @PutMapping("/inactivate/{id}")
    public LeadChannelDetailsLea markAsInactive(@PathVariable Long id) {
        return leadChannelDetailsLeaService.markAsInactive(id);
    }
    
}