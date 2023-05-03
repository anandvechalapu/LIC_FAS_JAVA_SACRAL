package com.lic.epgs.lead.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.lead.dto.LeadChannelDetailsLeaDto;
import com.lic.epgs.lead.entity.LeadChannelDetailsLea;
import com.lic.epgs.lead.repository.LeadChannelDetailsLeaRepository;

@Service
public class LeadChannelDetailsLeaService {
	
	@Autowired
	LeadChannelDetailsLeaRepository leadChannelDetailsLeaRepository;
	
	public LeadChannelDetailsLea save(LeadChannelDetailsLea leadChannelDetailsLea) {
		return leadChannelDetailsLeaRepository.save(leadChannelDetailsLea);
	}
	
	public LeadChannelDetailsLeaDto findByMOcodeAndMOnameAndIntermediaryCodeAndIntermediaryNameAndIntermediaryContactNumberAndIntermediaryEmailAddress(String MOcode, String MOname, String intermediaryCode, String intermediaryName, String intermediaryContactNumber, String intermediaryEmailAddress) {
		return leadChannelDetailsLeaRepository.findByMOcodeAndMOnameAndIntermediaryCodeAndIntermediaryNameAndIntermediaryContactNumberAndIntermediaryEmailAddress(MOcode, MOname, intermediaryCode, intermediaryName, intermediaryContactNumber, intermediaryEmailAddress);
	}
	
	public LeadChannelDetailsLea findByIdAndActiveTrue(Long id) {
		return leadChannelDetailsLeaRepository.findByIdAndActiveTrue(id);
	}
	
	public List<LeadChannelDetailsLea> findAllByActiveTrue() {
		return leadChannelDetailsLeaRepository.findAllByActiveTrue();
	}
	
	public LeadChannelDetailsLea markAsActive(Long id) {
		return leadChannelDetailsLeaRepository.markAsActive(id);
	}
	
	public LeadChannelDetailsLea markAsInactive(Long id) {
		return leadChannelDetailsLeaRepository.markAsInactive(id);
	}
}