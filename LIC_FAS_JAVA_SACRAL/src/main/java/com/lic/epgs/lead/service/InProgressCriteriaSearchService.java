package com.lic.epgs.lead.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.lead.dto.CommonLeadDto;
import com.lic.epgs.lead.dto.LeadBasicDetailsDto;
import com.lic.epgs.lead.dto.SearchLeadDto;
import com.lic.epgs.lead.repository.InProgressCriteriaSearchRepository;

@Service
public class InProgressCriteriaSearchService {

    @Autowired
    private InProgressCriteriaSearchRepository inProgressCriteriaSearchRepository;

    public LeadBasicDetailsDto[] findLeadsByCriteriaQuery(String loginUser, SearchLeadDto searchDto) {
        return inProgressCriteriaSearchRepository.findLeadsByCriteriaQuery(loginUser, searchDto);
    }

    public LeadBasicDetailsDto[] findLeadsByValidation(String loginUser) {
        return inProgressCriteriaSearchRepository.findLeadsByValidation(loginUser);
    }

    public LeadBasicDetailsDto[] findLeadsByMakerValidation(String loginUser) {
        return inProgressCriteriaSearchRepository.findLeadsByMakerValidation(loginUser);
    }

}